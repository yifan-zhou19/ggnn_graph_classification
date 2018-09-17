package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int t;
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
		if (x == 1 || y == 1)
		{
			System.out.print("1");
		}
		if (x != 1 && y != 1 && x == y)
		{
			System.out.printf("%d",x);
		}
		if (x != 1 && y != 1 && x != y)
		{
		do
		{
			if (x > y)
			{
			   t = x;
			   x = y;
			   y = t;
			}
			y = y / 2;
		} while (x != y);
		System.out.printf("%d",y);
		}
		return 0;
	}
}

