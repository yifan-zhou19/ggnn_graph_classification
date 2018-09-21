mkdir -p github_cpp_babi_format
mkdir -p github_cpp_protobuf_format
for index in {1..10}; do
    if [ ! -f github_cpp_protobuf_format/$index.fbs ]; then
	    fast -S -G github_cpp_program_data/$index github_cpp_protobuf_format/$index.fbs
    fi
    ggnn github_cpp_protobuf_format/$index.fbs github_cpp_babi_format/train/train_$index.txt github_cpp_babi_format/test/test_$index.txt
done
