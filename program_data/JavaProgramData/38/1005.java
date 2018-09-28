package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		double sum = 0;
		double[] a = new double[101];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= k;i++)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = 0;
			for (int j = 1;j <= n;j++)
			{
				a[j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				sum += a[j];
			}
			double b = sum / n;
			double sum2 = 0;
			for (int j = 1;j <= n;j++)
			{
				sum2 += (a[j] - b) * (a[j] - b);
			}
			double S = Math.sqrt(sum2 / n);
			System.out.printf("%.5f\n",S);
		}
		return 0;
	}
}

