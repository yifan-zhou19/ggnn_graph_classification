package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int x = 0;
		int i;
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
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
		{
			for (i = 1;i < m;i++)
			{
				if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
				{
					x = x + 31;
				}
				else if (i == 4 || i == 6 || i == 9 || i == 11)
				{
					x = x + 30;
				}
				else
				{
					x = x + 29;
				}
			}
			x = x + d;
		}
		else
		{
			for (i = 1;i < m;i++)
			{
				if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
				{
					x = x + 31;
				}
				else if (i == 4 || i == 6 || i == 9 || i == 11)
				{
					x = x + 30;
				}
				else
				{
					x = x + 28;
				}
			}
			x = x + d;
		}
		System.out.printf("%d\n",x);
		return 0;
	}


}

