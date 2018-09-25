package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int j;
	public static int k;
	public static int m;
	public static int n;
	public static int way;
	public static int way1;
	public static int put(int m,int n)
	{
		if (m >= 0)
		{
			if (n == 1)
			{
				way = 1;
			}
			else
			{
				way = put(m - n, n) + put(m, n - 1);
			}
		}
		else
		{
			way = 0;
		}
		return way;
	}
	public static int Main()
	{
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (t-- != 0)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			way = put(m, n);
			System.out.print(way);
			System.out.print("\n");
		}
		return 0;
	}
}

