mkdir -p babi_format
mkdir -p protobuf_format
rm -f maps.pkl
#for index in {1..104}; do
for index in {3..104}; do
    if [ ! -f protobuf_format/$index.fbs ]; then
	    fast -S -G ProgramData/$index protobuf_format/$index.fbs
    fi
    ggnn protobuf_format/$index.fbs babi_format/train/train_$index.txt babi_format/test/test_$index.txt
done
