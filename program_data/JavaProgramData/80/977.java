package <missing>;

public class GlobalMembers
{
	public static int DiJiTian(int year, int month, int day)
	{
			int result = 0;
			int i;
			for (i = 1; i < month; i++)
			{ //step1
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
				if (isRunNian(year) != 0)
				{
			result += 29;
				}
				else
				{
			result += 28;
				}
		}
			}
		   result += day; //step2
		   return result;
	}
	public static int isRunNian(int year)
	{
		int result;
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
		{
			result = 1;
		}
		else
		{
			result = 0;
		}
		return result;
	}
	public static void swap(tangible.RefObject<Integer> a, tangible.RefObject<Integer> b)
	{
		int e;
		e = a.argValue;
		a.argValue = b.argValue;
		b.argValue = e;
	}
	public static int Main()
	{
		int a;
		int b;
		int c;
		int i;
		int year1;
		int month1;
		int day1;
		int year2;
		int month2;
		int day2;
		int result = 0;

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
		String tempVar4 = ConsoleInput.scanfRead();
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

		if (year1 == year2)
		{
			result = DiJiTian(year1, month1, day1) - DiJiTian(year2, month2, day2);
			if (result < 0)
			{
				result = 0 - result;
			}
		}
		else
		{
			if (year1 > year2)
			{
			tangible.RefObject<Integer> tempRef_year1 = new tangible.RefObject<Integer>(year1);
			tangible.RefObject<Integer> tempRef_year2 = new tangible.RefObject<Integer>(year2);
				swap(tempRef_year1, tempRef_year2);
				year2 = tempRef_year2.argValue;
				year1 = tempRef_year1.argValue;
			tangible.RefObject<Integer> tempRef_month1 = new tangible.RefObject<Integer>(month1);
			tangible.RefObject<Integer> tempRef_month2 = new tangible.RefObject<Integer>(month2);
				swap(tempRef_month1, tempRef_month2);
				month2 = tempRef_month2.argValue;
				month1 = tempRef_month1.argValue;
			  tangible.RefObject<Integer> tempRef_day1 = new tangible.RefObject<Integer>(day1);
			  tangible.RefObject<Integer> tempRef_day2 = new tangible.RefObject<Integer>(day2);
				  swap(tempRef_day1, tempRef_day2);
				  day2 = tempRef_day2.argValue;
				  day1 = tempRef_day1.argValue;
			}
			if (isRunNian(year1) != 0)
			{
				a = 366 - DiJiTian(year1, month1, day1);
			}
			else
			{
				a = 365 - DiJiTian(year1, month1, day1);
			}
			b = 0;
			for (i = year1 + 1; i < year2; i++)
			{
				if (isRunNian(i) != 0)
				{
					b += 366;
				}
				else
				{
					b += 365;
				}
			}
			c = DiJiTian(year2, month2, day2);
			result = a + b + c;
		}
		System.out.printf("%d",result);
		return 0;
	}


}

