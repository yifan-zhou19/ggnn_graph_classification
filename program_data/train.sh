lang=${1:-cpp}
in=github_"$lang"_protobuf_format_Oct-15-2018
out=${in/protobuf/babi}-00000${2:-23}
cd $out > /dev/null
k=$(docker run -v $(pwd):/e --entrypoint /opt/bin/maps -it yijun/fast:built --lang $lang | sort -n | wc -l)
cd - > /dev/null
rm -f $out/$out-$N_CLASSES.cpkl
cd .. > /dev/null
	MEMORY=256G \
	TRAIN_SIZE=128 \
	VOCABULARY_SIZE=$((k-1)) \
	N_CLASSES=50 \
	N_ITER=150 \
	N_STEPS=8 \
	N_STATEDIM=10 \
	N_HIDDEN=50 \
NV_GPU=1 run program_data/$out
cd - > /dev/null
