#folder=cpp_babi_format_Oct-15-2018-0000029
folder=github_cpp_babi_format_Oct-15-2018-0000029
rm -f transfer-learning.log
docker run --entrypoint sh -v $(pwd):/e -w /e busybox -c "rm -rf $folder/logs"
rm -rf $folder/logs
n=2
function prepare_data() {
   x=$1
   mkdir -p $x/$folder/train $x/$folder/test
   mkdir -p $x/cll_${folder/cpp/java}/train $x/cll_${folder/cpp/java}/test
   cp $folder/maps.*.pkl $x/$folder
   cp cll_${folder/cpp/java}/maps.*.pkl $x/cll_${folder/cpp/java}/
   for f in $(wc $folder/train/*.txt | sort -n -r | grep -v total | tail -$x | cut -f3 -d'/' | cut -f2 -d'_'); do
       cp $folder/train/train_$f $x/$folder/train/train_$f
       cp $folder/test/test_$f $x/$folder/test/test_$f
       cp cll_${folder/cpp/java}/train/train_$f $x/cll_${folder/cpp/java}/train/train_$f
       cp cll_${folder/cpp/java}/test/test_$f $x/cll_${folder/cpp/java}/test/test_$f
   done
   chmod -R o+w $x
}
function transfer() {
        n=$1
        n1=$((n*2))
        m=$(grep Test $n/$folder/cll-log-$n.txt | cat -n | sort -n -k6 -r | tail -1 | cut -f1)
        m1=$((m-1))
        p=$(grep Test $n/$folder/cll-log-$n.txt | cat -n | sort -n -k6 -r | tail -1 | cut -f2 -d",")
        percent=$(grep Test $n/$folder/cll-log-$n.txt | cat -n | sort -n -k6 -r | tail -1 | cut -f2 -d"," | cut -d"(" -f2 | cut -d"%" -f1)
        echo ============= $percent
        if [ "$percent" -eq "50" ]; then
	   cp $n/$folder/cll-$n.cpkl.$m1 $n/$folder/cll-$n.cpkl
           train.sh $n $n 10
           echo ============= $percent
           return
        fi
        old_percent=0
        if [ -f cll-$n.percent ]; then
          old_percent=$(grep -v ==== cll-$n.percent | tail -1)
        fi
        if [ "$percent" -ge "$old_percent" ]; then
	  cp $n/$folder/cll-$n.cpkl.$m1 cll-$n.cpkl
          echo ====== $m1 >> cll-$n.percent
          echo $percent >> cll-$n.percent
        fi
        echo ===== transfer $n @ $m1 $p to $n1
        prepare_data $n1
	rm -f $n1/$folder/cll-$n1.cpkl*
        rm -f $n1/$folder/cll-log-$n1.txt
	cp $n/$folder/cll-$n.cpkl.$m1 $n1/$folder/cll-$n1.cpkl.0
	cp $n/$folder/cll-$n.cpkl.$m1 $n1/$folder/cll-$n1.cpkl
        chmod o+w $n1/$folder/cll-$n1.cpkl
        train.sh $n1 $n1 10
}
prepare_data 2
docker run --entrypoint sh -v $(pwd):/e -w /e busybox -c "rm -rf 2/$folder/cll-2.cpkl*"
rm -f 2/$folder/cll-2.cpkl*
rm -f 2/$folder/cll-log-2.txt
m1=$(grep === cll-2.percent | tail -1 | cut -f2 -d" ")
if [ -f cll-2.cpkl.$m1 ]; then 
  cp cll-2.cpkl.$m1 2/$folder/cll-2.cpkl
  cp cll-2.cpkl.$m1 2/$folder/cll-2.cpkl.0
  chmod o+w 2/$folder/cll-2.cpkl
fi
train.sh 2 2 10
n=2
for i in `seq 1 7`; do
  transfer $n | tee -a transfer-learning.log
  n=$((n*2))
done 
