int main()
{
	int n,i,z=0;
	int a[10];
	int b[10];
	float c[10],g,y=0,t[10]={0};
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
                  z=z+a[i];
	}
	for(i=0;i<n;i++)
	{
                  scanf("%d",&b[i]);
		if(90<=b[i]&&b[i]<=100)
			{c[i]=4.0;}
		else if(85<=b[i]&&b[i]<=89)
			{c[i]=3.7;}
		else if(82<=b[i]&&b[i]<=84)
			{c[i]=3.3;}
		else if(78<=b[i]&&b[i]<=81)
			{c[i]=3.0;}
		else if(75<=b[i]&&b[i]<=77)
			{c[i]=2.7;}
		else if(72<=b[i]&&b[i]<=74)
			{c[i]=2.3;}
		else if(68<=b[i]&&b[i]<=71)
			{c[i]=2.0;}
		else if(64<=b[i]&&b[i]<=67)
			{c[i]=1.5;}
		else if(60<=b[i]&&b[i]<=63)
			{c[i]=1.0;}
		else if(b[i]<60)
			{c[i]=0;}
		t[i]=c[i]*a[i];
	         y=y+t[i];
	}
	g=y/z;
	printf("%.2f",g);
	return 0;
}
