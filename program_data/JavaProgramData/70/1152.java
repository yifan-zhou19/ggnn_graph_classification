package <missing>;

public class GlobalMembers
{
	public static double d(double x1,double y1,double x2,double y2)
	{
		return (Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)));
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] x = new double[100];
		double[] y = new double[100];
		for (int i = 1;i <= n;i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		double max = d(x[1], y[1], x[2], y[2]);
		for (int i = 1;i <= n;i++)
		{
			for (int j = i + 1;j <= n;j++)
			{
				if (d(x[i], y[i], x[j], y[j]) > max)
				{
					max = d(x[i], y[i], x[j], y[j]);
				}
			}
		}
		System.out.printf("%.4lf",max);
		return 0;
	}

}

