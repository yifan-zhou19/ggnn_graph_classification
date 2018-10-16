MEMORY=${1:-256G}
TRAIN_SIZE=${2:-128}
in=${3:-github_cpp_protobuf_format_Oct-15-2018}
out=${in/protobuf/babi}-00000${4:-24}
out2=cll_${out/cpp/java}
cd .. > /dev/null
	TRAIN_SIZE=64 \
	NV_GPU="0,1" \
        N_ITER=300 \
	bi-test program_data/$out program_data/$out2 0 172 8
cd - > /dev/null
