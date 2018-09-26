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
		int sum = 0;
		int flag = 0;
		int i;
		int year;
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		year1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		year2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (year = year1;year <= year2;year++)
		{
			flag = 0;
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			{
				flag = 1;
			}
			if (year1 == year2)
			{
				for (i = month1;i < month2;i++)
				{
					sum += month[i];
				}
				sum = sum + day2 - day1;
				if (flag != 0 && month1 <= 2 && month2 > 2)
				{
					sum++;
				}
			}
			else
			{
				if (year == year1)
				{
					for (i = month1;i <= 12;i++)
					{
						sum += month[i];
					}
					sum = sum - day1;
					if (flag != 0 && (month1 <= 2))
					{
						sum++;
					}
				}
				else if (year < year2)
				{
					sum += 365;
					if (flag != 0)
					{
						sum++;
					}
				}
				if (year == year2)
				{
					for (i = 1;i < month2;i++)
					{
						sum += month[i];
					}
					sum = sum + day2;
					if (flag != 0 && (month1 <= 2 || month2 > 2))
					{
						sum++;
					}
				}
				month1 = 1;
			}
		}
		System.out.print(sum);
		return 0;
	}





}

