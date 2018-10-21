package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum = 0;
		int day = 0;
		int p = 0;
		int i;
		int k;
		int count = 0;
		int x = 0;
		int y = 0;
		int year1;
		int month1;
		int day1;
		int year2;
		int month2;
		int day2;
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		year1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		year2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = year1 + 1;i < year2;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				count++;
			}
		}
		if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0))
		{
			if (month1 == 1)
			{
				x++;
			}
			if (month1 == 2)
			{
				if (day1 < 29)
				{
					x++;
				}
			}
		}
		if ((year2 % 4 == 0 && year2 % 100 != 0) || (year2 % 400 == 0))
		{
			if (month2 > 2)
			{
				y++;
			}
			if (month2 == 2)
			{
				if (day2 == 29)
				{
					y++;
				}
			}
		}
		for (k = 0;k < month1 - 1;k++)
		{
			day += month[k];
		}
		day += day1;
		for (k = 11;k > month2 - 1;k--)
		{
			p += month[k];
		}
		p += month[month2 - 1] - day2;
		sum = 365 * (year2 - year1 + 1) - day - p + x + y + count;
		//cout << day << " " << p << " " << x << " " << y << endl;
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

