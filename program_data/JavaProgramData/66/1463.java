package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] month =
		{
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		String[] weekday = {"Sun.", "Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat."};
		int year;
		int mon;
		int day;
		int leap;
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		mon = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int sum = 0;
		sum = year - 1 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		leap = (year % 100 != 0 && year % 4 == 0 || year % 400 == 0);
		for (i = 0;i < mon - 1;i++)
		{
			sum += month[leap][i];
		}
		sum = sum + day;
		System.out.print(weekday[sum % 7]);
		System.out.print("\n");
		return 0;
	}




}

