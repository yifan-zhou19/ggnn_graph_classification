package <missing>;

public class GlobalMembers
{
	//????????-1?/2?????/2
	//???i??2^(i-1)????2^i????

	//?2^n???
	public static int times2(int i)
	{
		int j;
		int s = 1;
		if (i == 0)
		{
			return 1;
		}
		else
		{
			for (j = 1;j <= i;j++)
			{
				s *= 2;
			}
			return s;
		}
	}

	//?k?????????
	public static int level(int k)
	{
		int i;
		for (i = 1;;i++)
		{
			if ((times2(i - 1) <= k) && (times2(i)> k))
			{
				return i;
			}
		}
	}

	//??????????
	public static int up(int x)
	{
		int y;
		if (x % 2 == 0)
		{
			y = x / 2;
		}
		else
		{
			y = (x - 1) / 2;
		}
		return y;
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
		if (level(x) == level(y))
		{
			while (x != y)
			{
				x = up(x);
				y = up(y);
			}
		}
		else
		{
			if (level(x) < level(y))
			{
				while (level(x) < level(y))
				{
					y = up(y);
				}
				while (x != y)
				{
					x = up(x);
					y = up(y);
				}
			}
			else
			{
				while (level(y) < level(x))
				{
					x = up(x);
				}
				while (x != y)
				{
					x = up(x);
					y = up(y);
				}
			}
		}
		System.out.printf("%d",x);
		return 0;
	}
}

