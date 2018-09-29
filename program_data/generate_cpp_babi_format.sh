babi_folder="cpp_babi_format_2"
protobuf_folder="cpp_protobuf_format_2"
mkdir -p $babi_folder/train $babi_folder/test
mkdir -p $protobuf_folder
for index in {1..104}; do
    if [ ! -f $protobuf_folder/$index.fbs ]; then
	    docker run -v $(pwd):/e -it yijun/fast -S -G CppProgramData/$index $protobuf_folder/$index.fbs
    fi
    docker run -v $(pwd):/e --entrypoint ggnn $MAPS $protobuf_folder/$index.fbs $babi_folder/train/train_$index.txt $babi_folder/test/test_$index.txt
done
