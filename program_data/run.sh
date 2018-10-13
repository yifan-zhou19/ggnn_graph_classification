tag=${1:-Oct-10-2018}
ver=${2:-0000023}
gen.sh $tag $ver
prepare_dataset.sh $tag-$ver
train.sh github_cpp_protobuf_format_$tag $ver
train.sh github_java_protobuf_format_$tag $ver
