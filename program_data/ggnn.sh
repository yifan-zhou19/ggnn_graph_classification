docker build --build-arg http_proxy=http://wwwcache.open.ac.uk:80 --build-arg https_proxy=http://wwwcache.open.ac.uk:80 -t ggnn ggnn > ggnn.log
docker run -e http_proxy=http://wwwcache.open.ac.uk:80 -e https_proxy=http://wwwcache.open.ac.uk:80 --rm -v $(pwd):/e -it ggnn "$@"
