package <missing>;

public class GlobalMembers
{
	public static double[][] sz = new double[100][1000];
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		double sum1 = 0.0;
		double sum2 = 0.0;
		double ave1;
		double ave2;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[0][j] = Double.parseDouble(tempVar3);
				}
				sum1 += sz[0][j];
			}
			ave1 = sum1 / n;
			for (j = 0;j < n;j++)
			{
				sum2 += (sz[0][j] - ave1) * (sz[0][j] - ave1);
			}
			ave2 = Math.sqrt(sum2 / n);
			System.out.printf("%.5f",ave2);
			sum1 = 0.0;
			sum2 = 0.0;


		for (i = 1;i < m;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				n = Integer.parseInt(tempVar4);
			}
			for (j = 0;j < n;j++)
			{
				String tempVar5 = ConsoleInput.scanfRead();
				if (tempVar5 != null)
				{
					sz[i][j] = Double.parseDouble(tempVar5);
				}
				sum1 += sz[i][j];
			}
			ave1 = sum1 / n;
			for (j = 0;j < n;j++)
			{
				sum2 += (sz[i][j] - ave1) * (sz[i][j] - ave1);
			}
			ave2 = Math.sqrt(sum2 / n);
			System.out.printf("\n%.5f",ave2);
				   sum1 = 0.0;
			   sum2 = 0.0;


		}

		return 0;
	}

}

