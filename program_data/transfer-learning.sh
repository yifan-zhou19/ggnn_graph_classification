#folder=cpp_babi_format_Oct-15-2018-0000029
folder=github_cpp_babi_format_Oct-15-2018-0000029

##################################################################################################
# STRATEGY 1: How many epochs to do the initial training on the 2-class classification problem?
INIT_N_EPOCH=150
##################################################################################################
# STRATEGY 2: How many epochs to do the incremental training on the larger classification problem?
# N_EPOCH=10
# N_EPOCH=20
N_EPOCH=$((INIT_N_EPOCH / 2))
##################################################################################################

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
   ################################################################################
   # STRATEGY 3: Prepare the datasets selectively. 
   ## Alternative 1: order the examples by their size, then starting from biggest
   for f in $(wc $folder/train/*.txt | sort -n | grep -v total | tail -$x | cut -f3 -d'/' | cut -f2 -d'_'); do
   ## Alternative 2: order the examples by their size, then starting from smallest
   #for f in $(wc $folder/train/*.txt | sort -n -r | grep -v total | tail -$x | cut -f3 -d'/' | cut -f2 -d'_'); do
   ## Alternative 3: order the examples by their name from 1 to n
   #for f in $(find $folder/train -type f -name "*.txt" | cut -f3 -d'/' | cut -f2 -d'_' | sort -n -r | tail -$x ); do
   ################################################################################
       cp $folder/train/train_$f $x/$folder/train/train_$f
       cp $folder/test/test_$f $x/$folder/test/test_$f
       cp cll_${folder/cpp/java}/train/train_$f $x/cll_${folder/cpp/java}/train/train_$f
       cp cll_${folder/cpp/java}/test/test_$f $x/cll_${folder/cpp/java}/test/test_$f
   done
   chmod -R o+w $x
}
################################################################################
#
# Strategy 4: transfer the best performing model of n-class as the initial model for the n1-class classification.
# The dataset of n1 class already contains the dataset of n class, plus one extra class.
#     Alternative 1: where n1 = 2 * n, -- might be greedy but will finish sooner
#     Alternative 2: where n1 = n + 1, -- step-by-step build up from previous classes
#
################################################################################
function transfer() {
        n=$1
        n1=$((n*2))
	# n1=$((n+1))
        m=$(grep Test $n/$folder/cll-log-$n.txt | cat -n | sort -n -k6 -r | tail -1 | cut -f1)
        m1=$((m-1))
        p=$(grep Test $n/$folder/cll-log-$n.txt | cat -n | sort -n -k6 -r | tail -1 | cut -f2 -d",")
        percent=$(grep Test $n/$folder/cll-log-$n.txt | cat -n | sort -n -k6 -r | tail -1 | cut -f2 -d"," | cut -d"(" -f2 | cut -d"%" -f1)
        echo ============= $percent
        if [ "$percent" -eq "50" ]; then
	   cp $n/$folder/cll-$n.cpkl.$m1 $n/$folder/cll-$n.cpkl
           N_EPOCH=$((INIT_N_EPOCH / n))
	   #N_EPOCH=10
           train.sh $n/$folder $n $N_EPOCH
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
        N_EPOCH=$((INIT_N_EPOCH / n1))
	#N_EPOCH=10
        train.sh $n1/$folder $n1 $N_EPOCH
}
prepare_data 2
docker run --entrypoint sh -v $(pwd):/e -w /e busybox -c "rm -rf 2/$folder/cll-2.cpkl*"
rm -f 2/$folder/cll-2.cpkl*
rm -f 2/$folder/cll-log-2.txt
### Recording the epoch of best performing model
if [ ! -f cll-2.percent ]; then
	train.sh 2/$folder 2 $INIT_N_EPOCH
	m=$(grep Test 2/$folder/cll-log-2.txt | cat -n | sort -n -k6 -r | tail -1 | cut -f1)
	m1=$((m-1))
	p=$(grep Test $n/$folder/cll-log-$n.txt | cat -n | sort -n -k6 -r | tail -1 | cut -f2 -d",")
	percent=$(grep Test $n/$folder/cll-log-$n.txt | cat -n | sort -n -k6 -r | tail -1 | cut -f2 -d"," | cut -d"(" -f2 | cut -d"%" -f1)
	echo ============= $percent
	old_percent=0
	if [ -f cll-2.percent ]; then
	  old_percent=$(grep -v ==== cll-2.percent | tail -1)
	fi
	if [ "$percent" -ge "$old_percent" ]; then
	  cp 2/$folder/cll-2.cpkl.$m1 cll-2.cpkl
	  cp 2/$folder/cll-2.cpkl.$m1 cll-2.cpkl.$m1
	  echo ====== $m1 >> cll-2.percent
	  echo $percent >> cll-2.percent
	fi
else
        m1=$(grep === cll-2.percent | tail -1 | cut -f2 -d" ")
	if [ -f cll-2.cpkl.$m1 ]; then 
	  cp cll-2.cpkl.$m1 2/$folder/cll-2.cpkl
	  cp cll-2.cpkl.$m1 2/$folder/cll-2.cpkl.0
	  chmod o+w 2/$folder/cll-2.cpkl
          N_EPOCH=$((INIT_N_EPOCH/2))
	  #N_EPOCH=10
          echo $N_EPOCH
	  train.sh 2/$folder 2 $N_EPOCH
	fi
fi
n=2
for i in `seq 1 4`; do
#for i in `seq 1 49`; do
  transfer $n | tee -a transfer-learning.log
  n=$((n*2))
  #n=$((n+1))
done 
