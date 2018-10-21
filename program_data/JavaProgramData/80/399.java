package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year1;
		int month1;
		int day1;
		int year2;
		int month2;
		int day2;
		year1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		year2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] Month1 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] Month2 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int count = 0;
		int i;
		if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0))
		{
			for (i = month1; i <= 12; i++)
			{
				count = count + Month2[i];
			}
			count = count - day1;
		}
		else
		{
			for (i = month1; i <= 12; i++)
			{
				count = count + Month1[i];
			}
			count = count - day1;
		}
		for (i = year1 + 1; i < year2; i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				count = count + 366;
			}
			else
			{
				count = count + 365;
			}
		}
		if ((year2 % 4 == 0 && year2 % 100 != 0) || (year2 % 400 == 0))
		{
			for (i = 1; i < month2; i++)
			{
				count = count + Month2[i];
			}
			count = count + day2;
		}
		else
		{
			for (i = 1; i < month2; i++)
			{
				count = count + Month1[i];
			}
			count = count + day2;
		}
		if (year1 != year2)
		{
			System.out.print(count);
		}
		else
		{
			if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0))
			{
				System.out.print(count - 366);
			}
			else
			{
				System.out.print(count - 365);
			}
		}
		return 0;
	}
}

