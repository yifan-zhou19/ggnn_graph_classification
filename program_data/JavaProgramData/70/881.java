package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] x = new double[100];
		double[] y = new double[100];
		double m;
		double d;
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 1;j < n;j++)
			{
			d = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
			if (d > m)
			{
				m = d;
			}
			}
		}
		System.out.print(m);
		return 0;
	}






}

