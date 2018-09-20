//
//  QuickSort/source.cpp
//  QuickSort
//
//  Created by cc_wulang on 2013-1-30.
//  
//  快速排序的基本实现方法

#include <iostream>
#include <algorithm>

using namespace std;

int partition(int * a, int p, int r) {
    int x = a[r];
    int i = p - 1;
    for (int j = p; j <= r - 1; j++) {
        if ( a[j] <= x ) {
            i++;
            if ( i != j ) {
                swap(a[i], a[j]);
            }
        }
    }
    
    swap(a[i + 1], a[r]);
    return i + 1;
}

void quickSort(int * a, int start, int end) {
    if ( start < end ) {
        int mid = partition(a, start, end);
        quickSort(a, start, mid - 1);
        quickSort(a, mid + 1, end);
    }
}

int main(int argc, char *argv[]) {
    int a[] = { 2, 1, 5, 3, 6, 8, 7, 4 };
    quickSort(a, 0, 7);
    
    for (int i = 0; i < 8; i++) {
        cout << a[i] << " ";
    }
    cout << endl;
    
}
