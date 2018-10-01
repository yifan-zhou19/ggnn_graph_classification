n=$(ls cpp_babi_format_Sep-29-2018-*/train | wc -l)
m=$(ls ggnn/ggnn-*.py | wc -l)
echo $((n/106)) / $m
