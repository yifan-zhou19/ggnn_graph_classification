int main()
{
	int A,B,i,j,a[20],b[20],n1,n2,sign=0;  //?????????A?B???????i?j????????a?b??????????n1?n2??????????sign?????
	cin>>A>>B;   //??????
	for(i=1;A>1;i++)   //??A???
	{
		a[i]=A;    //?????A??
		if(A%2==0)   //??A??????????????A/2??????A-1)/2
			A=A/2;
		else
			A=(A-1)/2;
	}
	a[i]=A;          //????????1
	n1=i;    //???????
	for(i=1;B>1;i++)   //??B????????
		{
			b[i]=B;
			if(B%2==0)
				B=B/2;
			else
				B=(B-1)/2;
		}
	b[i]=B;
	n2=i;
	for(i=1;i<=n1&&sign==0;i++)   //?????????????????
		for(j=1;j<=n2&&sign==0;j++)
			if(b[j]==a[i])
				sign=1;   //????????????1?????
		cout<<a[i-1];   //????
	return 0;
}