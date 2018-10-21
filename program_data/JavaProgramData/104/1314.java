package <missing>;

public class GlobalMembers
{
	public static int f(int a,int b)
	{
		if (a == b)
		{
			return a;
		}
		if (a < b)
		{
			return f(b, a);
		}
		if (a % 2 == 0)
		{
			return f(a / 2, b);
		}
		if (a % 2 == 1)
		{
			return f((a - 1) / 2, b);
		}
	}
	public static int Main()
	{
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (x >= y)
		{
			System.out.print(f(x, y));
			System.out.print("\n");
		}
		else
		{
			System.out.print(f(y, x));
			System.out.print("\n");
		}
		return 0;

	}

}

