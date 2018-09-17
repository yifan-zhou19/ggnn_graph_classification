package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int y;
		int same = new int(int m,int n);
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
		System.out.printf("%d",same(x, y));
	}

	public static int same(int x,int y)
	{
		while (x != y)
		{
			if (x > y)
			{
				x = x / 2;
			}
			else
			{
				y = y / 2;
			}
		}
		return x;
	}
}

