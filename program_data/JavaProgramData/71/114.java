package <missing>;

public class GlobalMembers
{
	/*
	 *  ???:???
	 *  ??: 2010-12-17
	 *  ??: ???
	 *  ??: ???????????????YES?
				?????NO?
	 */


	public static int is_Runnian(int year)
	{ //??????
		if (year % 4 != 0)
		{
			return 0;
		}
		else
		{
			if (year % 100 == 0 && year % 400 != 0)
			{
				return 0;
			}
		}
		return 1;
	}

	public static int Main()
	{
		int[] monthday = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		int i = 0;
		while (i < n)
		{
			int year;
			int month1;
			int month2;
			int month1day = 0;
			int month2day = 0;
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			month2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			if (is_Runnian(year) != 0)
			{
				monthday[1] = 29; //????? ????29?
			}
			for (int j = 0; j < month1 - 1; j++)
			{
				month1day += monthday[j];
			}
			for (int j = 0; j < month2 - 1; j++)
			{
				month2day += monthday[j];
			}

			int p = (month2day - month1day > 0 ? (month2day - month1day) : (month1day - month2day));

			if (p % 7 == 0) //??7??
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}

			if (monthday[1] == 29)
			{
				monthday[1] = 28;
			}
			i++;
		}
	}

}

