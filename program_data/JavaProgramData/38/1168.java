package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int k;
		int i = 0;
		int j = 0;
		int[] n = new int[100];
		double[][] x = new double[100][100];
		double[] aver = new double[100];
		double[] sum = new double[100];
		double[] S = new double[100];
		double[] s = new double[100];

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
			j = 0;
			for (j = 0;j < n[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[i][j] = Double.parseDouble(tempVar3);
				}
				sum[i] = sum[i] + x[i][j];
			}
		}
		i = 0;
		for (i = 0;i < k;i++)
		{
			aver[i] = sum[i] / n[i];
		}
		i = 0;
		for (i = 0;i < k;i++)
		{
			j = 0;
			for (j = 0;j < n[i];j++)
			{
				S[i] = S[i] + Math.pow((x[i][j] - aver[i]),2);
			}

		}
		i = 0;
		for (i = 0;i < k;i++)
		{
			s[i] = Math.pow(S[i] / n[i],1.0 / 2);
			System.out.printf("%.5lf\n",s[i]);
		}

	}

}

