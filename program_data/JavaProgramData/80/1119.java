package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year1;
		int year2;
		int month1;
		int month2;
		int day1;
		int day2;
		int n = 0;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			year2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			month2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			day2 = Integer.parseInt(tempVar6);
		}
		for (i = year1;i < year2;i++)
		{
			if (i % 4 != 0 || (i % 100 == 0 && i % 400 != 0))
			{
				n += 365;
			}
			else
			{
				n += 366;
			}
		}
		for (j = 1;j < month1;j++)
		{
			if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10)
			{
				n -= 31;
			}
			else if (j != 2)
			{
				n -= 30;
			}
			else if (year2 % 4 != 0 || (year2 % 100 == 0 && year2 % 400 != 0))
			{
				n -= 28;
			}
			else
			{
				n -= 29;
			}
		}
		n -= day1;
		for (k = 1;k < month2;k++)
		{
			if (k == 1 || k == 3 || k == 5 || k == 7 || k == 8 || k == 10)
			{
				n += 31;
			}
			else if (k != 2)
			{
				n += 30;
			}
			else if (year2 % 4 != 0 || (year2 % 100 == 0 && year2 % 400 != 0))
			{
				n += 28;
			}
			else
			{
				n += 29;
			}
		}
		n += day2;
		System.out.printf("%d",n);
		return 0;
	}
}

