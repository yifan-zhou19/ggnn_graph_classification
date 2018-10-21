package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int x;
	 int y;
		y = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		while (x > 9)
		{
		  y = (y + x - x / 10 * 10) * 10;
		  x = x / 10;
		}
		y = y + x;
		System.out.printf("%d\n",y);
	}
}

