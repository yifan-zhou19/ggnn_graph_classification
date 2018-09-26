int fbnq = int;
void main()
{
	int m;
	int[] n = new int[100];
	int i;
	int j;
	double[] k = new double[100];
	double[] sum = new double[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	for (i = 0;i < m;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n[i] = Integer.parseInt(tempVar2);
		}
	}
	for (i = 0;i < m;i++)
	{
		for (j = 0;j < n[i];j++)
		{
			k[j] = (double)fbnq(j + 3) / fbnq(j + 2);
			sum[i] += k[j];
		}
	}
	for (i = 0;i < m;i++)
	{
		System.out.printf("%.3lf\n",sum[i]);
	}
	return;
}
int fbnq(int n)
{
	if (n == 0)
	{
		return 0;
	}
	if (n == 1)
	{
		return 1;
	}
	return fbnq(n - 1) + fbnq(n - 2);
}

