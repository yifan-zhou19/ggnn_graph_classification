tag=${1:-Oct-10-2018}
ver=${2:-28}
gen.sh $tag 00000$ver
prepare_dataset.sh $tag-00000$ver
