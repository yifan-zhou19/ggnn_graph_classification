#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <errno.h>

// knapsack 0/1 algorithm using recursion 

#define kmax(a,b) (a) > (b) ? (a) : (b)

int knapsack(int W,int wt[],int val[],int n);

int knapsack(int W,int wt[],int val[],int n)
{
	//base case
	if (W == 0 || n == 0) return 0;

	// If weight of the nth item is more than knapsack capacity
	// W, then this item cannot be included in the optimal solution

	if (wt[n - 1] > W) return knapsack(W,wt,val,n - 1);
	else return kmax(val[n - 1] + knapsack(W - wt[n - 1],wt,val,n - 1),
					 knapsack(W,wt,val,n - 1));
}

int main()
{
	int val[] = {60,100,120};
	int wt[] = {10,20,30};
	int W = 50;
	int n = sizeof(val)/sizeof(val[0]);
	printf("%d\n",knapsack(W,wt,val,n));
	return 0;
}

