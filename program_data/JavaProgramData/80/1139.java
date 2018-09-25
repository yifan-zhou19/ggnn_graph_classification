package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] days =
		{
			{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};


		int syear;
		int smonth;
		int sday;
		int eyear;
		int emonth;
		int eday;

		syear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		smonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		eyear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		emonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		eday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		int r;
		int i;
		int year;
		int end;
		int num = 0;

		if ((syear % 4 == 0 && syear % 100 != 0) || (syear % 400 == 0))
		{
			r = 1;
		}
		else
		{
			r = 0;
		}

		if (eyear != syear)
		{
				num += days[r][smonth] - sday;
		}
		else
		{
			if (emonth != smonth)
			{
				num += days[r][smonth] - sday;
			}
		}
		if (eyear == syear)
		{
			end = emonth - 1;
		}
		else
		{
			end = 12;
		}

		for (i = smonth + 1;i <= end;i++)
		{
			num += days[r][i];
		}

		for (year = syear + 1;year < eyear;year++)
		{
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			{
				r = 1;
			}
			else
			{
				r = 0;
			}
			num += 365 + r;
		}

		if ((eyear % 4 == 0 && eyear % 100 != 0) || (eyear % 400 == 0))
		{
				r = 1;
		}
			else
			{
				r = 0;
			}


		i = 1;
		if (eyear == syear)
		{
			i = smonth + 1;
		}
		for (;i < emonth;i++)
		{
			num += days[r][i];
		}

		if (eyear != syear)
		{
			num += eday;
		}
		else
		{
			if (emonth == smonth)
			{
			num += (eday - sday);
			}
			else
			{
				num += eday;
			}
		}
		System.out.print(num);
		System.out.print("\n");
		return 0;
	}



}

