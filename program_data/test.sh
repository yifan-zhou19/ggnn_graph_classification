#docker build -t progress ../progress
function size_voc() {
	cd $1 > /dev/null
        lang=$(ls maps.*.pkl)
        lang=${lang/maps./}
        lang=${lang/.pkl/}
	k=$(docker run -v $(pwd):/e --entrypoint /opt/bin/maps -it yijun/fast:built --lang $lang | sort -n | wc -l)
	cd - > /dev/null
	echo $((k-1))
}
function mll_test() {
   echo === MLL $1 $2 $(($3+1)) ===
	lang1=$1
	n=$2
	k=$(size_voc $lang1)
		NV_GPU=0 \
	  /usr/bin/time -f %e \
	  nvidia-docker run -v $(dirname $(pwd)):/e -w /e --shm-size 11G --rm -it progress \
	  python main_ggnn.py \
		--cuda \
		--testing --epoch $3\
		--n_classes $n \
		--directory  program_data/$lang1 \
		--model_path program_data/$lang1/$n.cpkl \
		--state_dim 5 \
		--n_steps 5 \
		--n_hidden 50 \
		--niter 1 \
		--size_vocabulary $k \
		--train_batch_size 32 \
		--test_batch_size 32
}
function cll_test() {
   echo === CLL $1 $2 $(($3+1)) ===
	lang1=$1
	lang2=cll_${lang1/cpp/java}
	n=$2
	k=$(size_voc $lang1)
	log=$lang1/cll-log-$n.txt
	if [ ! -f $log ]; then
	 mkdir -p $(dirname $log)
	 mkdir -p $(dirname $log)/logs
	 chmod o+w $(dirname $log)/logs
	 touch -f $log
	fi
		NV_GPU=0 \
	  /usr/bin/time -f %e \
	  nvidia-docker run -v $(dirname $(pwd)):/e -w /e --shm-size 11G --rm -it progress \
	  python main_biggnn.py \
		--cuda \
		--testing --epoch $3\
		--n_classes $n \
		--left_directory  program_data/$lang1 \
		--right_directory program_data/$lang2 \
		--model_path program_data/$lang1/cll-$n.cpkl \
		--state_dim 5 \
		--n_steps 5 \
		--n_hidden 50 \
		--niter 1 \
		--size_vocabulary $k \
		--train_batch_size 32 \
		--test_batch_size 32
}
function test() {
   n=$1
   folder=$2
   if [ -f $folder/$n.cpkl ]; then
    m=$(ls $folder/$n.cpkl.* | cut -d"." -f3 | sort -n | tail -1)
    if [ "$m" != "" ]; then
       mll_test $folder $n $m
    fi
   fi
   if [ -f $folder/cll-$n.cpkl ]; then
    m=$(ls $folder/cll-$n.cpkl.* | cut -d"." -f3 | sort -n | tail -1)
    if [ "$m" != "" ]; then
       echo cll_test $folder $n $m
    fi
   fi
   folder=${folder/cpp/java}
   if [ -f $folder/$n.cpkl ]; then
    m=$(ls $folder/$n.cpkl.* | cut -d"." -f3 | sort -n | tail -1)
    if [ "$m" != "" ]; then
       echo mll_test $folder $n $m
    fi
   fi
}
for n in 104 50 25 10; do
   test $n cpp_babi_format_Oct-10-2018-0000028 | tee -a status.log
done
for n in 50 30 10; do
   test $n github_cpp_babi_format_Oct-10-2018-0000028 | tee -a status.log
done
