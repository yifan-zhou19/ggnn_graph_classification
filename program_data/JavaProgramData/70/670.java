package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double[][] a = new double[100][2];
		double sum;
		double d = 0;
		double m;
		int i;
		int j;
		int n;
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
			for (j = i + 1;j < n;j++)
			{
				m = (a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]);
				sum = Math.sqrt((double)m);
				if (sum > d)
				{
					d = sum;
				}
			}
		}
			System.out.printf("%.4lf",d);
	}

}

