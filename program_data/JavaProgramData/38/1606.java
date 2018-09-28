package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] q = new int[100];
	double[][] a = new double[200][1000];
	double[] b = new double[200];
	double[] sum = new double[200];
	double[] s = new double[200];
	int k;
	int i;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (i = 0;i < k;i++)
	{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				q[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < q[i];j++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][j] = Double.parseDouble(tempVar3);
			}
			s[i] += a[i][j];
			}
	}
	for (i = 0;i < k;i++)
	{
		for (j = 0;j < q[i];j++)
		{
			b[i] += (a[i][j] - s[i] / q[i]) * (a[i][j] - s[i] / q[i]);
		}
	}
	for (i = 0;i < k;i++)
	{
		sum[i] = Math.sqrt(b[i] / q[i]);
		System.out.printf("%.5lf\n",sum[i]);
	}
	return 0;
	}
}

