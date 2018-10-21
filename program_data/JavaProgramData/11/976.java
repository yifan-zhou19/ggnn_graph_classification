package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int daynum = 0;
		int i;
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] month1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] month2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int judgeleap;
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			for (i = 0;i < month - 1;i++)
			{
				daynum += month2[i];
			}
		}
		else
		{
			for (i = 0;i < month - 1;i++)
			{
				daynum += month1[i];
			}
		}
		daynum = daynum + day;
		System.out.print(daynum);
		return 0;
	}
}

