package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n = new int[500];
		int i;
		int j;
		int m;
		int[] a = new int[500];
		double[] b = new double[500];
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
		a[0] = 1;
		a[1] = 2;
		for (i = 2;i < 500;i++)
		{
			 a[i] = a[i - 1] + a[i - 2];
		}
		for (i = 0;i < m;i++)
		{
			b[i] = 0;
			for (j = 0;j < n[i];j++)
			{
				b[i] += a[j + 1] * 1.0 / a[j];
			}
			System.out.printf("%.3lf\n",b[i]);
		}
		return 0;
	}
}

