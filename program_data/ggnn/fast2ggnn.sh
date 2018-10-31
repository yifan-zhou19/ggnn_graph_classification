#!/bin/bash
/usr/local/bin/fast -S -G $1 /tmp/1.fbs
#/usr/local/bin/ggnn /tmp/1.fbs /tmp/1.json
#cat /tmp/1.json | jq '.[]' > $2
/usr/local/bin/ggnn /tmp/1.fbs /tmp/train.txt /tmp/test.txt 
cat /tmp/test.txt | grep -v '? ' | sort -n -k1 -k2 -k3 > $2
