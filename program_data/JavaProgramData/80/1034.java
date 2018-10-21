package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int time1 = 0;
		int time2 = 0;
		int result = 0;
	   int year1;
	   int year2;
	   int month1;
	   int month2;
	   int day1;
	   int day2;
	   year1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   day1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   year2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   day2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   int[] dayofmonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 0};
	   int stayear = Math.min(year1,year2);
	   if (stayear % 4 == 0 && stayear % 100 != 0 || stayear % 400 == 0)
	   {
		   dayofmonth[1] = 29;
	   }
	   for (int month = 0;month < month1 - 1;month++)
	   {
		   time1 += dayofmonth[month];
	   }
	   time1 += day1 - 1;
	   dayofmonth[1] = 28;
	   for (int year = stayear;year < Math.max(year1,year2);year++)
	   {
		  if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		  {
		   time2 += 366;
		  }
		  else
		  {
			  time2 += 365;
		  }
	   }
		  int temp = Math.max(year1,year2);
	if (temp % 4 == 0 && temp % 100 != 0 || temp % 400 == 0)
	{
		   dayofmonth[1] = 29;
	}
	for (int monthtemp = 0;monthtemp < month2 - 1;monthtemp++)
	{
		time2 += dayofmonth[monthtemp];
	}
	time2 += day2 - 1;
	System.out.print(time2 - time1);
	System.out.print("\n");

	return 0;
	}

}

