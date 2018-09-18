#!/bin/bash
mkdir -p JavaProgramData
find ProgramData -type f | while read f; do
   out=Java$f
   out=${out/.cpp/.java}
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
done
