//============================================================================
// Name        : SortingMain.cpp
// Author      : Girish Prabhu
// Version     : 1.0
// Description : Implementation of important sorting techniques
//============================================================================

#include <iostream>
#include "BubbleSort.h"
#include "SelectSort.h"
#include "InsertionSort.h"
#include "QuickSort.h"
using namespace std;

int main()
{
	QuickSort quickSort;
	quickSort.Initialize();
	quickSort.PrintArray();
	quickSort.DoSort();
	quickSort.PrintArray();
	return 0;

////INSERTION SORT
//	InsertionSort insertionSort;
//	insertionSort.Initialize();
//	insertionSort.PrintArray();
//	insertionSort.DoSort();
//	insertionSort.PrintArray();

////SELECTION SORT
//	SelectSort selectSort;
//	selectSort.Initialize();
//	selectSort.PrintArray();
//	selectSort.DoSort();
//	selectSort.PrintArray();


////BUBBLE SORT
//	BubbleSort bubbleSort;
//	bubbleSort.Initialize();
//	bubbleSort.PrintArray();
//	bubbleSort.DoSort();
//	cout<<"After sorting"<<endl;
//	bubbleSort.PrintArray();
}
