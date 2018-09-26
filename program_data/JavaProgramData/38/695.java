package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int i;
		int j;
		double[][] x = new double[100][1000];
		double[] sum = new double[100];
		double[] S = new double[100];
		double[] ave = new double[100];
		double[] sum2 = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			sum[i] = 0;
			S[i] = 0;
			ave[i] = 0;
			sum2[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			a = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < a;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[i][j] = Double.parseDouble(tempVar3);
				}
				sum[i] += x[i][j];
			}
			ave[i] = sum[i] / (a * 1.0);
			for (j = 0;j < a;j++)
			{
				sum2[i] += (x[i][j] - ave[i]) * (x[i][j] - ave[i]);
			}
			S[i] = Math.sqrt(sum2[i] / (a * 1.0));
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%.5lf\n",S[i]);
		}
		return 0;
	}
}

