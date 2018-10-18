in=github_cpp_protobuf_format_Oct-15-2018
out=${in/protobuf/babi}-00000${1:-24}
cd .. > /dev/null
        NV_GPU=1 MEMORY=256G \
        BATCH_SIZE=512 \
        N_ITER=1 \
	N_CLASSES=50 \
        EPOCH=${2:-0} \
        STEP_SIZE=8 \
	./test program_data/$out 
cd - > /dev/null
