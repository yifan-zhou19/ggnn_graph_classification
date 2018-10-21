package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void effect(double, double);
		int n;
		int i;
		int j;
		double k;
		double[][] data = new double[100][2];

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0; i < n; i++)
		{
			for (j = 0; j < 2; j++)
			{
				data[i][j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
		}

		k = data[0][1] / data[0][0];

		for (i = 1; i < n; i++)
		{
			effect(k, data[i][1] / data[i][0]);
		}

		return 0;
	}

	public static void effect(double k, double m)
	{
		if ((k - m) > 0.05)
		{
			System.out.print("worse");
			System.out.print("\n");
		}
		else if ((m - k) > 0.05)
		{
			System.out.print("better");
			System.out.print("\n");
		}
		else
		{
			System.out.print("same");
			System.out.print("\n");
		}
	}
}

