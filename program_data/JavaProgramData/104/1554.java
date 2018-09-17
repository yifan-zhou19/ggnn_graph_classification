package <missing>;

public class GlobalMembers
{
	public static int common(int x, int y)
	{
		if (x == y)
		{
			return x;
		}
		else if (x > y)
		{
			return common(x / 2, y);
		}
		else
		{
			return common(x, y / 2);
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
		int result = common(x, y);
		System.out.printf("%d\n",result);
		return 0;
	}

}

