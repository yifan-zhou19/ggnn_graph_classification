mkdir -p cpp_babi_format/train cpp_babi_format/test
mkdir -p cpp_protobuf_format
<<<<<<< HEAD
rm -f maps.cpp.pkl
for index in {1..104}; do
    if [ ! -f cpp_protobuf_format/$index.fbs ]; then
	    fast -S -G CppProgramData/$index cpp_protobuf_format/$index.fbs
    fi
    ggnn cpp_protobuf_format/$index.fbs cpp_babi_format/train/train_$index.txt cpp_babi_format/test/test_$index.txt
=======
chmod a+wx cpp_protobuf_format cpp_babi_format/train cpp_babi_format/test
rm -f maps.cpp.pkl
for index in {1..10}; do
#    if [ ! -f cpp_protobuf_format/$index.fbs ]; then
#	    fast -S -G CppProgramData/$index cpp_protobuf_format/$index.fbs
#    fi
    ggnn cpp_protobuf_format/$index.fbs cpp_babi_format/train/train_$index.txt cpp_babi_format/test/test_$index.txt # > $index.log
>>>>>>> 8194f5a58412850b059d846f82c9e1cbfe931118
done
