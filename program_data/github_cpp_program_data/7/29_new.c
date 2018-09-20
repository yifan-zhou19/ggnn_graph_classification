#include "iostream"
using namespace std;
void merge(int *a,int p,int q,int r){
	int n1=q-p+1;
	int n2=r-q;
	int L[n1+1],R[n2+1];
	for (int i = 0; i < n1; ++i)
	{
		L[i]=a[p+i];
		cout<<L[i]<<" ";
	}
	cout<<endl;
	for (int i = 0; i < n2; ++i)
	{
		R[i]=a[q+i+1];
		cout<<R[i]<<" ";
	}
	L[n1]=10000;
	R[n2]=10000;
	cout<<endl;
	int m=0,n=0;
	for (int i = p; i <=r; ++i)
	{
		if (R[m]>L[n])
		{
			a[i]=L[n];
			n++;
		}else if (R[m]<=L[n])
		{
			a[i]=R[m];
			m++;
		}
	}
}

void mergesort(int *a,int p,int r){
	if (p<r)
	{
		int q=(r-p)/2+p;
		mergesort(a,p,q);
		mergesort(a,q+1,r);
		merge(a,p,q,r);
	}

}
int main(){
	int a[10]={1,2,3,5,13,4,3,5,6,2};
	mergesort(a,0,9);
	for (int i = 0; i < 10; ++i)
	{
		cout<<a[i]<<" ";
		}
	return 0;
}
