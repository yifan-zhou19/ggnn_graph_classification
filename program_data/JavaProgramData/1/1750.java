package <missing>;

public class GlobalMembers
{
	public static int f(int a,int b)
	{
		if (a == b)
		{
			return 1;
		}
		if (b > a)
		{
			return 0;
		}
		if (a % b != 0)
		{
			return f(a, b + 1);
		}
		if (a % b == 0)
		{
			return f(a, b + 1) + f(a / b, b);
		}
	}
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int x;
		int y;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y = 2;
			System.out.print(f(x, y));
			System.out.print("\n");
		}
		return 0;
	}
}

