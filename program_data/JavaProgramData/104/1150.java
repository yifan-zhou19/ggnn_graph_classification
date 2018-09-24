package <missing>;

public class GlobalMembers
{
	/*
	 *???? ???
	 *????: 2012-11-21
	*/
	public static void tree(int x,int y)
	{ //?????????
		if (x == y)
		{
			System.out.print(x);
		}
		else if (x < y)
		{
			tree(x, y / 2);
		}
		else if (x > y)
		{
			tree(x / 2, y);
		}
	}
	public static int Main()
	{
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		tree(x, y); //??x1
		return 0;
	}

}

