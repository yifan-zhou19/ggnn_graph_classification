lang=cpp
n=10
#directory=program_data/"$lang"_babi_format_new_dedup
directory=$1
rm -f $directory-$n.pkl
model=model/$(basename $directory)-$n.cpkl
rm -f $model
log=$(basename $directory)-log-$n.txt
rm -f $log
docker build -t progress progress
/usr/bin/time -f %e \
  nvidia-docker run -v $(pwd):/e -w /e --shm-size 8G --rm -it progress \
  python main_ggnn.py \
	--cuda \
	--training \
	--model_path $model --directory $directory \
	--n_classes $n \
	--n_steps 10 \
	--n_hidden 50 \
	--niter 1 \
	--size_vocabulary 48 \
	--train_batch_size 32 \
  | tee $log
grep Test $log | cut -f8 -d" " | sort -n
