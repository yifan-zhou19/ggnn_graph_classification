package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[310];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int sum = 0;
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum += a[i];
		}
		double average = (double)sum / (double)n;
		for (int i = 0;i < n - 1;i++)
		{
			for (int j = 0;j < n - 1 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					int t;
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		int[] maxp = new int[310];
		int num = 0;
		double dmax = 0;
		for (int i = 0;i < n;i++)
		{
			double d = Math.abs((double)a[i] - average);
			if (d > dmax)
			{
				dmax = d;
			}
		}
		for (int i = 0;i < n;i++)
		{
			double d = Math.abs((double)a[i] - average);
			if (Math.abs(d - dmax) < 1e-8)
			{
				maxp[num++] = i;
			}
		}
		for (int i = 0;i < num - 1;i++)
		{
			System.out.print(a[maxp[i]]);
			System.out.print(",");
		}
		System.out.print(a[maxp[num - 1]]);
		return 0;
	}
}

