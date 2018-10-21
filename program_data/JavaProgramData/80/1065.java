package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int runnian = int year;
		int tianshu = new int(int moon, int yy);

		int y1;
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		int days;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			y2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			m2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			d2 = Integer.parseInt(tempVar6);
		}
		days = 0;
		for (i = y1;i < y2;i++)
		{
			if (runnian(i) == 0)
			{
				days = days + 365;
			}
			else
			{
				days = days + 366;
			}
		}
		for (j = 1;j < m1;j++)
		{
			days = days - tianshu(j, y1);
		}
		days = days - d1;
		for (j = 1;j < m2;j++)
		{
			days = days + tianshu(j, y2);
		}
		days = days + d2;
		System.out.printf("%d\n",days);
	}
	public static int runnian(int year)
	{
		int flag;
		flag = 0; //???
		if (year % 4 == 0)
		{
			if (year % 100 == 0)
			{
				if (year % 400 == 0 && year % 3200 != 0)
				{
					flag = 1;
				}
				else
				{
				flag = 0;
				}
			}
			else
			{
			flag = 1;
			}
		}
		else
		{
		flag = 0;
		}
		return (flag);
	}
	public static int tianshu(int moon, int yy)
	{
		int dd;
		dd = 0;
		if ((moon == 1) || (moon == 3) || (moon == 5) || (moon == 7) || (moon == 8) || (moon == 10) || (moon == 12))
		{
			dd = 31;
		}
		else
		{
			if (moon == 4 || moon == 6 || moon == 9 || moon == 11)
			{
				dd = 30;
			}
			else
			{
				if (runnian(yy) == 1)
				{
					dd = 29;
				}
				else
				{
					dd = 28;
				}
			}
		}
		return (dd);
	}

}

