int fbnq = int;
int main()
{
	int m;
	int i;
	int j;
	int[] n = new int[100];
	double[] a = new double[100];
	double[] sum = {0.00, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
			(n[i]) = Integer.parseInt(tempVar2);
		}
	}
	for (j = 0;j < m;j++)
	{
		for (i = 1;i <= n[j];i++)
		{
			sum[j] += (double)fbnq(i + 1) / fbnq(i);
		}
	}
	for (i = 0;i < m;i++)
	{
		System.out.printf("%.3f\n",sum[i]);
	}
	return 0;
}
int fbnq(int b)
{
	int f0;
	int f1;
	int f2;
	f0 = 1;
	f1 = 1;
	if (b == 1)
	{
		return f1;
	}
	for (int i = 2;i <= b;i++)
	{
		f2 = f0 + f1;
		f0 = f1;
		f1 = f2;
	}
	return f2;
}



