package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int c;
		int days = 0;
		int i;
		int[][] M =
		{
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			c = 1;
		}
		else
		{
			c = 0;
		}
		if (month == 1)
		{
			System.out.print(day);
		}
		else
		{
			for (i = 0;i < month - 1;i++)
			{
			   days += M[c][i];
			}
			System.out.print(days + day);
		}
		return 0;
	}
}

