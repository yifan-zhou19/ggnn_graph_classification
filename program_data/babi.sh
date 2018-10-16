in=${1:-github_cpp_protobuf_format_Oct-15-2018}
out=${in/protobuf/babi}-$2
cp ggnn/ggnn-$2.py ggnn/ggnn.py
mkdir -p $out/train $out/test
chmod -R a+w $out
for f in $in/*.fbs; do
  i=$(basename $f)
  i=${i/.fbs/}
  if [ ! -f $out/train/$i.txt -o ! -f $out/test/$i.txt ]; then
    ./ggnn.sh $in/$i.fbs $out/train/$i.txt $out/test/$i.txt $out
  fi
done
docker run -v $(pwd)/$out:/e --entrypoint bash -it ggnn -c "cp /usr/local/bin/ggnn /e/ggnn.py"
cp $0 $out
