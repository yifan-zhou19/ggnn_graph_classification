package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] m = new int[100];
		int i;
		int j;
		double[] x = new double[1000];
		double[] y = new double[100];
		double[] z = new double[100];
		double[] p = new double[100];
		double[] g = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[j] = Integer.parseInt(tempVar2);
			}
			for (i = 0;i < m[j];i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[i] = Double.parseDouble(tempVar3);
				}
				z[j] += x[i];
			}
			p[j] = z[j] / m[j];
			for (i = 0;i < m[j];i++)
			{
				y[j] += Math.pow(x[i] - p[j],2);
			}
			g[j] = Math.sqrt(y[j] / m[j]);
		}
		for (j = 0;j < n;j++)
		{
			System.out.printf("%0.5lf\n",g[j]);
		}
		return 0;
	}



}

