package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = new int(int x,int y,int z);
		int year1;
		int year2;
		int month1;
		int month2;
		int day1;
		int day2;
		int sum = 0;
		int i;
		int d1;
		int d2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			month1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			day1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead("\n");
		if (tempVar4 != null)
		{
			year2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			month2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			day2 = Integer.parseInt(tempVar6);
		}
		for (i = year1;i < year2;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400) == 0)
			{
				sum = sum + 366;
			}
			else
			{
				sum = sum + 365;
			}
		}
		d1 = f(year1, month1, day1);
		d2 = f(year2, month2, day2);
		sum = sum + (d2 - d1);
		System.out.printf("%d\n",sum);
		return 0;
	}
	public static int f(int x,int y,int z)
	{
		int p = 0;
		int i;
		for (i = 1;i < y;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				p = p + 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				p = p + 30;
			}
			if (i == 2)
			{
				if ((x % 4 == 0 && x % 100 != 0) || (x % 400) == 0)
				{
					p = p + 29;
				}
				else
				{
					p = p + 28;
				}
			}
		}
		p = p + z;
		return p;
	}

}

