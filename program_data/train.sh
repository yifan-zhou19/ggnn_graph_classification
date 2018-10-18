lang=${1:-cpp}
MEMORY=256G
BATCH_SIZE=128
in=github_"$lang"_protobuf_format_Oct-15-2018
out=${in/protobuf/babi}-00000${2:-24}
n=${3:-50}
cd .. > /dev/null
run program_data/$out $n 300 8
cd - > /dev/null
