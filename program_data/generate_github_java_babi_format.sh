mkdir -p github_java_babi_format/train github_java_babi_format/test
mkdir -p github_java_protobuf_format
for index in {1..10}; do
    if [ ! -f github_java_protobuf_format/$index.fbs ]; then
	    fast -S -G github_java_program_data/$index github_java_protobuf_format/$index.fbs
    fi
    ggnn --maps github_java_protobuf_format/$index.fbs github_java_babi_format/train/train_$index.txt github_java_babi_format/test/test_$index.txt
done
