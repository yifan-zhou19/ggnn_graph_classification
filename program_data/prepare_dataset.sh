#/bin/bash
for dataset in cpp java github_cpp github_java; do
	./generate_"$dataset"_babi_format.sh
done
for dataset in java github_java; do
	align "$dataset"_babi_format cll_"$dataset"_babi_format
done
align --lang2=c github_cpp_babi_format cll_github_cpp_babi_format
