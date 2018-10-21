package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double[] total = new double[100];
	double[] good = new double[100];
	double[] pre = new double[100];
	int n;
	int i;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i <= n - 1;i++)
	{
		total[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		good[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		pre[i] = good[i] / total[i];
	}
	for (i = 1;i <= n - 1 ;i++)
	{
		if (pre[i] - pre[0] >= 0.0500000)
		{
			System.out.print("better");
			System.out.print("\n");
		}

		if (pre[0] - pre[i] > 0.0500000)
		{
			System.out.print("worse");
			System.out.print("\n");
		}
		if ((pre[i] - pre[0] < 0.0500000 && pre[i] - pre[0] >= 0) || (pre[0] - pre[i] <= 0.05000000 && pre[0] - pre[i] >= 0))
		{
			System.out.print("same");
			System.out.print("\n");
		}

		System.out.print("\n");
	}

	return 0;
	}
}

