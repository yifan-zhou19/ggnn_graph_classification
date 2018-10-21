package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int g;
		int k;
		double sum = 0;
		double m;
		double t;
		double max;
		double c;
		double d;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[400];
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = sum + a[i];
		}
		for (i = 0;i < n - 1;i++)
		{
			for (k = 0;k < n - 1;k++)
			{
				if (a[k] > a[k + 1])
				{
					g = a[k + 1];
					a[k + 1] = a[k];
					a[k] = g;
				}
			}
		}
		t = sum / n;
		max = (a[n - 1] - t) > 0?(a[n - 1] - t):(-a[n - 1] + t);
		m = a[n - 1];
		for (i = n - 2;i >= 0;i--)
		{
			if (a[i] - t < 0)
			{
				c = t - a[i];
			}
			else
			{
				c = a[i] - t;
			}
			if (c - max >= 0)
			{
				max = c;
				m = a[i];
			}
		}
		System.out.print(m);
		for (i = 0;i < n;i++)
		{
			if (a[i] - t < 0)
			{
				d = t - a[i];
			}
			else
			{
				d = a[i] - t;
			}
			if (d - max < 0.000000001 && d - max>-0.000000001 && a[i] != m)
			{
				System.out.print(",");
				System.out.print(a[i]);
			}
		}
		return 0;
	}
}

