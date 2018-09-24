#include "Quicksort.h"
#include <stdio.h>


void Quicksort::quicksort(int array[], int left, int right){
    if (left < right){

        int q = partition(array, left, right);
        quicksort(array, left,q);
        quicksort(array, q+1,right);
    }
}

int Quicksort::partition(int array[], int p, int r){

    int x = array[p];
    int i = p - 1;
    int j = r + 1;
    for(;;){
        do{
            j--;
        }
        while(array[j] > x);

        do{
            i++;
        }
        while(array[i] < x);

        if(i < j)
            swap(array + i, array + j);
        else
            return j;
    }

}


void Quicksort::sortArray(int array[], int sizeArray){

    quicksort(array, 0, sizeArray - 1);

}
