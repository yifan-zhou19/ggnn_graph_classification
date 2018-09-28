package <missing>;

public class GlobalMembers
{
	public static int[] months1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //months1?????months2????
	public static int[] months2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int check(int year)
	{
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
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
		int year1;
		int year2;
		int month1;
		int month2;
		int day1;
		int day2;
		int i;
		int x = 0;
		int sum = 0;
		year1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		year2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = year1 + 1;i < year2;i++)
		{
			x = check(i);
			if (x == 0) //?????
			{
				sum = sum + 365;
			}
			else if (x == 1) //?????
			{
				sum = sum + 366;
			}
		}
		if (year1 != year2)
		{
			if (check(year1) != 0) //year1???
			{
				for (i = month1 + 1;i <= 12;i++)
				{
					sum = sum + months2[i - 1];
				}
				sum = sum + months2[month1 - 1] - day1;
			}
			else //year1???
			{
				for (i = month1 + 1;i <= 12;i++)
				{
					sum = sum + months1[i - 1];
				}
				sum = sum + months1[month1 - 1] - day1;
			}
			if (check(year2) != 0) //year2???
			{
				for (i = 1;i < month2;i++)
				{
					sum = sum + months2[i - 1];
				}
				sum = sum + day2;
			}
			else //year2???
			{
				for (i = 1;i < month2;i++)
				{
					sum = sum + months1[i - 1];
				}
				sum = sum + day2;
			}
		}
		else
		{
			if (check(year1) != 0) //year1???
			{
				for (i = month1 + 1;i < month2;i++)
				{
					sum = sum + months2[i - 1];
				}
				if (month1 != month2)
				{
					sum = sum + months2[month1 - 1] - day1 + day2;
				}
				else
				{
					sum = day2 - day1;
				}
			}
			else //year1???
			{
				for (i = month1 + 1;i < month2;i++)
				{
					sum = sum + months1[i - 1];
				}
				if (month1 != month2)
				{
					sum = sum + months1[month1 - 1] - day1 + day2;
				}
				else
				{
					sum = day2 - day1;
				}
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

