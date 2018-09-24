package <missing>;

public class GlobalMembers
{
	//??????
	public static int fun(int n)
	{
		if (n == 1 || n == 2)
		{
			return 1;
		}
		else
		{
			return fun(n - 1) + fun(n - 2);
		}
	}
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int x = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(fun(x));
			System.out.print("\n");
		}
		return 0;
	}

}

