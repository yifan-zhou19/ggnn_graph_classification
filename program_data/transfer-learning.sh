folder=cpp_babi_format_Oct-15-2018-0000029
rm -f transfer-learning.log
docker run --entrypoint sh -v $(pwd):/e -w /e busybox -c 'rm -rf cpp_babi_format_Oct-15-2018-0000029/logs'
rm -rf cpp_babi_format_Oct-15-2018-0000029/logs
n=2
function transfer() {
        n1=$((n*2))
        m=$(grep Test $folder/cll-log-$n.txt | cat -n | sort -n -k8 | tail -1 | cut -f1)
        p=$(grep Test $folder/cll-log-$n.txt | cat -n | sort -n -k8 | tail -1 | cut -f2 -d",")
        percent=$(grep Test $folder/cll-log-$n.txt | cat -n | sort -n -k8 | tail -1 | cut -f2 -d"," | cut -d"(" -f2 | cut -d"%" -f1)
        echo ============= $percent
        while [ $((percent < 55)) ]; do
           train.sh biggnn $n 200
           echo ============= $percent
        done
        m1=$((m-1))
        echo ===== transfer $n @ $m1 $p to $n1
	rm -f $folder/cll-$n1.cpkl*
	cp $folder/cll-$n.cpkl.$m1 $folder/cll-$n1.cpkl
        chmod o+w $folder/cll-$n1.cpkl
        train.sh biggnn $n1 200
        export n=$n1
}
rm -f $folder/cll-2.cpkl*
train.sh biggnn 2 200
for i in `seq 1 7`; do
  transfer | tee -a transfer-learning.log
done 
