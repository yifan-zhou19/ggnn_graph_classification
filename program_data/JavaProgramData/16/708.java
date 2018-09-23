package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		if (x < 10)
		{
			System.out.printf("%d",x);
		}
		else
		{
		while (x > 0)
		{
			y = x % 10 + 10 * y;
				x = x / 10;
		}
		if (x % 10 != 0)
		{
		System.out.printf("%d",y);
		}
		else
		{
		System.out.printf("%03d",y);
		}
		}
		return 0;
	}

}

