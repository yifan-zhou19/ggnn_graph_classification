in=${1:-cpp_protobuf_format_Sep-29-2018}
out=${in/protobuf/babi}-$2
cp ggnn/ggnn-$2.py ggnn/ggnn.py
mkdir -p $out/train $out/test
chmod -R a+w $out
for f in $in/*.fbs; do
  i=$(basename $f)
  i=${i/.fbs/}
  if [ ! -f $out/train/train_$i.txt -o ! -f $out/test/test_$i.txt ]; then
    ./ggnn.sh $in/$i.fbs $out/train/train_$i.txt $out/test/test_$i.txt $out
  fi
done
docker run -v $(pwd)/$out:/e --entrypoint bash -it ggnn -c "cp /usr/local/bin/ggnn /e/ggnn.py"
cp $0 $out
cd $out > /dev/null
k=$(dmap | sort -n | wc -l)
cd - > /dev/null
cd .. > /dev/null
if [ "$k" == "1" ]; then
  k=17331
fi
run program_data/$out $k 104 150 5
cd - > /dev/null
