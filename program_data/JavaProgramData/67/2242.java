package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	double[] y = new double[500];
	double a;
	double b;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	y[0] = b / a;
	for (int i = 1; i < n; i++)
	{
	a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	y[i] = b / a;
	if (y[i] - y[0] > 0.05)
	{
		System.out.print("better");
	}
	else if (y[0] - y[i] > 0.05)
	{
		System.out.print("worse");
	}
	else
	{
		System.out.print("same");
	}
	System.out.print("\n");
	}
	return 0;
	}
}

