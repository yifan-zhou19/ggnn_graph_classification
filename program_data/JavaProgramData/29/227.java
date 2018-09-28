package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int i;
		double[] c = new double[1000];
		a[0] = 2;
		a[1] = 3;
		b[0] = 1;
		b[1] = 2;
		for (i = 2;i < 1000;i++)
		{
			a[i] = a[i - 1] + a[i - 2];
			b[i] = b[i - 1] + b[i - 2];
		}
		for (i = 0;i < 1000;i++)
		{
			c[i] = a[i] * 1.0 / b[i];
		}
		int m;
		int[] n = new int[100];
		int j;
		double[] sum = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (j = 0;j < m;j++)
		{
			sum[j] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[j] = Integer.parseInt(tempVar2);
			}
			for (i = 0;i < n[j];i++)
			{
				sum[j] += c[i];
			}
			System.out.printf("%.3lf\n",sum[j]);

		}
		 return 0;
	}

}

