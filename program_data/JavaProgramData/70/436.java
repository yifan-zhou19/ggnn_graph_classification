package <missing>;

public class GlobalMembers
{
	public static double[] x = new double[40];
	public static double[] y = new double[40];
	public static double dis(int i,int j)
	{
		double z;
		z = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
		return z;
	}
	public static void Main()
	{
		double[][] a = new double[40][40];
		double max;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i] = Double.parseDouble(tempVar3);
			}
		}
		for (j = 1;j <= n;j++)
		{
			for (i = j;i <= n;i++)
			{
				a[j][i] = dis(i, j);
			}
		}
		for (j = 1,max = a[1][1];j <= n;j++)
		{
			for (i = j;i <= n;i++)
			{
				if (a[j][i] > max)
				{
					max = a[j][i];
				}
			}
		}
		System.out.printf("%.4f\n",max);
	}
}

