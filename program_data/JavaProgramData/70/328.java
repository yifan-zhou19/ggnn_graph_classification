package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		double[][] x = new double[100][2];
		double[][] y = new double[100][100];
		double z;
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
				x[i][0] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				x[i][1] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < n;k++)
			{
			y[i][k] = Math.sqrt((x[i][0] - x[k][0]) * (x[i][0] - x[k][0]) + (x[i][1] - x[k][1]) * (x[i][1] - x[k][1]));
			}
		}
		z = y[0][0];
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < n;k++)
			{
			if (z < y[i][k])
			{
				z = y[i][k];
			}
			}
		}
		System.out.printf("%.4lf",z);
		return 0;
	}
}

