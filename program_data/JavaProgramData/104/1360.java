package <missing>;

public class GlobalMembers
{
	public static int f(int a,int b)
	{
		if (a == b)
		{
			return a;
		}
		else if (a > b)
		{
			a = a / 2;
			return f(a, b);
		}
		else
		{
			b = b / 2;
			return f(a, b);
		}
	}
	public static int Main()
	{
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(f(x, y));
		System.out.print("\n");
		return 0;
	}

}

