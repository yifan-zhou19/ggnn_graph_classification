for n in 50 30 10; do
    perf.sh $n
done
for n in 104 50 25 10; do
    perf-pku.sh $n
done
