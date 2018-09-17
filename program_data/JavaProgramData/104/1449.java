package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int route = new int(int x, int y); //????
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(route(x, y));
		return 0;
	}

	public static int route(int x, int y)
	{
		if (x == y)
		{
			return x;
		}
		else
		{
			if (x / 2 >= y)
			{
				return route(x / 2, y);
			}
			else if (x <= y / 2)
			{
				return route(x, y / 2);
			}
			else
			{
				return route(x / 2, y / 2);
			}
		}
	}
}

