package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n,int k,int t)
	{
		if (((m % n) == k) && (t != 1))
		{
		return f((m - k) * (n - 1) / n, n, k, t - 1);
		}
		if (((m % n) != k) || (m < n))
		{
		return 0;
		}
		if ((t == 1) && (m % n) == k && (m >= n))
		{
		return 1;
		}



	}


	public static int Main()
	{
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int t;
		t = n;

		for (i = 2;;i++)
		{
			if (f(i, n, k, t) == 1)
			{
				System.out.print(i);
				break;
			}
		}
		return 0;
	}
}

