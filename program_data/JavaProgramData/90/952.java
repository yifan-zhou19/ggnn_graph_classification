int f = new int(int,int);
void main()
{
	int t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		t = Integer.parseInt(tempVar);
	}
	int i;
	for (i = 0;i < t;i++)
	{
		int m;
		int n;
		int a;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		a = f(m,n);
		System.out.printf("%d\n",a);
	}
}
int f(int a,int b)
{
	if (a < 0)
	{
		return (0);
	}
	else if (b < 0)
	{
		return (0);
	}
	else if (a == 1 || b == 1)
	{
		return (1);
	}
	else
	{
		int s;
		s = f(a,b - 1) + f(a - b,b);
		return (s);
	}
}




