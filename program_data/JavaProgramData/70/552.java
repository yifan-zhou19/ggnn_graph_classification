package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int k;
		double[][] a = new double[100][2];
		double m;
		double max = 0;
		double MAX = 0;
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
					a[i][j] = Double.parseDouble(tempVar2);
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (k = i + 1;k < n;k++)
			{
				m = Math.sqrt((a[i][0] - a[k][0]) * (a[i][0] - a[k][0]) + (a[i][1] - a[k][1]) * (a[i][1] - a[k][1]));
				if (m > max)
				{
					max = m;
				}
			}
		}
		System.out.printf("%.4lf\n",max);
	}

}

