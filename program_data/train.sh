lang=${1:-cpp}
MEMORY=256G
BATCH_SIZE=128
in=github_"$lang"_protobuf_format_Oct-15-2018
out=${in/protobuf/babi}-00000${2:-24}
n=${3:-50}
cd $out > /dev/null
k=$(docker run -v $(pwd):/e --entrypoint /opt/bin/maps -it yijun/fast:built --lang $lang | sort -n | wc -l)
cd - > /dev/null
cd .. > /dev/null
run program_data/$out $((k-1)) $n 300 8
cd - > /dev/null
