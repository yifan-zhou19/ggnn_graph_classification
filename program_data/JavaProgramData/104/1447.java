package <missing>;

public class GlobalMembers
{
	public static int k;
	public static void tree(int m, int n)
	{
		if (m == n)
		{
			k = m; // ??
		}
		else if (m > n)
		{
			tree(m / 2, n);
		}
		else if (m < n)
		{
			tree(m, n / 2); // ??
		}
	}
	public static int Main()
	{
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		tree(x, y);
		System.out.print(k);
		return 0;
	}

}

