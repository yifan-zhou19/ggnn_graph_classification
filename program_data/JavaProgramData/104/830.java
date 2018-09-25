package <missing>;

public class GlobalMembers
{
	public static void fuck(int x,int y)
	{
		int temp;
		if (x == y)
		{
			System.out.print(x);
		}
		else
		{
			if (y < x)
			{
				temp = x;
				x = y;
				y = temp;
			}
		fuck(x, y / 2);
		}
	}

	public static int Main()
	{
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		fuck(x, y);
		return 0;
	}
}

