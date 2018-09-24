int f = new int(int,int);
int main()
{
	int n;
	int i;
	int a;
	int[] b = new int[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		b[i] = f(a,2);
	}
	for (i = 0;i < n;i++)
	{
		System.out.printf("%d\n",b[i]);
	}
	return 0;
}
int f(int x,int y)
{
	int j;
	int sum = 1;
	if (x < y)
	{
		sum = 0;
	}
	else
	{
		for (j = y;j < x;j++)
		{
			if (x % j == 0)
			{
				sum = sum + f(x / j,j);
			}
		}
	}
	return sum;
}


