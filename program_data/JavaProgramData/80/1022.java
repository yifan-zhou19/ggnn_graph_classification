package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] month =
		{
			{0, 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334},
			{0, 0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335}
		};
		int date1;
		int date2;
		int leap1;
		int leap2;
		int year1;
		int year2;
		int m1;
		int m2;
		int d1;
		int d2;
		int i;
		year1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		year2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		leap1 = (year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0);
		leap2 = (year2 % 4 == 0 && year2 % 100 != 0) || (year2 % 400 == 0);
		date1 = month[leap1][m1] + d1;
		date2 = month[leap2][m2] + d2;
		for (i = year1; i < year2; i++)
		{
			leap2 = (i % 4 == 0 && i % 100 != 0) || i % 400 == 0;
			date2 = 365 + leap2 + date2;
		}
		System.out.print(date2 - date1);
		return 0;
	}
}

