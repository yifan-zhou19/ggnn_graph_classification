tag=${1:-Oct-10-2018}
ver=${2:-0000020}
gen.sh $tag $ver
prepare_dataset.sh $tag-$ver
