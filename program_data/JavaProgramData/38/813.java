package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[][] as = new double[100][1000];
		int n;
		int i;
		int j;
		int[] x = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < x[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					as[i][j] = Double.parseDouble(tempVar3);
				}
			}
		}



		for (i = 0;i < n;i++)
		{
			double sum = 0;
			for (j = 0;j < x[i];j++)
			{
				sum += as[i][j];
			}
			double abs;
			abs = sum / (double)x[i];
			double pfh = 0;
			for (j = 0;j < x[i];j++)
			{
				pfh += ((as[i][j] - abs) * (as[i][j] - abs));
			}
			System.out.printf("%.5lf\n",Math.sqrt(pfh / (double)x[i]));
		}
	}










}

