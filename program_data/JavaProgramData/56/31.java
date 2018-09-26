package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int x;
		int y = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		while (x > 0)
		{
			y = (y + x % 10) * 10;
			x = x / 10;
		}
		y = y / 10;
		System.out.printf("%d\n",y);
	}

}

