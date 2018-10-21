package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
		if (x > 2)
		{
			return (f(x - 1) + f(x - 2));
		}
		if (x == 1)
		{
			return 1;
		}
		if (x == 2)
		{
			return 1;
		}
	}

	public static int Main()
	{
		int n;
		int x;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(x));
			System.out.print("\n");
			System.out.print("\n");
		}
		return 0;
	}
}

