package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[1000];
		double[] b = new double[1000];
		double[] c = new double[1000];
		int i;

		a[0] = 2;
		a[1] = 3;
		for (i = 2;i < 1000;i++)
		{
			a[i] = a[i - 1] + a[i - 2];
		}
		b[0] = 1;
		b[1] = 2;
		for (i = 2;i < 1000;i++)
		{
			b[i] = b[i - 1] + b[i - 2];
		}
		for (i = 0;i < 1000;i++)
		{
			c[i] = a[i] / b[i];
		}

		int m;
		int n;
		int j;
		double sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n;j++)
			{
				sum += c[j];
			}
			System.out.printf("%.3lf\n",sum);
			sum = 0;
		}

		return 0;
	}
}

