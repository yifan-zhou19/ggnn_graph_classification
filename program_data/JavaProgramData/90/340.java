package <missing>;

public class GlobalMembers
{
	/*???
	???*/
	public static int sum(int m, int n, int lim) //m????n???????????
	{
		if (n == 1 && m <= lim)
		{
			return 1;
		}
		if (n == 1 && m > lim)
		{
			return 0;
		}
		if (m == 0)
		{
			return 1;
		}
		int max;
		int i;
		int a;
		if (m % n == 0)
		{
			max = m / n;
		}
		else
		{
			max = m / n + 1;
		}

		a = 0;
		if (lim > m)
		{
			lim = m;
		}
		for (i = lim; i >= max; i--)
		{
			a += sum(m - i, n - 1, i);
		}
		return a;
	}
	public static int Main()
	{
		int m;
		int n;
		int k;
		int i;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= k; i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(sum(m, n, m));
			System.out.print("\n");
		}
		return 0;
	}


}

