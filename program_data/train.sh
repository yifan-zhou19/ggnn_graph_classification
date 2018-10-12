in=${1:-github_cpp_protobuf_format_Oct-10-2018}
out=${in/protobuf/babi}-${2:-0000020}
cd $out > /dev/null
k=$(dmap | sort -n | wc -l)
cd - > /dev/null
cd .. > /dev/null
if [ "$k" == "1" ]; then
   k=4866
fi
run program_data/$out $((k-1)) 29 10 8
cd - > /dev/null
