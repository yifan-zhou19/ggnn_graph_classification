package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String[] week = {"Sun.", "Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat."};
		int year;
		int i;
		int month;
		int day;
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] days =
		{
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		int sum = 0;
		sum = (year - 1) + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;

		if (((year % 400) == 0) || (((year % 4) == 0) && ((year % 100) != 0))) //???????
		{
			for (i = 0;i < month - 1;i++)
			{
				sum = sum + days[0][i];
			}
		}
		else
		{
			for (i = 0;i < month - 1;i++)
			{
				sum = sum + days[1][i];
			}
		}

		sum = sum + day; //???????????????????????????1 1 7?sum==1?????sum%7==0??SUN.?
		System.out.print(week[sum % 7]);
		System.out.print("\n");
		return 0;
	}
}

