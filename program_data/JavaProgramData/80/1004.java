package <missing>;

public class GlobalMembers
{
	//**********************************
	//*??  ???????????*****
	//*????? 1300012753     ******* 
	//*???2013.11.02          ******* 
	//**********************************
	public static int Main()
	{
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
		int sum = 0;
		int[] month1 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] month2 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if ((syear % 4 == 0 && syear % 100 != 0) || (syear % 400 == 0))
		{
		month1[2] = 29;
		}
		if ((eyear % 4 == 0 && eyear % 100 != 0) || (eyear % 400 == 0))
		{
		month2[2] = 29;
		}
		if (syear == eyear && smonth == emonth)
		{
			sum += eday - sday;
		}
		else if (syear == eyear && smonth != emonth)
		{
			sum += month1[smonth] - sday + 1;
			for (int month = smonth + 1; month < emonth; month++)
			{
			sum += month1[month];
			}
			sum += eday - 1;
		}
		else
		{
			sum += month1[smonth] - sday + 1;
			for (int month = smonth + 1; month <= 12; month++)
			{
				sum += month1[month];
			}
			for (int year = syear + 1; year < eyear; year++)
			{
				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				{
				sum += 366;
				}
				else
				{
				sum += 365;
				}
			}
			for (int month = 1; month < emonth; month++)
			{
				sum += month2[month];
			}
			sum += eday - 1;
		}
		System.out.print(sum);
		return 0;
	}
}

