package <missing>;

public class GlobalMembers
{
	public static double f(double x1,double y1,double x2,double y2)
	{
		double d;
		d = Math.sqrt(Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2));
		return (d);
	}
	public static void Main()
	{
		int i;
		int j;
		int n;
		double dis;
		double[] x = new double[100];
		double[] y = new double[100];
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
		dis = f(x[0], y[0], x[1], y[1]);
		for (j = 0;j < n;j++)
		{
			for (i = j + 1;i < n - 1;i++)
			{
				if (f(x[i], y[i], x[j], y[j]) > dis)
				{
					dis = f(x[i], y[i], x[j], y[j]);
				}
			}
		}
		System.out.printf("%.4f\n",dis);
	}

}

