rm -f $0.log
tag=${1:-Oct-10-2018}
fbs.sh github_cpp_protobuf_format_$tag github_cpp_program_data | tee $0.log
fbs.sh github_java_protobuf_format_$tag github_java_program_data | tee $0.log
f=ggnn/ggnn-${2:-0000028}.py
cp $f ggnn/ggnn.py
g=${f/*-/}
g=${g/.py/}
echo $g
babi.sh github_cpp_protobuf_format_$tag $g | tee $0.log
babi.sh github_java_protobuf_format_$tag $g | tee $0.log
