tag=${1:-Oct-15-2018}
ver=${2:-23}
gen.sh $tag 00000$ver
prepare_dataset.sh $tag-00000$ver
train.sh cpp $ver
train.sh java $ver
cll.sh
