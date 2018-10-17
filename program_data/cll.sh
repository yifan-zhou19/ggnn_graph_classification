in=github_cpp_protobuf_format_Oct-15-2018
out=${in/protobuf/babi}-00000${1:-24}
out2=cll_${out/cpp/java}
n=${2:-50}
cd .. > /dev/null
        NV_GPU=0 \
	MEMORY=256G \
	N_CLASSES=$n \
	BATCH_SIZE=256 \
	STATE_DIM=5 \
	N_HIDDEN=50 \
	bi-run program_data/$out program_data/$out2 172 5
cd - > /dev/null
