int main()
{
	int i,j,m,n,k=0,a[22][22],b[400],c[400];
	cin>>m>>n;
	for(i=1;i<=m;i++)
		for(j=1;j<=n;j++)
			cin>>a[i][j];
	for(i=0;i<=m+1;i++)
	{
		a[i][0]=0;
		a[i][n+1]=0;
	}
	for(i=0;i<=n+1;i++)
	{
		a[0][i]=0;
		a[m+1][i]=0;
	}
	for(i=1;i<=m;i++)
		for(j=1;j<=n;j++)
			if(a[i][j]>=a[i-1][j]&&a[i][j]>=a[i+1][j]&&a[i][j]>=a[i][j-1]&&a[i][j]>=a[i][j+1])
			{
				b[k]=i-1;
				c[k]=j-1;
				k++;
			}
	for(i=0;i<k;i++)
		cout<<b[i]<<" "<<c[i]<<endl;
	return 0;
}
