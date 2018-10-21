package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int startyear;
		int startmonth;
		int startday;
		int endyear;
		int endmonth;
		int endday;
		int year;
		int sum = 0;
		int i;
		int[] m1 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] m2 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		startyear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startmonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endyear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endmonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		year = startyear;
		while (year < endyear)
		{
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			{
				sum += 366;
			}
			else
			{
				sum += 365;
			}
			year++;
		}
		if ((startyear % 4 == 0 && startyear % 100 != 0) || (startyear % 400 == 0))
		{
			for (i = 1; i < startmonth; i++)
			{
				sum -= m2[i];
			}
			sum -= startday;
		}
		else
		{
			for (i = 1; i < startmonth; i++)
			{
				sum -= m1[i];
			}
			sum -= startday;
		}
		if ((endyear % 4 == 0 && endyear % 100 != 0) || (endyear % 400 == 0))
		{
			for (i = 1; i < endmonth; i++)
			{
				sum += m2[i];
			}
			sum += endday;
		}
		else
		{
			for (i = 1; i < endmonth; i++)
			{
				sum += m1[i];
			}
			sum += endday;
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

