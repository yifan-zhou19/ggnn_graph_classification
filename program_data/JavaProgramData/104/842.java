package <missing>;

public class GlobalMembers
{
	public static void half(int x,int y)
	{
		if (x == y)
		{
			System.out.print(x);
			System.out.print("\n");
		}
		else if (x > y)
		{
			x = x / 2;
			half(x, y);
		}
		else
		{
			y = y / 2;
			half(x, y);
		}
	}
	public static int Main()
	{
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		half(x, y);
		return 0;
	}

}

