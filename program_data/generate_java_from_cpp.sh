#!/bin/bash
mkdir -p JavaProgramData
find CppProgramData -type f | while read f; do
   out=${f/Cpp/Java}
   out=${out/.cpp/.java}
   txt=${out/.java/.txt}
   if [ ! -f $out ]; then
	   echo ./"C++ to Java Converter.exe" $f $out
	   ./"C++ to Java Converter.exe" $f $out
	   cat $out | awk '
BEGIN { skip = 0 }
/package tangible;/ {
	skip=1
}
{
	if (!skip) {
		print $0
	}
}
'  > $out.tmp
	   mv $out.tmp $out
	   rm -f $txt
   fi
done
