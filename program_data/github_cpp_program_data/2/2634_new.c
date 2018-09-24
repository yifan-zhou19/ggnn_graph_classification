/**
 * 冒泡排序：
 * 每一次遍历将最大/最小值遍历出来，放到一边
 * 最大最小值是在遍历中不断变化的
 */
#include <iostream>
#include "test.h"

using namespace std;

void bubbleSort(int a[], int n){
	for(int i = 0; i < n - 1; i++){
		//这里又出错了 错误代码: for(int j = i; j < n - 1; j++)
		//注意，冒泡排序是从一端冒泡到另一端，不变的起始点，变得是终止点，注意要理清楚
		for(int j = 0; j < n - i - 1; j++){
			if(a[j] > a[j + 1])
				swap(a[j], a[j + 1]);
		}
	}
}

// void bubbleSort(int a[],int len){
// 	for(int i = 0 ; i < len ; i++){
// 		for(int j = len - 1 ; j > i ; j--){
// 			if(a[j]<a[j-1]){//仅用j来比较元素
// 				int temp = a[j];
// 				a[j] = a[j-1];
// 				a[j-1] = temp;
// 			}
// 		}
// 	}
// }

int main(int argc, char const *argv[])
{
	bubbleSort(a, 12);
	print();
	return 0;
}