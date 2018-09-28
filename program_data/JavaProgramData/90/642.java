int put = new int(int, int);
int main()
{
	int nLoop;
	int m;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		nLoop = Integer.parseInt(tempVar);
	}
	while (nLoop-- != 0)
	{
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
		System.out.printf("%d\n",put(m,n));
	}
	return 0;
}
int put(int m, int n)
{
	if (m == 0 || m == 1 || n == 1)
	{
		return 1;
	}
	int sum = 1;
	int i;
	for (i = 2;i <= n && i <= m;i++)
	{
		sum += put(m - i,i);
	}
	return sum;
}

