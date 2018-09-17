package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int t;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (x > y)
		{
		   t = x;
		   x = y;
		   y = t;
		}
		for (;(int)(Math.log(x) / Math.log(2)) != (int)(Math.log(y) / Math.log(2));)
		{
		  y = y / 2;
		}
		for (;(x != y);)
		{
			x = x / 2;
			y = y / 2;
		}
		System.out.print(x);
	}

}

