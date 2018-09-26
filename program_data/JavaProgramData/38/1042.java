package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int[] n = new int[100];
		int i;
		int j;
		double[][] x = new double[100][100];
		double[] sum = new double[100];
		double[] sum1 = new double[100];
		double[] re = new double[100];
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
				sum[i] += x[i][j];
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < n[i];j++)
			{
				sum1[i] += ((x[i][j] - sum[i] / n[i]) * (x[i][j] - sum[i] / n[i]));
			}
			re[i] = Math.sqrt(sum1[i] / n[i]);
			System.out.printf("%.5lf\n",re[i]);
		}
		return 0;
	}
}

