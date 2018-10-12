#include <iostream>
#include <vector>
#include <cmath>
#include <set>
#include <algorithm>

using namespace std;

#define DEBUG
#define MAX(A, B) A > B ? : A > B

void swaper(int& x, int& y)
{
	int tmp = x;
	x = y;
	y = tmp;
}

int main(int argc, char const *argv[])
{
	int a[] = {11, 1, 13, 21, 3, 7};

	for (int i = 0; i < sizeof(a)/sizeof(int); ++i)
		for (int j = 1 + i; j < sizeof(a)/sizeof(int); ++j)
			if(a[j] < a[i])
			swaper(a[j], a[i]);

	#ifdef DEBUG
		for (int i = 0; i < sizeof(a)/sizeof(int); ++i)
			cerr << a[i] << endl;
	#endif
	
	return 0;
}