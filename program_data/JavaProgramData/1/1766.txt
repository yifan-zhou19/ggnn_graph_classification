package <missing>;

public class GlobalMembers
{
	public static int f(int x,int y)
	{
		if (y == x)
		{
			return 1;
		}
		if (y > x)
		{
			return 0;
		}
		if (x % y == 0)
		{
			return f(x, y + 1) + f(x / y, y);
		}
		else
		{
			return f(x, y + 1);
		}
	}
	public static int Main()
	{
		int n;
		int x;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int z;
		int i;
		i = n;
		while (i > 0)
		{
			i = i - 1;
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			z = f(x, 2);
			System.out.print(z);
			System.out.print("\n");
		}
		return 0;
	}


}

