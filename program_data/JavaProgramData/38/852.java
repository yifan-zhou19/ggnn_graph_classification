package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		double[][] sz = new double[100][100];
		double[] sum1 = new double[100];
		double[] junzhi = new double[100];
		double[] e = new double[100];
		double[] sum2 = new double[100];
		double[] s = new double[100];
		double[] a = new double[100];
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
				m = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Double.parseDouble(tempVar3);
				}
				sum1[i] += (double)sz[i][j];
			}
			junzhi[i] = sum1[i] / (double)m;
			for (j = 0;j < m;j++)
			{
				e[j] = (junzhi[i] - sz[i][j]) * (junzhi[i] - sz[i][j]);
				sum2[i] += (double)e[j];
				a[i] = sum2[i] / (double)m;
				s[i] = Math.sqrt(a[i]);
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%.5lf\n",s[i]);
		}
		return 0;
	}

}

