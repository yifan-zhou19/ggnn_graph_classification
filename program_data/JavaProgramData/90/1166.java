package <missing>;

public class GlobalMembers
{
	public static int methods(int m,int n)
	{
		if (m < n)
		{
			return methods(m, m);
		}
		if ((m >= n) && (n > 1))
		{
			return (methods(m - n, n) + methods(m, n - 1));
		}
		if ((n <= 1))
		{
			return 1;
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int t;
		int i;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < t;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(methods(m, n));
			System.out.print("\n");
		}
		return 0;
	}
}

