epoch=${1:-0}
lang=${2:-cpp}
in=github_"$lang"_protobuf_format_Oct-15-2018
out=${in/protobuf/babi}-00000${3:-23}
cd $out > /dev/null
k=$(docker run -v $(pwd):/e --entrypoint /opt/bin/maps -it yijun/fast:built --lang $lang | sort -n | wc -l)
cd - > /dev/null
rm -f $out/$out-$N_CLASSES.cpkl
cd .. > /dev/null
echo NV_GPU=1 ./test program_data/$out $epoch 
	MEMORY=256G \
	TRAIN_SIZE=128 \
	VOCABULARY_SIZE=$((k-1)) \
	N_CLASSES=50 \
	N_ITER=150 \
	N_STEPS=8 \
	N_STATEDIM=10 \
	N_HIDDEN=50 \
NV_GPU=0 ./test program_data/$out $epoch 
cd - > /dev/null
