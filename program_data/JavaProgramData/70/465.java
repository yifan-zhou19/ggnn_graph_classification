package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int m;
		int d = 1;
		double[][] a = new double[99][2];
		double max = 0;
		double x;
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
					x = Double.parseDouble(tempVar2);
				}
				a[i][j] = x;
			}
		}
			for (i = 0;i < (n - 1);i++)
			{
				for (m = d;m < n;m++)
				{
					if (((a[i][0] - a[m][0]) * (a[i][0] - a[m][0]) + (a[i][1] - a[m][1]) * (a[i][1] - a[m][1])) > max)
					{
						max = (a[i][0] - a[m][0]) * (a[i][0] - a[m][0]) + (a[i][1] - a[m][1]) * (a[i][1] - a[m][1]);
					}
				}
				d++;
			}
			System.out.printf("%.4lf\n",Math.sqrt(max));
	}

}

