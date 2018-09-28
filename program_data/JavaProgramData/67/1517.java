package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double[] a = new double[100];
		double[] b = new double[100];
		double[] y = new double[100];
		double p;
		double q;
		double rate;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		p = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		q = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		rate = q / p;
		for (i = 0;i < n - 1;i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = b[i] / a[i];
			if (y[i] - rate > 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else if (rate - y[i] > 0.05)
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

