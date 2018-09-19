#!/bin/bash
mkdir -p JavaProgramData
find ProgramData -type f | while read f; do
   out=Java$f
   out=${out/.cpp/.java}
   txt=${out/.cpp/.txt}
   if [ ! -f $out ]; then
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
