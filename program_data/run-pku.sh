tag=${1:-Oct-15-2018}
ver=${2:-24}
gen-pku.sh $tag 00000$ver
prepare_dataset-pku.sh $tag-00000$ver
train-pku.sh cpp 128 512 $ver
train-pku.sh java 128 512 $ver
cll-pku.sh
