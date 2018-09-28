package <missing>;

public class GlobalMembers
{
	public static int F(int x)
	{
		if (x == 2 || x == 1)
		{
			return 1;
		}
		return F(x - 1) + F(x - 2);
	}

	public static int Main()
	{
		int a;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (; n > 0; n--)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(F(a));
			System.out.print("\n");
		}
	}
}

