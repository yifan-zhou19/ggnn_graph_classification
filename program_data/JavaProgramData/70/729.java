package <missing>;

public class GlobalMembers
{
	public static double juli(double x1,double y1,double x2,double y2)
	{
		double y;
		y = Math.sqrt(Math.pow(x1 - x2,2) + Math.pow(y1 - y2,2));
		return (y);
	}
	public static int Main()
	{
		int i;
		int j;
		int n;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] x = new double[10000];
		double[] y = new double[10000];
		double[] dis = new double[10000];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				dis[sum] = juli(x[i], y[i], x[j], y[j]);
				sum++;
			}
		}
		double t = dis[0];
		for (i = 0;i < sum;i++)
		{
			if (dis[i] > t)
			{
				t = dis[i];
			}
		}
		System.out.printf("%.4lf\n",t);
		return 0;
	}
}

