package <missing>;

public class GlobalMembers
{
	public static int f(int x, int y)
	{
		while (x != y) //??x=y??x;?????????????????
		{
			if (x > y)
			{
				x = x / 2;
			}
			else
			{
				y = y / 2;
			}
			return f(x, y);
		}
		return x; //??????????
	}
	public static int Main() //????
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

