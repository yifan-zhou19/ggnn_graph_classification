#/bin/bash
tag=${1:-Oct-15-2018-0000023}
if [ ! -f maps.cpp.pkl ]; then
   cp cpp_babi_format_$tag/maps.cpp.pkl .
fi
if [ ! -f maps.java.pkl ]; then
   cp java_babi_format_$tag/maps.java.pkl .
fi
align.sh --lang2=java java_babi_format_$tag cll_java_babi_format_$tag
