package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		double[][] a = new double[100][2];
		double[][] b = new double[100][100];
		double m = 0.0;
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
				a[i][0] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i][1] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < (n - 1);i++)
		{
			for (j = (i + 1);j < n;j++)
			{
				b[i][j] = Math.sqrt((a[j][0] - a[i][0]) * (a[j][0] - a[i][0]) + (a[j][1] - a[i][1]) * (a[j][1] - a[i][1]));
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (b[i][j] > m)
				{
					 m = b[i][j];
				}
			}
		}
		System.out.printf("%.4f\n",m);
	}
}

