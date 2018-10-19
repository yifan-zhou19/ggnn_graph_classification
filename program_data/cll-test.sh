in=github_cpp_protobuf_format_Oct-15-2018
out=${in/protobuf/babi}-00000${1:-24}
out2=cll_${out/cpp/java}
cd .. > /dev/null
        MEMORY=256G \
        BATCH_SIZE=3 \
        N_ITER=1 \
	N_CLASSES=$2 \
        EPOCH=${3:-0} \
	bi-test program_data/$out program_data/$out2 8
cd - > /dev/null
