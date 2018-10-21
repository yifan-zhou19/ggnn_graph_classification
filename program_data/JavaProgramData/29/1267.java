package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int[] n = new int[1000];
		int[] b = new int[1000];
		int i;
		int j;
		double[] a = new double[1000];
		double[] s = new double[1000];

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
			for (j = 3;j <= n[i] + 1;j++)
			{
				b[1] = 1;
				b[2] = 2;
				b[j] = b[j - 1] + b[j - 2];
			}
		}

		for (i = 0;i <= m;i++)
		{
			for (j = 1;j <= n[i];j++)
			{
				a[j] = 1.000 * b[j + 1] / b[j];
			}
		}
		for (i = 0;i <= m;i++)
		{
			s[i] = 0;
		}

		for (i = 0;i <= m;i++)
		{
			for (j = 1;j <= n[i];j++)
			{
				s[i + 1] += a[j];
			}
		}

		for (i = 1;i <= m;i++)
		{
			System.out.printf("%.3lf\n",s[i]);
		}


		return 0;
	}


}

