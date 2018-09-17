package <missing>;

public class GlobalMembers
{
	public static int f(int x,int y)
	{
		if (x == y)
		{
			return x;
		}
		if (x < y)
		{
			return f(x, Math.floor(y / 2));
		}
		if (x > y)
		{
			return f(Math.floor(x / 2), y);
		}
	}
	public static int Main()
	{
		int n = 0;
		int X;
		int Y = 0;
	X = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	Y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(X, Y));
			System.out.print("\n");
	return 0;
	}

}

