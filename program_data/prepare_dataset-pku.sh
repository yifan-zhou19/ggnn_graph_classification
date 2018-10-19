#/bin/bash
tag=${1:-Oct-10-2018-0000028}
if [ ! -f maps.cpp.pkl ]; then
   cp cpp_babi_format_$tag/maps.cpp.pkl .
fi
if [ ! -f maps.java.pkl ]; then
   cp java_babi_format_$tag/maps.java.pkl .
fi
mkdir -p cll_java_babi_format_$tag
chmod o+w cll_java_babi_format_$tag
align.sh --lang2=java java_babi_format_$tag cll_java_babi_format_$tag
