//
//  main.cpp
//  bloomfilter
//
//  Created by gexiao on 08/08/2017.
//  Copyright © 2017 gexiao. All rights reserved.
//

#include <iostream>
#include <stdio.h>
#include <string>
#include "bloomfilter.h"
using namespace std;

#define M 1000007
const int K=10;
int p[K]={1007,10007,12347,12349,100017,111647,19720308,19750920,19981117,20150208};
int hvalue(int x,int k){
    return abs(((x*p[(k+1)%K])^p[k])-((x*p[(k+3)%K])^p[(k+4)%K]))%M;
}

int BloomFilter::calcUv(const char* inputFile,int n){
    FILE* f=freopen(inputFile, "r", stdin);
    bool bf[M];
    int uv=0;
    for (int i=0,x;i<n;i++){
        cin>>x;
        bool isNew=false;
        for (int k=0;k<K;k++){
            int h=hvalue(x, k); // 计算第k种散列值
            isNew=isNew || !bf[h];  // 只要有一个为0，就确定未出现过
            bf[h]=true;
        }
        uv+=isNew;  // 累计UV
    }
    fclose(f);
    return uv;
}
