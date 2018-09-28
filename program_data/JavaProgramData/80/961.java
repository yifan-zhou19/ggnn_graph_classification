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
		int a;
		int a1 = 0;
		int a2;
		int date = new int(int year,int a);
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
		for (;year1 < year2 || (year1 == year2 && month1 < month2);)
		{
			a1 += date(year1, month1);
			month1++;
			if (month1 == 13)
			{
				month1 = 1;
				year1++;
			}
		}
		a2 = day2 - day1;
		a = a1 + a2;
		System.out.printf("%d\n",a);
		return 0;
	}


	public static int date(int year,int a)
	{
		int b;
		if (a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12)
		{
			b = 31;
		}
		else if (((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) && a == 2)
		{
			b = 29;
		}
		else if (!((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) && a == 2)
		{
			b = 28;
		}
		else if (a == 4 || a == 6 || a == 9 || a == 11)
		{
			b = 30;
		}
		return (b);
	}

}

