package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int num = 0;
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] date = {"Sun.", "Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat."};
		num = year % 7 + year / 4 - year / 100 + year / 400;
		for (int i = 1;i < month;i++)
		{
			num += days[i];
		}
		if ((((year % 4) == 0 && year % 100 != 0) || year % 400 == 0) && month <= 2)
		{
															num--;
		}

		num += day - 1;
		System.out.print(date[num % 7]);
		System.out.print("\n");

		return 0;
	}
}

