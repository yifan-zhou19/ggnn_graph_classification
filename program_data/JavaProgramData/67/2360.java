package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] a = new double[n];
		double[] b = new double[n];
		double[] y = new double[n - 1];
		double x;
		for (i = 0;i <= n - 1;i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		x = b[0] / a[0];
		for (i = 1;i <= n - 1;i++)
		{
				y[i - 1] = b[i] / a[i];
		}
		for (i = 0;i <= n - 2;i++)
		{
				if ((y[i] - x) > 0.05)
				{
					System.out.print("better");
					System.out.print("\n");
				}
			else if ((x - y[i]) > 0.05)
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			else
			{
				System.out.print("same");
				System.out.print("\n");
			}
		}
		return 0;
	}

}

