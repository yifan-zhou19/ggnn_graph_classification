function fast2ggnn() {
	if [ -d ggnn ]; then
		docker build --build-arg http_proxy=http://wwwcache.open.ac.uk:80 --build-arg https_proxy=http://wwwcache.open.ac.uk:80 -t ggnn ggnn > ggnn.log
	fi
	docker run --rm -e http_proxy=http://wwwcache.open.ac.uk:80 -e https_proxy=http://wwwcache.open.ac.uk:80 --rm -v $(pwd):/e --entrypoint /usr/local/bin/fast2ggnn -t ggnn $@
}
find meaningful/src -type f | while read src; do
  tgt=${src/src/tgt}.txt
  if [ ! -f $tgt ]; then
	  mkdir -p $(dirname $tgt)
	  chmod a+w $(dirname $tgt)
	  fast2ggnn $src $tgt
  fi
done
ls -d meaningful/tgt/* > /tmp/folders.txt
i=0
cat /tmp/folders.txt | while read f; do
  i=$((i+1))
    n=$(ls $f/* | wc -l | cut -f1 -d" ")
    if [[ $n > 1 ]]; then
       f1=$(ls $f/* | head -1)
       for g in $f/*; do
          if [[ $f1 != $g ]]; then
             diff $f1 $g
          fi
       done
    fi
    j=0
    cat /tmp/folders.txt | while read g; do
       j=$((j+1))
       if [[ $i < $j ]]; then
         ls $f/* | while read u; do
          ls $g/* | while read v; do
	    d=$(diff $u $v| wc -l | cut -f1 -d" ")
            if [[ $d = 0 ]]; then
		echo $u $v
            fi
          done
         done
       fi
    done
done
