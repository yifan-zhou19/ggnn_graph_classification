package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double[] sum = new double[100];
	int a = 1;
	int b = 2;
	int c;
	int d;
	int n;
	int i;
	int[] j = new int[100];
	int k;
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
		j[i] = Integer.parseInt(tempVar2);
	}
	}
	for (i = 0;i < n;i++)
	{
		sum[i] = 0;
		a = 1;
		b = 2;
		for (k = 0;k < j[i];k++)
		{
		sum[i] += 100000 * b / a;
		c = b;
		d = a + b;
		a = c;
		b = d;
		}
		System.out.printf("%.3lf\n",sum[i] / 100000);
	}



	return 0;
	}

}

