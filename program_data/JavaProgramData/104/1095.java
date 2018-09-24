package <missing>;

public class GlobalMembers
{
	public static int search(int n)
	{
		return n / 2;
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
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		while (x != y)
		{
			if (x > y)
			{
				x = search(x);
			}
			else if (x < y)
			{
				y = search(y);
			}
		}
		System.out.printf("%d", x);
		return 0;
	}
}

