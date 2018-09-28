package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] total = new double[10000];
		double[] valid = new double[10000];
		double t1;
		double v1;
		double std;
		double[] x = new double[10000];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		t1 = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		v1 = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		std = v1 / t1;
		for (int i = 0;i < n - 1;i++)
		{
			total[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			valid[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			x[i] = valid[i] / total[i];
			if (std - x[i] > 0.05)
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			if (x[i] - std > 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			if ((std - x[i] <= 0.05 && std - x[i] >= 0) || (x[i] - std <= 0.05 && x[i] - std >= 0))
			{
				System.out.print("same");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

