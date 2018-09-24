package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n = new int[N];
		int m;
		int i;
		int j;
		double[] f = new double[N];
		double[] d = new double[N];
		double[] c = new double[N];
		double sum = 0.0;
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
			for (j = 0;j < m;j++)
			{
					f[0] = 2.0;
					f[1] = 3.0;
					d[0] = 1.0;
					d[1] = 2.0;

			for (i = 2;i < n[j];i++)
			{

				f[i] = f[i - 1] + f[i - 2];
				d[i] = d[i - 1] + d[i - 2];
			}

			for (i = 0;i < n[j];i++)
			{
				c[i] = f[i] / d[i];
				sum += c[i];
			}
			System.out.printf("%.3lf\n",sum);
			sum = 0.0;
			}

	return 0;
	}
}

