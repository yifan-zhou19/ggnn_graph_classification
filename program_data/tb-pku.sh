docker run --rm -p 0.0.0.0:6006:6006 -v $(pwd):/e -w /e -it tensorflow/tensorflow \
	tensorboard --logdir=cpp_babi_format_Oct-10-2018-0000028/logs
