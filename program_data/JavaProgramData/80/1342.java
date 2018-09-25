package <missing>;

public class GlobalMembers
{
	public static int runnian(int year)
	{
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int dijitian(int y,int m,int d)
	{
		int i;
		int day = 0;
		if (runnian(y) != 0)
		{
			if (m == 2)
			{
				return (31 + d);
			}
			else if (m == 1)
			{
				return (d);
			}
			else
			{
				for (i = 1;i < m;i++)
				{
					if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
					{
						day += 31;
					}
					else if (i == 2)
					{
						day += 29;
					}
					else
					{
						day += 30;
					}
				}
				return (day + d);
			}
		}
		else
		{
			if (m == 2)
			{
				return (31 + d);
			}
			else if (m == 1)
			{
				return (d);
			}
			else
			{
				for (i = 1;i < m;i++)
				{
					if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
					{
						day += 31;
					}
					else if (i == 2)
					{
						day += 28;
					}
					else
					{
						day += 30;
					}
				}
				return (day + d);
			}
		}
	}


	public static int Main()
	{
		int y1;
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int day = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			y2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			m2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			d2 = Integer.parseInt(tempVar6);
		}
		k = dijitian(y1, m1, d1);
		l = dijitian(y2, m2, d2);
		if (y1 != y2)
		{
			for (i = y1;i < y2;i++)
			{
			if (runnian(i) != 0)
			{
				day += 366;
			}
			else
			{
				day += 365;
			}
			}
		}
		System.out.printf("%d",day + l - k);
		return 0;
	}

}

