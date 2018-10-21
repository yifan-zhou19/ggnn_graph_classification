package <missing>;

public class GlobalMembers
{
	public static void common(int a, int b)
	{
		if (a == b)
		{
			System.out.printf("%d",a);
		}
		else if ((a / 2) == b)
		{
			System.out.printf("%d",b);
		}
		else if (a == (b / 2))
		{
			System.out.printf("%d",a);
		}
		else if (a / 2 > b)
		{
			common(a / 2, b);
		}
		else if (b / 2 > a)
		{
			common(a, b / 2);
		}
		else
		{
			common(a / 2, b / 2);
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
		common(x, y);
	}
}

