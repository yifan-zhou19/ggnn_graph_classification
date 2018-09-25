#include <iostream>

using namespace std;

void bubbleSort(int *A, int n) {
	for (int i = 0; i < n - 1; i++) {
		for (int j = i + 1; j < n; j++) {
			if (A[i] > A[j]) {
				int tmp = A[i];
				A[i] = A[j];
				A[j] = tmp;
			}
		}
	}
}

int main() {
    int n;
    cin >> n;
    int *A = new int[n];
    for (int i = 0; i < n; i++) {
        cin >> A[i];
    }
    bubbleSort(A, n);
    for (int i = 0; i < n-1; i++) {
        cout << A[i] << " ";
    }
    cout << A[n-1] << endl;
    
    delete [] A;
    return 0;
}