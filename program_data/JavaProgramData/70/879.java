package <missing>;

public class GlobalMembers
{
	public static double dis(double x1,double y1,double x2,double y2)
	{
		double dis;
		double x = Math.pow(x2 - x1,2);
		double y = Math.pow(y2 - y1,2);
		dis = Math.sqrt(x + y);
		return dis;
		return 0;
	}

	public static int Main()
	{
		double[] x = new double[100];
		double[] y = new double[100];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		double p = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (dis(x[i], y[i], x[j], y[j]) > p)
				{
					p = dis(x[i], y[i], x[j], y[j]);
				}
			}
		}
		System.out.printf("%.4f\n",p);
		return 0;
	}
}

