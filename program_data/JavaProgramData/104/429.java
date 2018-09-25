package <missing>;

public class GlobalMembers
{
	public static int cmp(int x,int y) //????cmp
	{
		if (x == y) //???????x
		{
			return x;
		}
		else //??????????2????????
		{
			if (x > y)
			{
				x = x / 2;
			}
			if (x < y)
			{
				y = y / 2;
			}
			cmp(x, y);
		}
	}
	public static int Main() //???
	{
		int x; //??????x,y
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(cmp(x, y));
		return 0;
	}


}

