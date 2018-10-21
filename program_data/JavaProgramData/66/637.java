package <missing>;

public class GlobalMembers
{
	public static int isRunnian(int year)
	{
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int Main()
	{

		int year;
		int month;
		int day;
		int sum = 0; //???????????????sumyear???????????????sumdonth???????????sumday?
		int leapyear;
		int sumyear = 0;
		int summonth = 0;
		int sumday = 0;
		int i;
		int j;
		int k;
		int xingqiji;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		year--;
		leapyear = year / 4 - year / 100 + year / 400;
		sumyear = leapyear * 2 + year - leapyear;

		for (j = 1;j < month;j++)
		{
			if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
			{
				summonth += 31;
			}
			if (j == 4 || j == 6 || j == 9 || j == 11)
			{
				summonth += 30;
			}
			if ((isRunnian(year + 1)) != 0 && (j == 2))
			{
				summonth += 29;
			}
			else
			{
				summonth += 28;
			}
		}
		sumday = day;
		sum = sumyear + summonth + sumday;
		xingqiji = sum % 7;
		if (xingqiji == 1)
		{
			System.out.print("Mon.");
		}
		else if (xingqiji == 2)
		{
			System.out.print("Tue.");
		}
		else if (xingqiji == 3)
		{
			System.out.print("Wed.");
		}
		else if (xingqiji == 4)
		{
			System.out.print("Thu.");
		}
		else if (xingqiji == 5)
		{
			System.out.print("Fri.");
		}
		else if (xingqiji == 6)
		{
			System.out.print("Sat.");
		}
		else
		{
			System.out.print("Sun.");
		}
		return 0;
	}

}

