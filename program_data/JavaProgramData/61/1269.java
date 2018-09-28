package <missing>;

public class GlobalMembers
{
	public static int f(int n, int a, int b)
	{
		if (n <= 0)
		{
			return a;
		}
		return f(n - 1, b, a + b);
	}
	public static int Main()
	{
		int n;
		int i;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(a - 1, 1, 1));
			System.out.print("\n");
		}
		return 0;
	}
}

