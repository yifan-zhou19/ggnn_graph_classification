package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int j;
		double[] x = new double[101];
		double sum;
		double ave;
		double p;
		double s;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= k; i++)
		{
			sum = 0;
			p = 0;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 1; j <= n; j++)
			{
				x[j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				sum = sum + x[j];
			}
			ave = sum / n;
			for (j = 1; j <= n; j++)
			{
				p = p + (x[j] - ave) * (x[j] - ave);
			}
			s = Math.sqrt(p / n);
			System.out.printf("%.5f", s);
			System.out.printf("%.5f", "\n");
		}
		return 0;
	}
}

