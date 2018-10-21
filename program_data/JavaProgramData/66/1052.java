package <missing>;

public class GlobalMembers
{
	public static int run(int a)
	{
		if ((a % 400 == 0) || ((a % 100 != 0) && (a % 4 == 0)))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int year;
		int mon;
		int day;
		year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		mon = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] m1 = {0, 0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
		int[] m2 = {0, 0, 3, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6};
		String[] date = {"0", "Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat.", "Sun."};

		int i;
		int sum = 0;
		int k = (int)(year / 2000);
		if (year % 2000 == 0)
		{
			year = year - (k - 1) * 2000;
		}
		else
		{
			year = year - k * 2000;
		}



		for (i = 1; i < year; i++)
		{
			if (sum > 7)
			{
				sum = sum - 7;
			}
			sum = sum + 1 + run(i);
		}

		if (run(year) != 0)
		{
			sum = sum + m2[mon];
		}
		else
		{
			sum = sum + m1[mon];
		}

		sum = sum + day;

		while (sum > 7)
		{
			sum = sum - 7;
		}
		System.out.print(date[sum]);
		System.out.print("\n");
	return 0;
	}

}

