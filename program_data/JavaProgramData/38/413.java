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
		double[] a = new double[100];
		double[] s = new double[100];
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
			for (j = 0;j < n[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[i][j] = Double.parseDouble(tempVar3);
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < n[i];j++)
			{
			   a[i] += x[i][j] / n[i];
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < n[i];j++)
			{
			   s[i] += (x[i][j] - a[i]) * (x[i][j] - a[i]);
			}
		}
		for (i = 0;i < k;i++)
		{
			S[i] = Math.sqrt(s[i] / n[i]);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%.5lf\n", S[i]);
		}
		return 0;
	}

}

