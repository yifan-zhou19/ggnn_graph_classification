It is notoriously challenging to tune the performance of deep learning neural networks.
Especially for exploratory studies, there is no termination condition to tell when the
configuration is good enough. 

According to the experience in this experiment, we have found a number of variations that
may be traps for repeating our study to achieve the same good results.

* Versioning Dependencies
  * Docker is a good way to virtualise the experiment steps to make the repeatable. 
    However, there are places where variations need to be controlled.
    * Specify the version of inherited image. Placeholders like `latest` can be confusing
      because it may refer to different version than the one you expected. So whenever
      possible, supply the additional tag would make it clear.
```
FROM pytorch/pytorch:0.4_cuda9_cudnn7
FROM yijun/fast:v0.0.8-6
```
    * The `fast` command depends on the availability of `flatbuffers`. However, the default
version of flatbuffers on Mac OSX 10.14 Homebrew is 1.7.0, while the latest version from Alpine
Linux distribution on Docker image is 1.9.0. The generate enumerators may not have exactly the
same encoding of the schema used. This can affect the outputted node types in the graphs.

* Environmental Assumptions
    * The files listed in a same folder scanned by `srcml` may be ordered differently on different
machines. This affects the order of AST representions of the compilation units. The problem is
fixed on the flatbuffer encoding of the srcml compilation units, through ordering them alphabetically
by the file names.
    * The GGNN graphs assumes that the node types are densely distributed, otherwise the size of the matrices
would increase to cover all the node types. Therefore a map is created from srcml grammar node types to 
a global integer, incremented when new ones are encountered FIFO. However, if the dataset files are supplied
in a different order, then the mapping will change. To avoid this uncertainty, we also need to encounter 
the files alphabetically.
    * The cross-language mappings are created so that they can be aligned consistently. 
    // The above two assumptions are based on a hypothesis that the node id across graphs must be consistent.
    // If the hypothesis of node type consistency is not true, the ordering of encountering the node types 
    // can be maintained by creating a local map and reset it every time a new compilation unit is loaded.
