package <missing>;

public class GlobalMembers
{
	public static int judgeyear(int year)
	{
		if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}








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
		int[] montha = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] monthb = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int sum = 0;
		for (int i = year1 + 1;i < year2;i++)
		{
			sum += 365 + judgeyear(i);

		}
		if (year1 < year2)
		{
			for (int i = month1 + 1;i <= 12;i++)
			{
				if (judgeyear(year1) != 0)
				{
					sum += monthb[i];
				}
				else
				{
					sum += montha[i];
				}

			}
			for (int i = 1;i < month2;i++)
			{
				if (judgeyear(year2) != 0)
				{
					sum += monthb[i];
				}
				else
				{
					sum += montha[i];
				}

			}
		}
		else
		{
			for (int i = month1 + 1;i < month2;i++)
			{
				if (judgeyear(year1) != 0)
				{
					sum += monthb[i];
				}
				else
				{
					sum += montha[i];
				}
			}
		}
		if (year1 == year2 && month1 == month2)
		{
			sum += day2 - day1;
		}
		else
		{
			if (judgeyear(year1) != 0)
			{
				sum += monthb[month1] - day1;
			}
			else
			{
				sum += montha[month1] - day1;
			}
			sum += day2;

		}
			System.out.print(sum);
			System.out.print("\n");




















		return 0;
	}
}

