/* 
 * File:   BubbleSort.cpp
 * Author: calc
 * 
 * Created on 26 июня 2014 г., 9:37
 */

#include "BubbleSort.h"

/*BubbleSort::BubbleSort() {
}

BubbleSort::BubbleSort(const BubbleSort& orig) {
}

BubbleSort::~BubbleSort() {
}*/

void BubbleSort::sortArray(){
    for (int i = 0; i < values-1; i++) {
        for (int j = i+1; j < values; j++) {
            if(A[i] > A[j]){
                swap(A[i], A[j]);
            }
        }
    }
}

void BubbleSort::swap(int &a, int &b) {
    int m = a;
    a = b;
    b = m;
}


