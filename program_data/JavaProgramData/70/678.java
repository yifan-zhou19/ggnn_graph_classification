package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		double d;
		double max = 0;
		double[] x = new double[100];
		double[] y = new double[100];
		double distance = new double(double x1,double y1,double x2,double y2);

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
				x[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				d = distance(x[i], y[i], x[j], y[j]);
				if (d > max)
				{
					max = d;
				}
			}
		}
		System.out.printf("%.4lf",max);
	}
	public static double distance(double x1,double y1,double x2,double y2)
	{
		double dis;
		dis = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		return (dis);
	}
}

