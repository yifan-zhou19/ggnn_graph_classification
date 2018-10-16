MEMORY=${1:-256G}
TRAIN_SIZE=${2:-128}
in=${3:-cpp_protobuf_format_Oct-10-2018}
out=${in/protobuf/babi}-00000${4:-23}
out2=cll_${out/cpp/java}
chmod o+w $out/logs
cd .. > /dev/null
NV_GPU="0,1" MEMORY=128GB TRAIN_SIZE=64 N_HIDDEN=50 N_ITER=300 LOSS=1 bi-run program_data/$out program_data/$out2 197 8
cd - > /dev/null
