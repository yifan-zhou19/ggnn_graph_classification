package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int days = 0;
		int i = 1;
		int[] month_str1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] month_str2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
		{
			while (i != month)
			{
				days += month_str2[i - 1];
				i++;
			}
		}
		else
		{
			while (i != month)
			{
				days += month_str1[i - 1];
				i++;
			}
		}
		System.out.print(days + day);
		return 0;
	}
}

