lang=${1:-cpp}
MEMORY=256G
TRAIN_SIZE=32
in="$lang"_protobuf_format_Oct-15-2018
out=${in/protobuf/babi}-00000${2:-23}
n=${3:-104}
cd .. > /dev/null
	TRAIN_SIZE=32 \
	run program_data/$out $n 300 8
cd - > /dev/null
