package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		double[][] a = new double[20][2];
		double d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Double.parseDouble(tempVar2);
				}
			}
		}
		d = 0;
		for (i = 1;i <= n;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				if (d < Math.sqrt((a[i][1] - a[j][1]) * (a[i][1] - a[j][1]) + (a[i][2] - a[j][2]) * (a[i][2] - a[j][2])))
				{
					d = Math.sqrt((a[i][1] - a[j][1]) * (a[i][1] - a[j][1]) + (a[i][2] - a[j][2]) * (a[i][2] - a[j][2]));
				}
			}
		}
		System.out.printf("%.4lf\n",d);
	}
}

