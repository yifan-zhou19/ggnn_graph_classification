input=CppProgramData
in=${1:-cpp_protobuf_format_correct}
out=${in/protobuf/babi}$2
mkdir -p $out/train $out/test
mkdir -p $in
chmod a+wx $in $out/train $out/test
rm -f maps.cpp.pkl
rm -f maps.pkl
for index in {1..10}; do
    if [ ! -f $in/$index.fbs ]; then
	    fast -S -G $input/$index $in/$index.fbs
    fi
    ggnn $in/$index.fbs $out/train/train_$index.txt $out/test/test_$index.txt # > $index.log
done
mv maps.cpp.pkl $out
mv maps.pkl $out
docker run -v $(pwd)/$out:/e --entrypoint bash -it ggnn -c "cp /usr/local/bin/ggnn /e/ggnn.py"
cp $0 $out
