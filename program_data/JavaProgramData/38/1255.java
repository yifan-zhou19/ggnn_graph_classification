package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[][] num = new double[100][100];
			int m;
			int n;
			int i;
			int j;
			double sum;
			double average;
			double sums;
			double u;
			double t;
			double s;
			double averages;
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
					sums = sum = 0;
					for (j = 0;j < n;j++)
					{
							String tempVar3 = ConsoleInput.scanfRead();
							if (tempVar3 != null)
							{
								num[i][j] = Double.parseDouble(tempVar3);
							}
							sum += num[i][j];
					}
					average = sum / n;
					for (j = 0;j < n;j++)
					{
							u = num[i][j] - average;
							t = u * u;
							sums += t;
					}
					averages = sums / n;
					s = Math.sqrt(averages);
					System.out.printf("%.5f\n",s);


			}
			return 0;
	}


}

