package <missing>;

public class GlobalMembers
{
	public static int la(int n,int m)
	{
		if (n == 0)
		{
			return 1;
		}
		if (n == 1)
		{
			return 1;
		}
		else
		{
			int p;
			if (m >= n)
			{
				p = la(n, m - n) + la(n - 1, m);
			}
			else
			{
				p = la(n - 1, m);
			}
			return p;
		}
	}

	public static int Main()
	{
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= k;i++)
		{
			int n;
			int m;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(la(n, m));
			System.out.print("\n");
		}
	}
}

