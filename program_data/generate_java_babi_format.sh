mkdir -p java_babi_format/train java_babi_format/test
mkdir -p java_protobuf_format
for index in {1..104}; do
    if [ ! -f java_protobuf_format/$index.fbs ]; then
	    if [ -d JavaProgramData/$index ]; then
		    fast -S -G JavaProgramData/$index java_protobuf_format/$index.fbs
	    fi
    fi
    if [ -f java_protobuf_format/$index.fbs ]; then
	    ggnn $MAPS java_protobuf_format/$index.fbs java_babi_format/train/train_$index.txt java_babi_format/test/test_$index.txt
    fi
done
