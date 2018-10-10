in=ex_protobuf_format_Oct-9-2018
#in=ex_protobuf_format_Sep-29-2018
out=${in/protobuf/babi}-$1
cp ggnn/ggnn-$1.py ggnn/ggnn.py
docker run --rm -v $(pwd):/e --entrypoint bash yijun/fast -c "rm -rf $out"
mkdir -p $out/train $out/test
chmod -R a+w $out
if [ -f $out/maps.cpp.pkl ]; then
   cp $out/maps.cpp.pkl .
fi
if [ -f $out/maps.pkl ]; then
   cp $out/maps.pkl .
fi
for f in $in/*.fbs; do
  i=$(basename $f)
  i=${i/.fbs/}
  if [ ! -f $out/train/train_$i.txt -o ! -f $out/test/test_$i.txt ]; then
    ./ggnn.sh $in/$i.fbs $out/train/train_$i.txt $out/test/test_$i.txt 
  fi
done
if [ -f maps.cpp.pkl ]; then
	mv maps.cpp.pkl $out
fi
if [ -f maps.pkl ]; then
	mv maps.pkl $out
fi
docker run -v $(pwd)/$out:/e --entrypoint bash -it ggnn -c "cp /usr/local/bin/ggnn /e/ggnn.py"
cp $0 $out
diff $out/train/train_1.txt $out/test/test_1.txt
