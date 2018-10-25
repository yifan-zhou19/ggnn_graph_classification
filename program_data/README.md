# Program data
```
CppProgramData           -- 52,000 .cpp  programs from dataset A, organised in 104 classes
JavaProgramData		 -- 52,000 .java programs from dataset A converted from the above
github_cpp_program_data  --  4,932 .cpp  programs crawled from Github organised in 50 classes, 
			     after removing clones
github_java_program_data --  4,732 .java programs crawled from Github organised in 50 classes, 
			     after removing clones
```
# Experiment bash scripts
```
./train.sh               ## train models using the datasets
./test.sh                ## test performance of models of the latest epochs in the training processes
./transfer-learning.sh   ## transfer cross-language learning model to problem of more classes
./tensorboard.sh         ## visualise training progresses in tensorboards
```

## Auxilliary tools used in the converstions
```
C++ to Java Converter.exe -- A program that converts C++ programs of less than 100 LOC to Java.
fast			  -- A docker image that converts source code into ASTs with annotated def-use information 
			     using SrcML and SrcSlice
ggnn			  -- A docker image that converts the above into inputs for Gated Graph Neural Networks 
			     according to ICLR'18 from Microsoft Research.
```

## GGNN datasets generated from the program data using fast/ggnn images (Oct 18, 2018, v29)
```
cpp_babi_format_Oct-15-2018-0000029               -- GGNN graphs of PKU datasets in C++
java_babi_format_Oct-15-2018-0000029		  -- GGNN graphs of PKU datasets in Java
cll_java_babi_format_Oct-15-2018-0000029          -- after aligning node types between C++ and Java
github_cpp_babi_format_Oct-15-2018-0000029	  -- GGNN graphs of Github datasets in C++
github_java_babi_format_Oct-15-2018-0000029	  -- GGNN graphs of Github datasets in Java
cll_github_java_babi_format_Oct-15-2018-0000029   -- after aligning node types between C++ and Java
```

