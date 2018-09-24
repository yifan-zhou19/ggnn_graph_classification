mkdir -p cpp_babi_format/train cpp_babi_format/test
mkdir -p cpp_protobuf_format
for index in {1..104}; do
    if [ ! -f cpp_protobuf_format/$index.fbs ]; then
	    fast -S -G CppProgramData/$index cpp_protobuf_format/$index.fbs
    fi
    ggnn $MAPS cpp_protobuf_format/$index.fbs cpp_babi_format/train/train_$index.txt cpp_babi_format/test/test_$index.txt
done
