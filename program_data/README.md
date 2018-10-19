# Program data
```
CppProgramData           -- 51,999 .cpp  programs from PKU datasets, organised in 104 classes
JavaProgramData		 -- 51,999 .java programs from PKU datasets converted from the above
github_cpp_program_data  --  4,932 .cpp  programs crawled from Github organised in 50 classes, 
			     after removing clones
github_java_program_data --  4,732 .java programs crawled from Github organised in 50 classes, 
			     after removing clones
```
# Experiment bash scripts
```
./gen.sh                 ## generate datasets from program data
./train.sh               ## train models using the datasets
./tensorboard.sh         ## visualise training progresses in tensorboards
./test.sh                ## test performance of models of the latest epochs in the training processes
```

## Auxilliary tools used in the converstions
```
C++ to Java Converter.exe -- A program that converts C++ programs of less than 100 LOC to Java.
fast			  -- A docker image that converts source code into ASTs with annotated def-use information 
			     using SrcML and SrcSlice
ggnn			  -- A docker image that converts the above into inputs for Gated Graph Neural Networks 
			     according to ICLR'18 from Microsoft Research.
```

## GGNN datasets generated from the program data using fast/ggnn images (Oct 18, 2018, v28)
```
cpp_babi_format_Oct-10-2018-0000028               -- GGNN graphs of PKU datasets in C++
java_babi_format_Oct-10-2018-0000028		  -- GGNN graphs of PKU datasets in Java
cll_java_babi_format_Oct-10-2018-0000028          -- after aligning node types between C++ and Java
github_cpp_babi_format_Oct-10-2018-0000028	  -- GGNN graphs of Github datasets in C++
github_java_babi_format_Oct-10-2018-0000028	  -- GGNN graphs of Github datasets in Java
cll_github_java_babi_format_Oct-10-2018-0000028   -- after aligning node types between C++ and Java
```

