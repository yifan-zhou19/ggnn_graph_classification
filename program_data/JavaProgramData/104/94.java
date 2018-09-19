package <missing>;

public class GlobalMembers
{
	public static int er(int x,int y)
	{
		if (x > y)
		{
			return er(x / 2, y);
		}
		if (x < y)
		{
			return er(x, y / 2);
		}
		if (x == y)
		{
			return x;
		}
	}
	public static void Main()
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
		System.out.printf("%d",er(x, y));
	}
}

