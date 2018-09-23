int Factor = new int(int, int);
int main()
{
	int n;
	int a;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d\n",Factor(a, 2));
	}
	return 0;
}
int Factor(int a,int p)
{
	int i;
	int j;
	int z = 1;
	if (a < p)
	{
		z = 0;
	}
	else
	{
		for (i = p;i <= a;i++)
		{
			if (a % i == 0)
			{
				z += Factor(a / i, i);
			}
		}
	}
	return z;
}

