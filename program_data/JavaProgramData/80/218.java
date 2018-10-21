package <missing>;

public class GlobalMembers
{
	public static int yuandan(int year, int month, int day)
	{
	  int[] yue = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	  if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
	  {
	  yue[2] = 29;
	  }
	  else
	  {
	  yue[2] = 28;
	  }

	  int i;
	  int sum = 0;
	  if (month == 1)
	  {
	  return day;
	  }
	  else
	  {
		for (i = 1;i <= month - 1;i++)
		{
		sum += yue[i];
		}
		sum += day;
	  }
		return sum;
	}
	public static int Main()
	{
		int year1;
		int year2;
		int month1;
		int month2;
		int day1;
		int day2;
		int t;
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int yuandan1 = 0;
		int yuandan2 = 0;
		int num = 0;
		int i;
		year1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		year2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (year2 < year1)
		{
		 t = year1;
		 year1 = year2;
		 year2 = t;
		 t = month1;
		 month1 = month2;
		 month2 = t;
		 t = day1;
		 day1 = day2;
		 day2 = t;
		}
		yuandan1 = yuandan(year1, month1, day1);
		yuandan2 = yuandan(year2, month2, day2);

		for (i = year1;i < year2;i++)
		{
		  num += 365;
		  num += ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0));
		}

		num = num + yuandan2 - yuandan1;
		System.out.print(num);



	return 0;
	}

}

