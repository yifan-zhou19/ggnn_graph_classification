#docker run --rm -v $(pwd):/e -w /e -it yijun/$(basename $0) "$@"
docker run --rm -v $(pwd):/e -w /e -it yijun/fast:built "$@"
