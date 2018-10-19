lang=${1:-cpp}
MEMORY=256G
BATCH_SIZE=128
in="$lang"_protobuf_format_Oct-10-2018
out=${in/protobuf/babi}-00000${2:-28}
n=${3:-104}
cd $out > /dev/null
k=$(docker run -v $(pwd):/e --entrypoint /opt/bin/maps -it yijun/fast:built --lang $lang | sort -n | wc -l)
cd - > /dev/null
cd .. > /dev/null
run program_data/$out $((k-1)) $n 200 8
cd - > /dev/null
