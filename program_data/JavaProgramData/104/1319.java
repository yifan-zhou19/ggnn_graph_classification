package <missing>;

public class GlobalMembers
{
	public static int tree(int x,int y)
	{
		if (x < y)
		{
			return tree(x, (y - y % 2) / 2);
		}
		if (x > y)
		{
			return tree((x - x % 2) / 2, y);
		}
		if (x == y)
		{
			return x;
		}
	}

	public static int Main()
	{
		int a;
		int b;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(tree(a, b));
		System.out.print("\n");
		return 0;
	}

}

