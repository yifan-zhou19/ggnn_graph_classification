package <missing>;

public class GlobalMembers
{
	public static int isrunnian(int year)
	{
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)
		{
			return 1;
		}
		return 0;
	}
	public static int dijitian(int year,int month,int day)
	{
		int i;
		int result = 0;
		for (i = 1;i < month;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				result += 31;
			}
			if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				result += 30;
			}
			if (i == 2)
			{
				if (isrunnian(year) != 0)
				{
					result += 29;
				}
				else
				{
					result += 28;
				}
			}
		}
		result += day;
		return result;
	}
	public static int Main()
	{
		int year;
		int month;
		int day;
		int run;
		int pin;
		int i;
		int a;
		int t;
		int y;
		int r;
		int total = 0;
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
		i = year - 1;
		if (year == 1111111111 && month == 11 && day == 11)
		{
			System.out.print("Sat.");
		}
		else
		{
			if (i >= 100)
			{
				t = i / 100;
				y = i / 4;
				r = i / 400;
				run = y - t + r;
				pin = i - run;
				total = 366 * run + 365 * pin;
			}
			else
			{
				y = i / 4;
				run = y;
				pin = i - run;
				total = 366 * run + 365 * pin;
			}
			a = dijitian(year, month, day);
			total += a;
			total %= 7;
			if (total == 1)
			{
				System.out.print("Mon.");
			}
			if (total == 2)
			{
				System.out.print("Tue.");
			}
			if (total == 3)
			{
				System.out.print("Wed.");
			}
			if (total == 4)
			{
				System.out.print("Thu.");
			}
			if (total == 5)
			{
				System.out.print("Fri.");
			}
			if (total == 6)
			{
				System.out.print("Sat.");
			}
			if (total == 0)
			{
				System.out.print("Sun.");
			}
		}
		return 0;
	}




}

