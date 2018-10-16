lang=${1:-cpp}
in=github_"$lang"_protobuf_format_Oct-10-2018
out=${in/protobuf/babi}-00000${2:-23}
cd $out > /dev/null
k=$(docker run -v $(pwd):/e --entrypoint /opt/bin/maps -it yijun/fast:built --lang $lang | sort -n | wc -l)
cd - > /dev/null
N_CLASSES=104
rm -f $out/$out-$N_CLASSES.cpkl
cd .. > /dev/null
	MEMORY=256G \
	TRAIN_SIZE=64 \
	VOCABULARY_SIZE=$((k-1)) \
	N_CLASSES=$N_CLASSES \
	N_ITER=300 \
	N_STEPS=8 \
	N_STATEDIM=10 \
	N_HIDDEN=50 \
NV_GPU=1 run program_data/$out
cd - > /dev/null
