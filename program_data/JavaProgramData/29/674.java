package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[] a = new int[100];
		int i;
		int j;
		double[] b = new double[100];
		double sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			sum = 0.000;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 2;j < n + 2;j++)
			{
				a[0] = 1;
				a[1] = 1;
				a[j] = a[j - 2] + a[j - 1];
				b[j] = (double)a[j] / a[j - 1];
				sum = sum + b[j];
			}
			System.out.printf("%.3lf\n",sum);
		}

		return 0;
	}
}

