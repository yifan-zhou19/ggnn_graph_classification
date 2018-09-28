package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int[] n = new int[100];
		double[][] x = new double[100][100];
		double[] y = new double[100];
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		double[] S = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
			y[i] = 0.0;
			for (j = 0;j < n[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[i][j] = Double.parseDouble(tempVar3);
				}
				y[i] += x[i][j];
			}
			a[i] = y[i] / n[i];
		}
		for (i = 0;i < k;i++)
		{
			b[i] = 0.0;
			for (j = 0;j < n[i];j++)
			{
				b[i] += (x[i][j] - a[i]) * (x[i][j] - a[i]);
			}
			c[i] = b[i] / n[i];
			S[i] = Math.sqrt(c[i]);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%.5lf\n",S[i]);
		}
		return 0;
	}

}

