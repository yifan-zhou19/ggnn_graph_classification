package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int n;
			double z;
			double[] x = new double[1000];
			double[] y = new double[1000];
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int i = 1;i <= n;i++)
			{
				x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}

			for (int i = 1;i <= n;i++)
			{
			for (int j = 1;j <= n;j++)
			{
					if ((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) > z)
					{
					z = (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]);
					}
			}
			}
				  System.out.printf("%.4f", Math.sqrt(z));
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}

}

