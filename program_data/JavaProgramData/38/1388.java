package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		double[][] sz = new double[NUM][LEN];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			double sum = 0;
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Double.parseDouble(tempVar3);
				}
				sum += sz[i][j];
			}
			double a;
			a = sum / n;
			sum = 0;
			for (j = 0;j < n;j++)
			{
				sum += (sz[i][j] - a) * (sz[i][j] - a);
			}
			sum = sum / n;
			sum = Math.sqrt(sum);
			System.out.printf("%.5lf\n",sum);
		}
		return 0;
	}
}

