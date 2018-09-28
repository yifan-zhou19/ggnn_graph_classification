package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum1;
		int sum2;
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int year1;
		int year2;
		int month1;
		int month2;
		int day1;
		int day2;
		int i;
		int count = 0;
		year1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		year2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i < year1; i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				count++;
			}
		}
		sum1 = 365 * (year1 - 1) + day1 + count;
		for (i = 1; i < month1; i++)
		{
			sum1 += month[i];
		}
		if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0))
		{
			if (month1 > 2)
			{
				sum1++;
			}
		}
		count = 0;
		for (i = 1; i < year2; i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				count++;
			}
		}
		sum2 = 365 * (year2 - 1) + day2 + count;
		for (i = 1; i < month2; i++)
		{
			sum2 += month[i];
		}
		if ((year2 % 4 == 0 && year2 % 100 != 0) || (year2 % 400 == 0))
		{
			if (month2 > 2)
			{
				sum2++;
			}
		}
		System.out.print(sum2 - sum1);
		System.out.print("\n");
		return 0;
	}
}

