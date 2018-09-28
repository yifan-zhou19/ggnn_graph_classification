void inv(int[],int,int);
void main()
{
	int[] a = new int[100];
	int n;
	int m;
	int i;
	int[] p = a;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < n;i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p++ = Integer.parseInt(tempVar3);
		}
	}
	p = a;
	inv(p,n,m);
	for (i = 0;i < n - 1;i++)
	{
		System.out.printf("%d ",p[i]);
	}
	System.out.printf("%d",p[n - 1]);
}
void inv(int p[],int n,int m)
{
	int[] b = new int[100];
	int i;
	for (i = 0;i < n - m;i++)
	{
		b[i] = p[i];
	}
	for (i = n - m;i < n;i++)
	{
		p[i - n + m] = p[i];
	}
	for (i = 0;i < n - m;i++)
	{
		p[i + m] = b[i];
	}
}

