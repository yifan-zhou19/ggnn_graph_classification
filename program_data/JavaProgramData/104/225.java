package <missing>;

public class GlobalMembers
{
	public static void check(int x,int y)
	{
		if (x == y)
		{
			System.out.printf("%d",x);
		}
		else
		{
			if (x > y && x / 2 >= y / 2)
			{
				check(x / 2, y);
			}
			if (x < y && x / 2 <= y / 2)
			{
				check(x, y / 2);
			}
		}
	}
	public static int Main()
	{
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		check(x, y);
	}
}

