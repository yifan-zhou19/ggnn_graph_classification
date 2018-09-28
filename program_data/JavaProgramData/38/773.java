package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int n;
		int j;
		double he = 0;
		double[] sz = new double[100];
		double sum = 0;
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
				n = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n;j++)
			{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						sz[j] = Double.parseDouble(tempVar3);
					}
					sum += sz[j];
			}
			//printf("%.5lf\n",sum);

			double x = sum / (double)n;
			//printf("%.5lf\n",x);
			for (j = 0;j < n;j++)
			{
				double yige = (sz[j] - x) * (sz[j] - x);

				he += yige;
			}
			double s = Math.sqrt(he / n);
		System.out.printf("%.5lf\n",s);
		sum = 0;
		he = 0;
		}




		return 0;
	}








}

