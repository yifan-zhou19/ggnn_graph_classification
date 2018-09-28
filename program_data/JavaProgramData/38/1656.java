package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[100];
		double[][] sz = new double[100][100];
		double[] sum = new double[100];
		double[] m = new double[100];
		double[] p = new double[100];
		double[] s = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			sum[i] = 0;
			for (j = 0;j < a[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Double.parseDouble(tempVar3);
				}
				sum[i] += sz[i][j] / a[i];
			}
				p[i] = 0;
			for (j = 0;j < a[i];j++)
			{
				p[i] += (sz[i][j] - sum[i]) * (sz[i][j] - sum[i]);
			}
			s[i] = Math.sqrt(p[i] / a[i]);
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%.5f\n",s[i]);
		}
		return 0;
	}
}

