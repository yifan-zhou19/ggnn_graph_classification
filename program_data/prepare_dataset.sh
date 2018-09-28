#/bin/bash
<<<<<<< HEAD
export MAPS=--maps
=======
>>>>>>> 8194f5a58412850b059d846f82c9e1cbfe931118
#for dataset in cpp java github_cpp github_java; do
for dataset in cpp; do
	./generate_"$dataset"_babi_format.sh
done
exit 0
for dataset in java github_java; do
	align "$dataset"_babi_format cll_"$dataset"_babi_format
done
align --lang2=c github_cpp_babi_format cll_github_cpp_babi_format
