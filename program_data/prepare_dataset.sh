#/bin/bash
#tag=${1:-Oct-10-2018-0000020}
tag=${1:-Oct-15-2018-0000024}
if [ ! -f maps.cpp.pkl ]; then
   cp github_cpp_babi_format_$tag/maps.cpp.pkl .
fi
if [ ! -f maps.java.pkl ]; then
   cp github_java_babi_format_$tag/maps.java.pkl .
fi
align.sh --lang2=java github_java_babi_format_$tag cll_github_java_babi_format_$tag
#align.sh --lang2=java java_babi_format_$tag cll_java_babi_format_$tag
