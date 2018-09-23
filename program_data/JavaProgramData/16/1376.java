package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
			int x;
			int y;
		x = a % 10;
		y = a / 10;
		System.out.printf("%d",x);
		while (y > 0)
		{
			x = y % 10;
			y = y / 10;
			System.out.printf("%d",x);
		}
	}

}

