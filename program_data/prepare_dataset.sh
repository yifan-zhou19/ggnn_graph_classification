#/bin/bash
tag=${1:-Oct-15-2018-0000023}
cp github_cpp_babi_format_$tag/maps.cpp.pkl .
cp github_java_babi_format_$tag/maps.java.pkl .
align.sh --lang2=java github_java_babi_format_$tag cll_github_java_babi_format_$tag
