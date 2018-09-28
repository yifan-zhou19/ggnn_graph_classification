package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double[][] a = new double[100][2];
		double k;
		double dis;
		int n;
		int i;
		int j;
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
	 k = Math.sqrt((a[0][0] - a[n - 1][0]) * (a[0][0] - a[n - 1][0]) + (a[0][1] - a[n - 1][1]) * (a[0][1] - a[n - 1][1]));
		for (i = 0;i < n - 1;i++)
		{
			for (j = n - 1;j > i + 1;j--)
			{
				dis = Math.sqrt((a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]));
				if (dis > k)
				{
					k = dis;
				}





			}
		}
	System.out.printf("%.4f\n",k);
	}
}

