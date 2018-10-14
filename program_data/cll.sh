MEMORY=${1:-256G}
TRAIN_SIZE=${2:-128}
in=${3:-github_cpp_protobuf_format_Oct-10-2018}
out=${in/protobuf/babi}-00000${4:-24}
out2=${out/cpp/java}
cd $out > /dev/null
k1=$(docker run -v $(pwd):/e --entrypoint /opt/bin/maps -it yijun/fast:built --lang cpp | sort -n | wc -l)
cd - > /dev/null
cd $out > /dev/null
k2=$(docker run -v $(pwd):/e --entrypoint /opt/bin/maps -it yijun/fast:built --lang java | sort -n | wc -l)
cd - > /dev/null
cd .. > /dev/null
echo bi-run program_data/$out program_data/$out2 $((k1 + k2 -1)) 8
bi-run program_data/$out program_data/$out2 $((k1 + k2 -1)) 8
cd - > /dev/null
