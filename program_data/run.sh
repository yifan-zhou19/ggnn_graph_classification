tag=${1:-Oct-15-2018}
ver=${2:-24}
gen.sh $tag 00000$ver
prepare_dataset.sh $tag-00000$ver
train.sh cpp 128 512 $ver
train.sh java 128 512 $ver
cll.sh
