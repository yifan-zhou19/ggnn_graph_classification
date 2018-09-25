package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sy;
		int sm;
		int sd;
		int ey;
		int em;
		int ed;
		int n;
		int year = int y;
		int mouth = new int(int m, int y);
		int day = int d;
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
		n = year(ey) + mouth(em, ey) + day(ed) - year(sy) - mouth(sm, sy) - day(sd);
		System.out.printf("%d\n", n);
		return 0;
	}

	public static int year(int y)
	{
		int i;
		int sum = 0;
		for (i = 1000;i < y;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
			sum = sum + 366;
			}
			else
			{
				sum = sum + 365;
			}
		}
		return (sum);
	}

	public static int mouth(int m, int y)
	{
		int i;
		int sum = 0;
		if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
		{
			for (i = 1;i < m;i++)
			{
				if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
				{
					sum = sum + 31;
				}
				else if (i == 2)
				{
					sum = sum + 29;
				}
				else
				{
					sum = sum + 30;
				}
			}
		}
		else
		{
			for (i = 1;i < m;i++)
			{
				if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
				{
					sum = sum + 31;
				}
				else if (i == 2)
				{
					sum = sum + 28;
				}
				else
				{
					sum = sum + 30;
				}
			}
		}
		return (sum);
	}

	public static int day(int d)
	{
		return (d - 1);
	}
}

