package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sY;
		int sM;
		int sD;
		int eY;
		int eM;
		int eD;
		int DiJiTian = new int(int y,int m,int d);
		int isRunNian = int year;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sY = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sM = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sD = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			eY = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			eM = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			eD = Integer.parseInt(tempVar6);
		}
		int x;
		int days = DiJiTian(eY, eM, eD) - DiJiTian(sY, sM, sD);
		for (x = sY;x < eY;x++)
		{
			if (isRunNian(x) != 0)
			{
				days = days + 366;
			}
			else
			{
				days = days + 365;
			}
		}
		System.out.printf("%d",days);
		return 0;
	}
	public static int DiJiTian(int y,int m,int d)
	{
		int isRunNian = int year;
		int i;
		int result = 0;
		for (i = 1;i < m;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				result += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				result += 30;
			}
			else if (i == 2)
			{
				if (isRunNian(y) != 0)
				{
					result += 29;
				}
				else
				{
					result += 28;
				}
			}
		}
		result += d;
		return result;
	}
	public static int isRunNian(int year)
	{
		int result1;
		if (year % 400 == 0 || (year % 4 == 0) && (year % 100 != 0))
		{
			result1 = 1;
		}
		else
		{
			result1 = 0;
		}
		return result1;
	}



}

