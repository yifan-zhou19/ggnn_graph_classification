package <missing>;

public class GlobalMembers
{
	public static int waynum(int m, int n)
	{
		if (n == 1 || m == 1 || m == 0)
		{
			return 1;
		}
		else if (m <= 0)
		{
			return 0;
		}
		else
		{
			return (waynum(m, n - 1) + waynum(m - n, n));
		}
	}
	public static int Main()
	{
		int a;
		int m;
		int n;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (a -- != 0)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(waynum(m, n));
			System.out.print("\n");
		}
		return 0;
	}
}

