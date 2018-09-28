package <missing>;

public class GlobalMembers
{
	public static int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public static int Main()
	{
		int countYear = new int(int syear,int eyear);
		int countmonth = new int(int year,int month,int day);
		int syear;
		int smonth;
		int sday;
		int eyear;
		int emonth;
		int eday;
		int day;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			syear = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			smonth = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sday = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			eyear = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			emonth = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			eday = Integer.parseInt(tempVar6);
		}
		int between;
		int day1;
		int day2;
		between = countYear(syear,eyear);
		day1 = countmonth(syear,smonth,sday);
		day2 = countmonth(eyear,emonth,eday);
		day = between - day1 + day2;
		System.out.printf("%d",day);
		return 0;
	}

//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static countYear(int syear,int eyear)
	{
		int day = 0;
		int i;
		for (i = syear;i < eyear;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
			{
				day += 366;
			}
			else
			{
				day += 365;
			}
		}
		return day;
	}

//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static countmonth(int year,int month,int day)
	{
		int n = 0;
		int i;
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
		{
			a[2] = 29;
		}
		for (i = 1;i < month;i++)
		{
			n += a[i];
		}
		n = n + day;
		return n;
	}
}

