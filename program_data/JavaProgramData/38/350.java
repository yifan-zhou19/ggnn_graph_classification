package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int[] n = new int[1000];
		double[][] x = new double[100][100];
		double[] ss = new double[1000];
		double[] s = new double[1000];
		double[] sum = new double[1000];
		double[] a = new double[1000];
		double[] y = new double[1000];
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
			for (j = 0;j < n[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[i][j] = Double.parseDouble(tempVar3);
				}
			}
			sum[i] = 0;
			ss[i] = 0;
			for (j = 0;j < n[i];j++)
			{
				sum[i] = sum[i] + x[i][j];
			}
			a[i] = sum[i] / n[i];
			for (j = 0;j < n[i];j++)
			{
				s[j] = ((x[i][j] - a[i]) * (x[i][j] - a[i]) / n[i]);
			}
			for (j = 0;j < n[i];j++)
			{
				ss[i] = ss[i] + s[j];
			}
			y[i] = Math.sqrt(ss[i]);

		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%.5f\n",y[i]);
		}
		return 0;
	}

}

