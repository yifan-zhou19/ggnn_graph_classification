package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		double[] a = new double[1000];
		a[1] = 1;
		a[2] = 2;
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
				n = Integer.parseInt(tempVar2);
			}
			double sum = 0;
			for (j = 1;j <= n;j++)
			{
			  sum += a[j + 1] / a[j];
			  a[j + 2] = a[j + 1] + a[j];
			}
			System.out.printf("%.3lf\n",sum);
		}
		return 0;
	}


}

