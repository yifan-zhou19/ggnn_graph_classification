package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t = 0;
		int[] a = new int[300];
		int[] x = new int[300];
		double p;
		double m;
		double[] b = new double[300];
		double s = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n;i++)
		{
			s += a[i];
		}
		p = s / n;
		for (int i = 0;i < n;i++)
		{
			b[i] = Math.abs(a[i] - p);
		}
		m = b[0];
		for (int i = 0;i < n;i++)
		{
			if (b[i] > m)
			{
				m = b[i];
			}
		}
		for (int i = 0;i < n;i++)
		{
			if (b[i] == m)
			{
				x[t++] = a[i];
			}
		}
		for (int i = 0;i < t - 1;i++)
		{
			System.out.print(x[i]);
			System.out.print(",");
		}
		System.out.print(x[t - 1]);
		System.out.print("\n");
	}

}

