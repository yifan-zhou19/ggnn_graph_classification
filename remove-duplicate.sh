#!/bin/bash
function convert() {
	source=$1
	target="$source"_dedup
	echo $source $target
	docker run --rm -v $(pwd):/e -w /e --entrypoint bash yijun/fast -c "rm -rf program_data/$target"
	find program_data/$source -name "*.txt" | while read f; do
	  echo $f
	  g=${f/$source/$target/}
	  mkdir -p $(dirname $g)
	  awk -f duplicate.awk $f > $g
	done
}
export -f convert
#convert cpp_babi_format_correct 
convert cpp_babi_format
#convert cpp_babi_format_new
#find program_data/cpp_babi_format_dedup -name "*.txt" | while read f; do
#    g=${f/_dedup/_correct_dedup}
#    wc $f $g
#    diff $f $g
#done
