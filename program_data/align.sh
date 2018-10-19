docker build --build-arg http_proxy=http://wwwcache.open.ac.uk:80 --build-arg https_proxy=http://wwwcache.open.ac.uk:80 -t align align > align.log
docker run -v $(pwd):/e -w /e -it align "$@"
