package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[100];
		double[] b = new double[100];
		double[] sum = new double[100];
		int i;
		int j;
		int m;
		int[] n = new int[100];
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
		a[0] = 2;
		b[0] = 1;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n[i];j++)
			{
				sum[i] += a[j] / b[j];
				a[j + 1] = a[j] + b[j];
				b[j + 1] = a[j];
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.3lf\n",sum[i]);
		}
		return 0;
	}


}

