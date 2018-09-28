input=CppProgramData
in=cpp_protobuf_format_localmap_10
out=cpp_babi_format_localmap_10
mkdir -p $out/train $out/test
mkdir -p $in
chmod a+wx $in $out/train $out/test
rm -f maps.cpp.pkl
for index in {1..10}; do
    if [ ! -f $in/$index.fbs ]; then
	    fast -S -G $input/$index $in/$index.fbs
    fi
    ggnn $in/$index.fbs $out/train/train_$index.txt $out/test/test_$index.txt # > $index.log
done
