#include <iostream>
using namespace std;

void quicksort(int a[], int l, int r)
{
    if (l >= r)
        return;
    int i = l, j = r + 1;
    int pivot = a[l];
    while (true) {
        do {
            i = i + 1;
        } while (a[i] < pivot);
        do {
            j = j - 1;
        } while (a[j] > pivot);
        if (i >= j)
            break;
        swap(a[i], a[j]);
    }
    a[l] = a[j];
    a[j] = pivot;

    quicksort(a, l, j - 1);
    quicksort(a, j + 1, r);
}

int main()
{
    int a[] = {2, 1, 5, 3, 9, 1, 4};
    quicksort(a, 0, 6);
    for (int i = 0; i < 7; i++)
        cout << a[i];
    cout << endl;
    return 0;
}
