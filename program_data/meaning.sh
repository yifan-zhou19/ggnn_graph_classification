function fast2ggnn() {
	if [ -d ggnn ]; then
		docker build --build-arg http_proxy=http://wwwcache.open.ac.uk:80 --build-arg https_proxy=http://wwwcache.open.ac.uk:80 -t ggnn ggnn > ggnn.log
	fi
	docker run --rm -e http_proxy=http://wwwcache.open.ac.uk:80 -e https_proxy=http://wwwcache.open.ac.uk:80 --rm -v $(pwd):/e --entrypoint /usr/local/bin/fast2ggnn -t ggnn $@
}
find meaningful/src -type f | while read src; do
  tgt=${src/src/tgt}.json
  if [ ! -f $tgt ]; then
	  mkdir -p $(dirname $tgt)
	  chmod a+w $(dirname $tgt)
	  fast2ggnn $src $tgt
  fi
done
for f in meaningful/tgt/*; do
  if [ -d $f ]; then
    n=$(ls $f/* | wc -l | cut -f1 -d" ")
    if [[ $n > 1 ]]; then
       f1=$(ls $f/* | head -1)
       for g in $f/*; do
          if [[ $f1 != $g ]]; then
             diff $f1 $g
          fi
       done
    fi
  fi 
done
