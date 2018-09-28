package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int q = 0;
		int k = 0;
		int n = 0;
		int i = 0;
		double[] x = new double[100];
		double[] y = new double[100];
		double[] s = new double[100];
		double Max = 0.0;
		double Maxx = 0.0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (q = 0;q < n;q++)
		{
			x[q] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[q] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (q = 0;q < n;q++)
		{
			for (i = 0;i < n;i++)
			{
			s[i] = Math.sqrt((x[i] - x[q]) * (x[i] - x[q]) + (y[i] - y[q]) * (y[i] - y[q]));
		if (s[i] > Max)
		{
			Max = s[i];
		}
		if (Maxx < Max)
		{
			Maxx = Max;
		}
			}
		}
		System.out.print(Maxx);
		System.out.print("\n");

	return 0;
	}

}

