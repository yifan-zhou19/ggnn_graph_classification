package <missing>;

public class GlobalMembers
{
	public static double dis(double[] a, double[] b)
	{
		double distance;
		distance = Math.sqrt((a[0] - b[0]) * (a[0] - b[0]) + (a[1] - b[1]) * (a[1] - b[1]));
		return distance;
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		double[][] x = new double[100][2];
		double[] d = new double[500];
		double max;
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
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				d[i + j] = dis(x[i], x[j]);
			}
		}
		max = d[1];
		for (k = 2;k <= 2 * n - 3;k++)
		{
			if (d[k] > max)
			{
				max = d[k];
			}
		}
		System.out.printf("%.4lf",max);
	}
}

