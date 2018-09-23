package <missing>;

public class GlobalMembers
{
	public static int runnian(int y)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		if ((y % 4 == 0 && y % 100 != 0) || (y % 100 == 0 && y % 400 == 0))
		{
			y = 366;
		}
		else
		{
			y = 365;
		}
		return y;
	}
	public static int Main(int y,int m,int d)
	{
		int i;
		int n;
		n = 0;
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
		for (i = 1;i < m;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 | i == 8 || i == 10 || i == 12)
			{
				n += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				n += 30;
			}
			else if (i == 2)
			{
				if (runnian(y) == 366)
				{
					n += 29;
				}
				else
				{
					n += 28;
				}
			}
		}
		n += d;
		System.out.printf("%d\n",n);
		return 0;
	}

}

