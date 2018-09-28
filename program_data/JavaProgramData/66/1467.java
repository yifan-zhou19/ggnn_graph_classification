package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int date;
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		date = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int days = 0;
		int i = 0;
		for (;year >= 400;i++)
		{
			year = year - 400;
		}

		for (;i > 2800;)
		{
			i -= 2800;
		}
		days = days + i * 146097;

		if (year != 0)
		{
			for (i = 1 ;i < year; i++)
			{
				if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
				{
					days += 366;
				}
				else
				{
					days += 365;
				}
			}
		}
		else
		{
			days -= 366;
		}



		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (i = 1; i < month; i++)
		{
			days += a[i];
		}

		if (((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) && (month >= 3))
		{
			days++;
		}

		days += date;



		String[] b = {"Sun.", "Mon.", "Tue.", "Wed.", "Thr.", "Fri.", "Sat."};
		int j = days % 7;
		System.out.print(b[j]);

		return 0;
	}
}

