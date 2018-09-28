package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int m;
		int[] n = new int[100];
		int i;
		int j;
		double[] result = new double[100];

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
				(n[i]) = Integer.parseInt(tempVar2);
			}
		}

		a[0] = 2;
		b[0] = 1;
		result[0] = (double)a[0] / (double)b[0];

		for (j = 0;j < m;j++)
		{
			for (i = 1;i < n[j];i++)
			{
				a[i] = a[i - 1] + b[i - 1];
				b[i] = a[i - 1];
				result[i] = result[i - 1] + (double)a[i] / (double)b[i];
			}

			System.out.printf("%.3lf\n",result[i - 1]);
		}
		return 0;
	}
}

