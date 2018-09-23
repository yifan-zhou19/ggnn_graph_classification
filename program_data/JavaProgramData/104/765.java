package <missing>;

public class GlobalMembers
{
	public static int f(int x,int y)
	{ //??????????????????
		int p; //????
		if (x == y)
		{
			return x; //?x=y??????x
		}
		else
		{ //??
			if (x > y)
			{
				p = x;
				x = y;
				y = p;
			} //?y????
			if (y % 2 == 0)
			{
				y = y / 2;
			}
			else
			{
				y = (y - 1) / 2; //?y???????y
			}
			return f(x, y); //??f(x,y)
		}
	}
	public static int Main()
	{ //?????
		int x; //????
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(f(x, y));
		System.out.print("\n");
		return 0;
	}
}

