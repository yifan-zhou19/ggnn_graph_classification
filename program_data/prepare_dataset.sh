#/bin/bash
tag=Sep-29-2018-${1:-1740415}
if [ ! -f maps.cpp.pkl ]; then
   cp cpp_babi_format_$tag/maps.cpp.pkl .
fi
if [ ! -f maps.java.pkl ]; then
   cp github_java_babi_format_$tag/maps.java.pkl .
fi
if [ ! -f maps.c.pkl ]; then
   cp github_cpp_babi_format_$tag/maps.c.pkl .
fi
for dataset in java github_java; do
	align.sh "$dataset"_babi_format_$tag cll_"$dataset"_babi_format_$tag
done
align.sh --lang2=c github_cpp_babi_format_$tag cll_github_cpp_babi_format_$tag
