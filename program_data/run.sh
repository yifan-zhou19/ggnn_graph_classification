tag=${1:-Oct-10-2018}
ver=${2:-28}
gen.sh $tag 00000$ver
prepare_dataset.sh $tag-00000$ver
train.sh cpp 128 512 $ver
train.sh java 128 512 $ver
cll.sh
