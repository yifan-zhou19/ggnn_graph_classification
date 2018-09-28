package <missing>;

public class GlobalMembers
{
	public static int f(int year,int month,int day)
	{
		int days = 0;
	   int i;
	   for (i = 1;i < year;i++)
	   {
			 if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			 {
				  days = days + 366;
			 }
			else
			{
				days = days + 365;
			}
	   }
	   if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
	   {
			for (i = 1;i < month;i++)
			{
				 if (i == 1)
				 {
					 days = days + 31;
				 }
				if (i == 2)
				{
					days = days + 29;
				}
				if (i == 3)
				{
					days = days + 31;
				}
				if (i == 4)
				{
					days = days + 30;
				}
				if (i == 5)
				{
					days = days + 31;
				}
				if (i == 6)
				{
					days = days + 30;
				}
				if (i == 7)
				{
					days = days + 31;
				}
				if (i == 8)
				{
					days = days + 31;
				}
				if (i == 9)
				{
					days = days + 30;
				}
				if (i == 10)
				{
					days = days + 31;
				}
				if (i == 11)
				{
					days = days + 30;
				}
				if (i == 12)
				{
					days = days + 31;
				}
			}
	   }
	   else
	   {
			 for (i = 1;i < month;i++)
			 {
				 if (i == 1)
				 {
					 days = days + 31;
				 }
				if (i == 2)
				{
					days = days + 28;
				}
				if (i == 3)
				{
					days = days + 31;
				}
				if (i == 4)
				{
					days = days + 30;
				}
				if (i == 5)
				{
					days = days + 31;
				}
				if (i == 6)
				{
					days = days + 30;
				}
				if (i == 7)
				{
					days = days + 31;
				}
				if (i == 8)
				{
					days = days + 31;
				}
				if (i == 9)
				{
					days = days + 30;
				}
				if (i == 10)
				{
					days = days + 31;
				}
				if (i == 11)
				{
					days = days + 30;
				}
				if (i == 12)
				{
					days = days + 31;
				}
			 }
	   }
	   days = days + day;
	   return days;
	}
	public static int Main()
	{
		int year1;
		int month1;
		int day1;
		year1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int year2;
		int month2;
		int day2;
		year2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int days1 = f(year1, month1, day1);
		int days2 = f(year2, month2, day2);
		int days = days2 - days1;
		System.out.print(days);
		return 0;
	}
}

