package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] runday = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] brunday = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int year1;
		int year2;
		int month1;
		int month2;
		int day1;
		int day2;
		int i;
		int j;
		int sum = 0;
		year1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		year2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = year1; i < year2; i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
			   sum = sum + 366;
			}
			else
			{
				sum = sum + 365;
			}
		}
		if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0))
		{
			for (i = 1; i < month1; i++)
			{
				sum = sum - runday[i];
			}
			sum = sum - day1;
		}
		else
		{
			for (i = 1; i < month1; i++)
			{
				sum = sum - brunday[i];
			}
			sum = sum - day1;
		}
		if ((year2 % 4 == 0 && year2 % 100 != 0) || (year2 % 400 == 0))
		{
			for (i = 1; i < month2; i++)
			{
				sum = sum + runday[i];
			}
			sum = sum + day2;
		}
		else
		{
			for (i = 1; i < month2; i++)
			{
				sum = sum + brunday[i];
			}
			sum = sum + day2;
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}

}

