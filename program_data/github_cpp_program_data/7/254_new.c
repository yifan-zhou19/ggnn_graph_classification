#include <stdio.h>
int A[] = {0,1,2,3};
int merge(int p,int mid,int q)
{
		int i = p;
		int j = mid+1;
		int k = 1;
		int temp[p-q+1];
		while(i<=mid || j<=q)
		{
			if((j==q+1) || (A[i]<=A[j]))
				temp[k++] = A[i++];
			else if(i==mid+1 ||A[i]>=A[j])
				temp[k++] = A[j++];
		}
		for(int i=p;i<=q;i++)
			A[i] = temp[i-p+1];
	return 0;
}

int mergeSort(int p,int q)
{
	if(p<q)
	{
		int mid = (p+q)/2;
		mergeSort(p,mid);
		mergeSort(mid+1,q);
		merge(p,mid,q);

	}
	return 0;
}

int main(int argc, char const *argv[])
{
	
	mergeSort(1,3);
	for (int i = 1; i < 4; ++i)
	{
		/* code */
		printf("%d\n",A[i] );
	}
	return 0;
}