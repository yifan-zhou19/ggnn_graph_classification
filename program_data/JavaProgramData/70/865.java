package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] x = new double[100];
		double[] y = new double[100];
		double d;
		double maxd;
		int i;
		int j;
		int k;
		int m;
		maxd = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < k;i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 0;j < k;j++)
		{
			for (m = j + 1;m < k;m++)
			{
				d = Math.sqrt(Math.abs((x[j] - x[m]) * (x[j] - x[m]) + (y[j] - y[m]) * (y[j] - y[m])));
				if (d > maxd)
				{
					maxd = d;
				}
			}
		}
		   System.out.print(maxd);
		return 0;
	}
}

