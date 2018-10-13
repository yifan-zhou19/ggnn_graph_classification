lang=${1:-cpp}
MEMORY=${2:-256G}
TRAIN_SIZE=${3:-128}
in=${4:-github_"$lang"_protobuf_format_Oct-10-2018}
out=${in/protobuf/babi}-00000${5:-23}
cd $out > /dev/null
k=$(docker run -v $(pwd):/e --entrypoint /opt/bin/maps -it yijun/fast:built --lang $lang | sort -n | wc -l)
cd - > /dev/null
cd .. > /dev/null
run program_data/$out $((k-1)) 29 150 8
cd - > /dev/null
