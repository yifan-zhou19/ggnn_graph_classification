package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int j = 0;
		double[] x = new double[100];
		double[] y = new double[100];
		double dis = 0;
		double temp = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			x[i - 1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i - 1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= n;i++)
		{
			for (j = i;j <= n;j++)
			{
				temp = Math.sqrt((x[i - 1] - x[j - 1]) * (x[i - 1] - x[j - 1]) + (y[i - 1] - y[j - 1]) * (y[i - 1] - y[j - 1]));
				if (temp > dis)
				{
					dis = temp;
				}
			}
		}
		System.out.printf("%.4f\n", dis);
		return 0;
	}

}

