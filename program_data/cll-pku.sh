in=cpp_protobuf_format_Oct-10-2018
out=${in/protobuf/babi}-00000${1:-28}
out2=cll_${out/cpp/java}
n=${2:-104}
cd .. > /dev/null
        NV_GPU=0 \
	MEMORY=256G \
	N_CLASSES=$n \
	BATCH_SIZE=128 \
	STATE_DIM=5 \
	N_HIDDEN=30 \
	N_ITER=200 \
	bi-run program_data/$out program_data/$out2 197 5
cd - > /dev/null
