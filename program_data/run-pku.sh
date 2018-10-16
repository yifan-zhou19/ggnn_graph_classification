tag=${1:-Oct-10-2018}
ver=${2:-23}
gen-pku.sh $tag 00000$ver
prepare_dataset-pku.sh $tag-00000$ver
#train.sh cpp 128 512 $ver
#train.sh java 128 512 $ver
cll-pku.sh
