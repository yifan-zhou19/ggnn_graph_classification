int shulie = int;
int main()
{
	int n;
	int i;
	int j;
	int tot;
	double sum = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		tot = Integer.parseInt(tempVar);
	}
	for (j = 0;j < tot;j++)
	{
		sum = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			sum += (double)shulie(i + 1) / shulie(i);
		}
		System.out.printf("%.3lf\n",sum);
	}
	return 0;
}
int shulie(int x)
{
	int k;
	int[] sl = new int[100];
	sl[0] = 1;
	sl[1] = 2;
	for (k = 2;k <= x;k++)
	{
		sl[k] = sl[k - 1] + sl[k - 2];
	}
	return sl[x];
}

