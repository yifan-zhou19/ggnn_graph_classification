//�鲢���� 
#include<cstdio>
#include<iostream>
using namespace std;
const int maxn=1e6+10;
int tp[maxn],a[maxn];
void mergesort(int x,int y);
int main()
{
	int n;
	scanf("%d",&n);
	for(int i=1;i<=n;i++)
	{
		scanf("%d",&a[i]);
	}
	mergesort(1,n+1);
	for(int i=1;i<=n;i++)
	{
		printf("%d ",a[i]);
	}
	printf("\n");
	return 0;
}
void mergesort(int x,int y)
{
	if(y-x>1)//�����г��ȱ�Ϊ1�������������� 
	{
		int m=x+(y-x)/2;
		int p=x,q=m,i=x;
		mergesort(x,m);
		mergesort(m,y);
		while(p<m||q<y)//��һ���зǿգ������ϲ��� 
		{
			if(q>=y||(p<m&&a[p]<=a[q])) tp[i++]=a[p++];//�������ж��ױȽϣ�����С���ң������������顣 
			else tp[i++]=a[q++];
		}
		for(int i=x;i<y;i++) a[i]=tp[i];
	}
}
