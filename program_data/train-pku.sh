lang=${1:-cpp}
in="$lang"_protobuf_format_Oct-10-2018-0000028
lang1=${in/protobuf/babi}
n=${2:-104}
docker build -t progress ../progress
log=$lang1/log-$n.txt
mkdir -p model
if [ ! -f $log ]; then
 mkdir -p $(dirname $log)
 mkdir -p $(dirname $log)/logs
 chmod o+w $(dirname $log)/logs
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
	--log_path program_data/$lang1/logs \
        --state_dim 5 \
	--n_steps 5 \
	--n_hidden 50 \
	--niter 200 \
	--size_vocabulary 197 \
	--train_batch_size 32 \
	--test_batch_size 32 \
  | tee -a $log
