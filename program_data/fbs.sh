in=${1:-github_cpp_protobuf_format}
input=${2:-CppProgramData}
mkdir -p $in
chmod -R o+w $in
for f in $input/*; do
    i=$(basename $f)
    echo $i
    if [ ! -f $in/$i.fbs ]; then
	fast.sh -v > $in/fast.version
	fast.sh -S -G $input/$i $in/$i.fbs
    fi
done
