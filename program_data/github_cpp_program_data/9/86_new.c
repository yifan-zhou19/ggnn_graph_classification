#include <vector>
#include <iostream>
#include "../include/sorting/quick_sort.h"
#include <algorithm>

namespace sort_search {

  using namespace std;

  //----------------------------------------------------------
  //
  // Simple quicksort
  //
  //----------------------------------------------------------

  void swap(int *a, int *b) {
    int t = *a;
    *a = *b;
    *b = t;
  }

  int partition(vector<int> &a, int l, int r) {
    int pivot = a[r];
    int i = l - 1;
    for(int j = l; j <= r - 1; j++){
      if(a[j]<=pivot) {
        ++i;
        swap(&a[i], &a[j]);
      }
    }
    ++i;
    swap(&a[i], &a[r]);
    return i;
  }

  void simple_quicksort(vector<int> &a, int l, int r) {
    int pivot;
    if(l < r) {
      pivot = partition(a, l, r);
      simple_quicksort(a, pivot + 1, r);
      simple_quicksort(a, l, pivot - 1);
    }
  }

  void simple_quicksort(vector<int>& a) {
    int l = 0;
    int r = a.size() - 1;
    simple_quicksort(a, l, r);
  }

  //----------------------------------------------------------
  //
  // STL style quicksort
  //
  //----------------------------------------------------------

  template <typename Iter>
  void stl_quicksort(Iter first, Iter last) {
    Iter left = first;
    Iter right = last;
    Iter pivot = left ++;
    if(first != last) {
      while(left != right) {
        if(*left < *pivot) {
          ++left;
        }
        else {
          while((left < right) && (*pivot < *right)) {
              --right;
          }
          std::iter_swap(left, right);
        }
      }
      left --;
      std::iter_swap(left, pivot);
      stl_quicksort(first, left);
      stl_quicksort(right, last);
    }
  }

  void stl_quicksort(vector<int>& a) {
    vector<int>::iterator first = a.begin();
    vector<int>::iterator last = a.end() - 1;
    stl_quicksort(first, last);
  }

}
