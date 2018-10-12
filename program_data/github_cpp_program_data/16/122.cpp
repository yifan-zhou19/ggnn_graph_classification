#include <iostream>
using namespace std;
int getMax(int a[],int n)
{
	int i,max;
	max=a[n];
	for(i=0;i<n;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	return max;
}
void count(int a[],int n,int exp)
{
	int a1[n];
	int i,count[10]={0};
	for(i=0;i<n;i++)
	{
		count[(a[i]/exp)%10]++;
	}
	for(i=1;i<10;i++)
	{
		count[i]=count[i]+count[i-1];
	}
	for(i=n-1;i>=0;i--)
	{
		a1[count[(a[i]/exp)%10]-1]=a[i];
		count[(a[i]/exp)%10]--;
	}
	for(i=0;i<n;i++)
	{
		a[i]=a1[i];
	}
}

void radixsort(int a[],int n)
{
	int m=getMax(a,n);
	for(int exp=1;m/exp > 0;exp=exp*10)
	{
		count(a,n,exp);
	}
}
void printval(int a[],int val)
{
	for(int i=0;i<val;i++)
	{
		cout<<a[i]<<"\t";
	}
}
int main()
{
	int a[]={841,1123,23,290,52,63,5,10,112};
	int n=sizeof(a)/sizeof(a[0]);
	radixsort(a,n);
	printval(a,n);
	return 0;
}