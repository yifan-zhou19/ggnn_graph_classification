package <missing>;

public class GlobalMembers
{
	public static int[] day_of_month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public static int Main()
	{
		int year;
		int month;
		int date;
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		date = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int total = 0;
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
		{
			day_of_month[2] = 29;

			for (int i = 0;i < month;i++)
			{
				total += day_of_month[i];
			}
			total += date;
		}
		else
		{
			day_of_month[2] = 28;
			for (int i = 0;i < month;i++)
			{
				total += day_of_month[i];
			}
			total += date;
		}
		System.out.print(total);
		System.out.print("\n");

		return 0;
	}

}

