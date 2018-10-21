package <missing>;

public class GlobalMembers
{
	public static int m;

	public static int f(int x)
	{
		// pick the last monkey.
		if (x == 1)
		{
			return 1;
		}
		// who's kicked off?
		int k = m % x;
		if (k == 0)
		{
			// kick off the n-th monkey, so it is exactly f(x-1)
			return f(x - 1);
		}
		else
		{
			int t = f(x - 1);
			if (t <= x - k)
			{
				return k + t;
			}
			else
			{
				return t - (x - k);
			}
		}

	}
	public static int Main()
	{
		int n;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n == 0)
			{
				break;
			}
			System.out.printf("%d\n", f(n));
		}
	}








}

