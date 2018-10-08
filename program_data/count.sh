out=cpp_babi_format_Sep-29-2018-00000$1
e=$(wc -l $out/*/*.txt | tail -1 | cut -f2 -d" ")
v=$(cd $out > /dev/null && dmap | sort -n | tail -1 | cut -f1 -d"<")
epoch=$(cd $out > /dev/null && grep Test *.txt | wc -l | cut -f2 -d" ")
loss=$(cd $out > /dev/null && grep Test *.txt | tail -1 | cut -f5 -d" " | cut -f1 -d",")
accu=$(cd $out > /dev/null && grep Test *.txt | tail -1 | cut -f8 -d" " | cut -f2 -d"(" | cut -f1 -d")" )
echo $e $v $epoch $loss $accu
