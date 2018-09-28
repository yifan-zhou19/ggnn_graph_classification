package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double x;
		int i;
		int j;
		int m;
		int n;
		int j1;
		int j2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		double[] a = new double[100];
		for (i = 0;i < m;i++)
		{
			x = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			a[0] = 1,a[1] = 2;
			for (j = 2;j <= n;j++)
			{
				a[j] = a[j - 2] + a[j - 1];
			}


			for (j = 0;j < n;j++)
			{
				x = x + a[j + 1] / a[j];
			}
			System.out.printf("%.3lf\n",x);

		}
		return 0;
	}


}

