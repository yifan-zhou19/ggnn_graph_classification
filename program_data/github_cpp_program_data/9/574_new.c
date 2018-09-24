#include "Quicksort.h"

Quicksort::Quicksort(){

}

void Quicksort::quicksort(int* vector, int start, int end){

   int pivot, aux, i = start, j = end, half;
   half = ((i + j) >> 1);
   pivot = vector[half];
   
   do{
      while (vector[i] < pivot) i = i + 1;
      while (vector[j] > pivot) j = j - 1;
          
      if(i <= j){
         aux = vector[i];
         vector[i] = vector[j];
         vector[j] = aux;
         i = i + 1;
         j = j - 1;
      }
   }while(j > i);
   
   if(start < j) quicksort(vector, start, j);
   if(i < end) quicksort(vector, i, end);   
}