package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		double[] distance = new double[100];
		double b;
		double[][] x = new double[100][2];
		double c;
		double first;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					x[i][j] = Double.parseDouble(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (k = 1;k < n;k++)
			{
				b = Math.sqrt((x[k][0] - x[i][0]) * (x[k][0] - x[i][0]) + (x[k][1] - x[i][1]) * (x[k][1] - x[i][1]));
				if (i == 1)
				{
					c = b;
				}
				else
				{
					if (b > c)
					{
						c = b;
					}
				}
				distance[k] = c;
			}
		}
		for (k = 1;k < n;k++)
		{
			if (k == 1)
			{
				first = distance[1];
			}
			else
			{
				if (distance[i] > first)
				{
					first = distance[i];
				}
			}
		}
		System.out.printf("%.4lf",first);
		return 0;
	}
}

