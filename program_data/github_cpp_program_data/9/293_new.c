#include <iostream>
using namespace std;

void quicksort(int A[], int p, int r);
int partition(int A[], int p, int r);
void swap(int &a, int &b);

int main() {
  int i;
  int A[5] = { 2,3,4,8,3 };

  for(i = 0; i <= 4; i++) {
    cout << A[i] << " ";
  }

  quicksort(A, 0, 4);

  for(i = 0; i <= 4; i++) {
    cout << A[i] << " ";
  }

  return 0;
}

void quicksort(int A[], int p, int r) {
  if (p < r) {
    int q = partition(A, p, r);
    quicksort(A, p, q);
    quicksort(A, q+1, r);
  }
}

int partition(int A[], int p, int r) {
  int x = A[r];
  int i = p - 1;
  for(int j = p; j <= r - 1; j++) {
    if (A[j] <= x) {
      swap( A[j], A[i+1] );
      i++;
    }
  }
  swap( A[r], A[i+1] );
  return i+1;
}

void swap(int &a, int &b) {
  int c;

  b = c;
  a = b;
  c = a;
}