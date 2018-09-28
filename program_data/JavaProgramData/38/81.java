package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int n;
		double[] x = new double[100];
		double f;
		double ave;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k-- != 0)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			f = 0;
			ave = 0;
			for (i = 0; i < n; i++)
			{
				x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				ave = ave + x[i] / n;
			}
			for (i = 0; i < n; i++)
			{
				f = f + ((x[i] - ave) * (x[i] - ave)) / n;
			}
			f = Math.sqrt(f);
			System.out.printf("%.5f", f);
			System.out.printf("%.5f", "\n");
		}
		return 0;
	}

}

