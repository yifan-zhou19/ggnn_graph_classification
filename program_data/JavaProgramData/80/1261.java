package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] daymonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int dayyear = 365;
		int startyear;
		int startmonth;
		int startday;
		int endyear;
		int endmonth;
		int endday;
		int yearx;
		int monthx;
		int dayx;
		int i;
		int j;
		int leap = 0;
		int sum = 0;
		startyear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startmonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endyear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endmonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		yearx = endyear - startyear;
		monthx = endmonth - startmonth;
		dayx = endday - startday;
		if (yearx == 0)
		{
			sum = 0;
			leap = 0;
			if ((startyear % 4 == 0 && startyear % 100 != 0) || (startyear % 400 == 0))
			{
				leap = 1;
			}
			if (monthx == 0)
			{
				sum = dayx;
			}
			else
			{
				for (i = startmonth;i < endmonth - 1;i++)
				{
					sum = sum + daymonth[i];
					if (leap != 0 && i == 1)
					{
						sum = sum + 1;
					}
				}
				sum = sum + daymonth[startmonth - 1] - startday + endday;
			}
			System.out.print(sum);
		}
		else
		{
			sum = 0;

			for (i = 1;i < yearx;i++)
			{
				leap = 0;
				if (((startyear + i) % 4 == 0 && (startyear + i) % 100 != 0) || ((startyear + i) % 400 == 0))
				{
					leap = 1;
				}
				sum = sum + dayyear + leap;
			}
			for (i = startmonth;i < 12;i++)
			{
				leap = 0;
				if ((startyear % 4 == 0 && startyear % 100 != 0) || (startyear % 400 == 0))
				{
					leap = 1;
				}
				sum = sum + daymonth[i];
				if (leap == 1 && i == 1)
				{
					sum = sum + 1;
				}
			}
			for (i = 0;i < endmonth - 1;i++)
			{
				leap = 0;
				if ((endyear % 4 == 0 && endyear % 100 != 0) || (endyear % 400 == 0))
				{
					leap = 1;
				}
				sum = sum + daymonth[i];
				if (leap == 1 && i == 1)
				{
					sum = sum + 1;
				}
			}
			sum = sum + daymonth[startmonth - 1] - startday + endday;
			System.out.print(sum);
		}
		return 0;
	}



}

