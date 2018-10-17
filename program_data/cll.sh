in=github_cpp_protobuf_format_Oct-15-2018
out=${in/protobuf/babi}-00000${1:-27}
out2=cll_${out/cpp/java}
cd .. > /dev/null
        NV_GPU=0 \
	MEMORY=256G \
	N_CLASSES=50 \
	BATCH_SIZE=128 \
	STATE_DIM=10 \
	N_HIDDEN=100 \
	bi-run program_data/$out program_data/$out2 172 8
cd - > /dev/null
