package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < k;i++)
		{
			int n;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			double[] a = new double[n];
			double x = 0;
			double S = 0;
			for (int j = 0;j < n;j++)
			{
				a[j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
			for (int j = 0;j < n;j++)
			{
			x += a[j];
			}
			x = x / n;
			for (int j = 0;j < n;j++)
			{
				S += Math.pow(x - a[j],2);
			}
			S = S / n;
			S = Math.sqrt(S);

			System.out.printf("%.5f", S);
			System.out.printf("%.5f", "\n");
		}

		return 0;
	}

}

