package <missing>;

public class GlobalMembers
{
	public static int an(int m,int n)
	{
		int c;
		if (n == 1 || m == 0 || m == 1)
		{
			c = 1;
		}
		else
		{
			if (m < 0)
			{
				c = 0;
			}
			else
			{
				c = an(m, n - 1) + an(m - n, n);
			}
		}
		return (c);
	}

	public static int Main()
	{
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (t-- != 0)
		{
			int m;
			int n;
			int x;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			x = an(m, n);
			System.out.print(x);
			System.out.print("\n");

		}
		return 0;
	}


}

