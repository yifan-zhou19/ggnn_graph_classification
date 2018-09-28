package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		if (n == 1)
		{
			return 1;
		}
		else if (n == 2)
		{
			return 1;
		}
		else
		{
			return (f(n - 1) + f(n - 2));
		}
	}
	public static int Main()
	{
		int n = 0;
		int a = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(a));
			System.out.print("\n");
		}
		return 0;
	}
}

