package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int c = new int(int x,int y);
		int x; //???x?y
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(c(x, y));
		System.out.print("\n");
	return 0;
	}

	public static int c(int x,int y) //?????
	{
		int z;
		if (x == y) //???????
		{
			z = x;
		}
		if (x > y)
		{
			z = c(x / 2, y); //???????
		}
		if (y > x)
		{
			z = c(x, y / 2);
		}
		return z;
	}
}

