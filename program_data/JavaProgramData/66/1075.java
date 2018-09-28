package <missing>;

public class GlobalMembers
{
	public static int runnian(int y)
	{
		int result;
		if ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0))
		{
			result = 1;
		}
		else
		{
			result = 0;
		}
		return result;
	}
	public static int lunhun(int y, int m, int d)
	{
		int x = 0;
		if (y % 400 != 0)
		{
			y = y % 400;
		}
		else
		{
			y = 400;
		}
		for (int i = 1;i < m;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				x += 3;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				x += 2;
			}
			else if (i == 2)
			{
				if (runnian(y) != 0)
				{
					x += 1;
				}
			}
		}
		x += d % 7;
		for (int j = 1;j < y;j++)
		{
			if (runnian(j) != 0)
			{
				x += 1;
			}
		}
		x = x + y - 1;
		return x;
	}
	public static int Main()
	{
		int y;
		int m;
		int d;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		x = lunhun(y, m, d);
		x = x % 7;
		switch (x)
		{
		case 1:
			System.out.print("Mon.");
			break;
		case 2:
			System.out.print("Tue.");
			break;
		case 3:
			System.out.print("Wed.");
			break;
		case 4:
			System.out.print("Thu.");
			break;
		case 5:
			System.out.print("Fri.");
			break;
		case 6:
			System.out.print("Sat.");
			break;
		case 0:
			System.out.print("Sun.");
			break;
		}
		return 0;
	}

}

