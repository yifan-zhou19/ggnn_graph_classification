rm -f $0.log
tag=${1:-Oct-10-2018}
fbs.sh cpp_protobuf_format_$tag CppProgramData | tee $0.log
fbs.sh java_protobuf_format_$tag JavaProgramData | tee $0.log
f=ggnn/ggnn-${2:-0000023}.py
cp $f ggnn/ggnn.py
g=${f/*-/}
g=${g/.py/}
echo $g
babi.sh cpp_protobuf_format_$tag $g | tee $0.log
babi.sh java_protobuf_format_$tag $g | tee $0.log
