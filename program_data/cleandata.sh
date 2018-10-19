n=${1:-10}
folder=${2:-github_cpp_babi_format_Oct-15-2018-0000024}
cll_folder=cll_${folder/cpp/java}
drm $folder/left-$folder-$n-*
drm $cll_folder/right-*-$n-*
drm $folder/$folder-$n.*.pkl
drm $folder/$n.cpkl.*
drm $folder/*-$n-*.*
