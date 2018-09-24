package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[302];
		int[] c = new int[302];
		int t = 0;
		int temp;
		int j;
		double[] b = new double[302];
		double sum = 0;
		double maxnum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum += a[i];
		}
		for (i = 1; i <= n; i++)
		{
			b[i] = Math.abs(sum / n - a[i]);
			if (maxnum < b[i])
			{
				maxnum = b[i];
			}
		}
		for (i = 1; i <= n; i++)
		{
			if (b[i] == maxnum)
			{
				c[t] = a[i];
				t++;
			}
		}
		System.out.print(c[0]);
		for (i = 0; i < t; i++)
		{
			for (j = 0; j < t - 1 - i; j++)
			{
				if (c[j] > c[j + 1])
				{
					temp = c[j + 1];
					c[j + 1] = c[j];
					c[j] = temp;
				}
			}
		}
		for (i = 1; i < t; i++)
		{
			System.out.print(",");
			System.out.print(c[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

