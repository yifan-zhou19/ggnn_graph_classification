package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[10000];
		int n = 0;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		int j = 0;
		int sum = 0;
		double max = 0;
		for (i = 0; i <= n - 1; i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i <= n - 1; i++)
		{
			for (j = 0; j <= n - 1; j++)
			{
				if (i != j)
				{
					c[k] = Math.sqrt(Math.pow(a[i] - a[j], 2) + Math.pow(b[i] - b[j], 2));
					k++;
				}
			}
		}
		sum = k;
		max = c[0];
		for (i = 0; i <= sum; i++)
		{
			if (max < c[i])
			{
				max = c[i];
			}
		}
		System.out.printf("%.4f", max);
		System.out.printf("%.4f", "\n");
		return 0;
	}
}

