#include<iostream>
#include<ctime>
#include<random>
using namespace std;

const int SIZE = 10;

void swap(int a[], int p, int q) { int temp = a[p]; a[p] = a[q]; a[q] = temp; }
void BubbleSort(int a[], int p, int q);

int main(int argc, char* argv[]) {
	int a[SIZE];
	default_random_engine e(time(0));
	for (int i = 0; i < SIZE; i++) {
		a[i] = e() % 100;
	}

	cout << "Inputs: ";
	for (int i = 0; i < SIZE; i++) {
		cout << a[i] << " ";
	}
	cout << endl;

	BubbleSort(a, 0, SIZE - 1);

	cout << "After Sorting: ";
	for (int i = 0; i < SIZE; i++) {
		cout << a[i] << " ";
	}
	cout << endl;

	system("PAUSE");
	return 0;
}

void BubbleSort(int a[], int p, int q) {
	for (int i = SIZE - 1; i > 0; i--) {
		for (int j = 0; j < i; j++) {
			if (a[j] > a[j + 1]) swap(a, j, j + 1);
		}
	}
}