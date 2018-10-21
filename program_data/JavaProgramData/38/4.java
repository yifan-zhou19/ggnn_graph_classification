package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		double[][] sz = new double[1000][100];
		double[] sum1 = new double[100];
		double[] sum2 = new double[100];
		double a;
		double[] s = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (int j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[j][i] = Double.parseDouble(tempVar3);
				}
				sum1[i] = sum1[i] + sz[j][i];
			}
			a = sum1[i] / (double)m;
			for (int l = 0;l < m;l++)
			{
				sum2[i] = sum2[i] + (sz[l][i] - a) * (sz[l][i] - a);
			}
			s[i] = Math.sqrt(sum2[i] / (double)m);
		}
		for (int y = 0;y < n;y++)
		{
			System.out.printf("%.5lf\n",s[y]);
		}
		return 0;
	}

}

