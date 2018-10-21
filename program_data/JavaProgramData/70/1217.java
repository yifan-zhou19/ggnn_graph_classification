package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	double[] a = new double[1000];
	double[] b = new double[1000];
	double[] c = new double[100000];
	for (int i = 0;i <= n - 1;i++)
	{
		a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	}
	int j = 0;
	for (int s = 0;s <= n - 2;s++)
	{
		for (int t = s + 1;t <= n - 1;t++)
		{
			c[j] = Math.sqrt((a[s] - a[t]) * (a[s] - a[t]) + (b[s] - b[t]) * (b[s] - b[t]));
			j++;
		}
	}

	double h;
	for (int d = 0;d < n * (n - 1) / 2 - 1;d++)
	{
	for (int f = 0;f < n * (n - 1) / 2 - 1 - d;f++)
	{
		if (c[f] > c[f + 1])
		{
			h = c[f];
			c[f] = c[f + 1];
			c[f + 1] = h;
		}
	}
	}
	System.out.print(c[n * (n - 1) / 2 - 1]);
	return 0;
	}

}

