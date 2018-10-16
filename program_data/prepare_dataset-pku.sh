#/bin/bash
tag=${1:-Oct-10-2018-0000023}
cp cpp_babi_format_$tag/maps.cpp.pkl .
cp java_babi_format_$tag/maps.java.pkl .
align.sh --lang2=java java_babi_format_$tag cll_java_babi_format_$tag
