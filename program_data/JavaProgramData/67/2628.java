package <missing>;

public class GlobalMembers
{
	// homework : ?????
	// name     : ???
	// date     : 9.29


	public static int Main()
	{
		double n;
		double[] a = new double[3];
		double[] b = new double[3];
		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		a[0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		a[1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		a[2] = a[1] / a[0];
		for (int i = 1; i < n; i++)
		{
			b[0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b[1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b[2] = b[1] / b[0];
			if (b[2] - a[2] > 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			if (a[2] - b[2] > 0.05)
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			if (Math.abs(a[2] - b[2]) <= 0.05)
			{
				System.out.print("same");
				System.out.print("\n");
			}
		}


		return 0;
	}
}

