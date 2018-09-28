package <missing>;

public class GlobalMembers
{
		public static int i;
		public static int num(int year,int month,int day)
		{
			int n = day;
			for (i = 1;i < month;i++)
			{
				if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
				{
					n += 31;
				}
				else if (i == 4 || i == 6 || i == 9 || i == 11)
				{
					n += 30;
				}
				else if (i == 2)
				{
					if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
					{
						n += 29;
					}
					else
					{
						n += 28;
					}
				}
			}
			for (i = 1;i < year;i++)
			{
				if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
				{
					n += 366;
				}
				else
				{
					n += 365;
				}
			}
			return n;
		}
	public static int Main()
	{
		int sy;
		int sm;
		int sd;
		int ey;
		int em;
		int ed;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sy = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sm = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sd = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			ey = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			em = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			ed = Integer.parseInt(tempVar6);
		}
		m = num(ey, em, ed) - num(sy, sm, sd);
		System.out.printf("%d",m);
		return 0;
	}
}

