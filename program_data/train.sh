docker build -t progress ../progress
function size_voc() {
	cd $1 > /dev/null
        lang=$(ls maps.*.pkl)
        lang=${lang/maps./}
        lang=${lang/.pkl/}
	k=$(docker run -v $(pwd):/e --entrypoint /opt/bin/maps -it yijun/fast:built --lang $lang | sort -n | wc -l)
	cd - > /dev/null
	echo $((k-1))
}

function mll_train() {
lang1=$1
lang2=${1/java/cpp}
if [ "$lang1" == "$lang2" ]; then
   lang=cpp
else
   lang=java
fi
n=${2:-104}
k=$(size_voc $lang1)
log=$lang1/log-$n.txt
if [ -f program_data/$lang1/$n.cpkl ]; then
   return
fi
if [ ! -f $log ]; then
 mkdir -p $(dirname $log)
 mkdir -p $(dirname $log)/logs/$lang/$n
 chmod o+w $(dirname $log)/logs/$lang/$n
 touch -f $log
fi
        NV_GPU=1 \
  /usr/bin/time -f %e \
  nvidia-docker run -v $(dirname $(pwd)):/e -w /e --shm-size 11G --rm -it progress \
  python main_ggnn.py \
	--cuda \
	--training \
	--n_classes $n \
        --directory  program_data/$lang1 \
	--model_path program_data/$lang1/$n.cpkl \
	--log_path program_data/$lang2/logs/$lang/$n \
        --state_dim 5 \
	--n_steps 5 \
	--n_hidden 50 \
	--niter 200 \
	--size_vocabulary $k \
	--train_batch_size 32 \
	--test_batch_size 32 \
  | tee -a $log
}

function cll_train() {
lang1=$1
lang2=cll_${lang1/cpp/java}
k=$(size_voc $lang1)
n=${2:-104}
docker build -t progress ../progress
log=$lang1/cll-log-$n.txt
if [ -f program_data/$lang1/cll-$n.cpkl ]; then
   return
fi
if [ ! -f $log ]; then
 mkdir -p $(dirname $log)
 mkdir -p $(dirname $log)/logs/biggnn/$n
 chmod o+w $(dirname $log)/logs
 touch -f $log
fi
        NV_GPU=0 \
  /usr/bin/time -f %e \
  nvidia-docker run -v $(dirname $(pwd)):/e -w /e --shm-size 11G --rm -it progress \
  python main_biggnn.py \
	--cuda \
	--training \
	--n_classes $n \
        --left_directory  program_data/$lang1 \
        --right_directory program_data/$lang2 \
	--model_path program_data/$lang1/cll-$n.cpkl \
	--log_path program_data/$lang1/logs/biggnn/$n \
        --state_dim 5 \
	--n_steps 5 \
	--n_hidden 50 \
	--niter 200 \
	--size_vocabulary $k \
	--train_batch_size 32 \
	--test_batch_size 32 \
  | tee -a $log
}

function train() {
   n=$1
   folder=$2
   mll_train $folder $n
   cll_train $folder $n
   folder=${folder/cpp/java}
   mll_train $folder $n
}

for n in 104 50 25 10; do
   train $n cpp_babi_format_Oct-10-2018-0000028 | tee -a status.log
done
for n in 50 30 10; do
   train $n github_cpp_babi_format_Oct-10-2018-0000028 | tee -a status.log
done
