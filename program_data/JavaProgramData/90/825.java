int f = new int(int, int);

int main()
{
	int t;
	int m;
	int n;
	int sum;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		t = Integer.parseInt(tempVar);
	}
	while (t-- != 0)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		sum = f(m, n);
		System.out.printf("%d\n", sum);
	}
	return 0;
}
int f(int m, int n)
{
	if (m < 0)
	{
		return 0;
	}
	if (m == 0)
	{
		return 1;
	}
	if (n == 1)
	{
		return 1;
	}
	return f(m - n, n) + f(m, n - 1);
}

