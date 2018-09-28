package <missing>;

public class GlobalMembers
{
	public static int leap(int year)
	{

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
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

		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int syear = 0;
		int eyear = 0;
		int smonth = 0;
		int emonth = 0;
		int sday = 0;
		int eday = 0;
		int nleap = 0;
		int nyears = 0;
		int startYearDays = 0;
		int endYearDays = 0;
		int totaldays = 0;
		syear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		smonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		eyear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		emonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		eday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = syear; i <= eyear; i++)
		{
			if (leap(i) != 0)
			{
				nleap++;
			}

		}

		nyears = (eyear - syear) - 1;

		for (int i = smonth + 1; i <= 12; i++)
		{
			startYearDays = startYearDays + month[i];

		}


		startYearDays = startYearDays + (month[smonth] - sday);


		//	cout<<startYearDays;

		//	cout<<endl;

	//===================================== days in start year correct================================





		for (int i = 1; i <= emonth - 1; i++)
		{
			endYearDays = endYearDays + month[i];


		}


		endYearDays = endYearDays + eday;


	//	cout<< endYearDays<<endl;




		totaldays = (nyears) * 365 + endYearDays + startYearDays + nleap;

		System.out.print(totaldays);


	return 0;

	}

}

