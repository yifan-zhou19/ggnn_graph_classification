package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int[] n = new int[1000];
		int i;
		int j;
		int k;
		int c;
		double[] sum = new double[1000];
		double[] x = new double[1000];
		int a = 2;
		int b = 1;
		for (i = 0;i < 1000;i++)
		{
			x[i] = a * 1.0 / b;
			c = b;
			b = a;
			a = a + c;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (j = 0;j < m;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[j] = Integer.parseInt(tempVar2);
			}
			sum[j] = 0;
			for (k = 0;k < n[j];k++)
			{
				sum[j] += x[k];
			}
		}
		for (j = 0;j < m;j++)
		{
			System.out.printf("%.3lf\n",sum[j]);
		}
		return 0;
	}
}

