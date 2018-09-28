package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum = 0;
		int year;
		int month;
		int day;
		int leap1;
		int step = 0;
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		leap1 = ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0));
		String[] b = {"Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat.", "Sun."};
		int[][] a =
		{
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		step = (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		sum += step * 2 + year - step - 1;
		for (int j = 0;j < month - 1;j++)
		{
			sum += a[leap1][j];
		}
		sum += day - 1;
		System.out.print(b[sum % 7]);
		System.out.print("\n");
		return 0;
	}

}

