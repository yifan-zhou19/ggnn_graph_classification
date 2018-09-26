package <missing>;

public class GlobalMembers
{
	public static double[] x = new double[1000];
	public static double[] y = new double[1000];
	public static double Calc_Dis(int i,int j)
	{
		double ret;
		ret = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
		return ret;
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		double dis;
		double maxd = 0;
		for (int i = 0; i < n; i++)
		{
			for (int j = i + 1; j < n; j++)
			{
				dis = Calc_Dis(i, j);
				if (dis > maxd)
				{
					maxd = dis;
				}
			}
		}
		System.out.printf("%.4f\n",maxd);
		return 0;
	}

}

