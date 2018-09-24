package <missing>;

public class GlobalMembers
{
	public static int x;
	public static int f(int n)
	{
		if (n == 1 || n == 2)
		{
			x = 1;
		}
		else
		{
			x = f(n - 1) + f(n - 2);
		}
		return x;
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
			System.out.print(f(a));
			System.out.print("\n");
		}
		return 0;
	}


}

