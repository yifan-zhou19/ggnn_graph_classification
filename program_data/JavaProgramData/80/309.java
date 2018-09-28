//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year1; //1?????2????//
		int month1;
		int date1;
		int year2;
		int month2;
		int date2;
		int year_2; //faciliate caculation//
		int year;
		int month;
		int date;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			date1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead("\n");
		if (tempVar4 != null)
		{
			year2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			month2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			date2 = Integer.parseInt(tempVar6);
		}
		year_2 = year2;
		if (date1 <= date2)
		{
			date = date2 - date1;
		}
		else
		{
			month2 = month2 - 1;
					if ((month2 <= 7 && month2 % 2 != 0) || (month2>7 && month2 % 2 == 0)) //????????????//
					{
					date = date2 - date1 + 31;
					}
					else if (month2 != 2)
					{
					date = date2 - date1 + 30;
					}
						 else if ((year2 % 4 == 0 && year2 % 100 != 0) || (year2 % 400 == 0)) //????//
						 {
							  date = date2 - date1 + 29;
						 }
							  else
							  {
								  date = date2 - date1 + 28;
							  }
		}
		if (month2 >= month1)
		{
			month = month2 - month1;
		}
		else
		{
			month = month2 - month1 + 12;
			year_2 = year2 - 1;
		}
		year = year_2 - year1;

		/*???????????year??month??date?*/

		int day; //????????????????????????????//
		int monthday;
		int yearday;
		int monthday1 = 0;
		int monthday2 = 0;
		day = 0;
		monthday = 0;
		int judgeyear2; //faciliate caculation//
		int i;
		if (month1 + month >= 12)
		{
			judgeyear2 = year_2;
		}
		else
		{
			judgeyear2 = year2;
		}
		for (i = 1;i <= month1 - 1;i++) //????????????
		{
			if (i <= 12) //??+31???+30//
			{
				if ((i <= 7 && i % 2 != 0) || (i>7 && i % 2 == 0))
				{
					monthday1 = monthday1 + 31;
				}
				else
				{
					if (i == 2)
					{
						if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0)) //????//
						{
								  monthday1 = monthday1 + 29;
						}
						else
						{
							monthday1 = monthday1 + 28;
						}
					}
					 else
					 {
						 monthday1 = monthday1 + 30;
					 }
				}
			}
		}
		for (i = 1;i <= month1 + month - 1;i++) //????????????
		{
			if (i > 12)
			{
				if (((i - 12) <= 7 && (i - 12) % 2 != 0) || ((i - 12)>7 && (i - 12) % 2 == 0))
				{
					monthday2 = monthday2 + 31;
				}
				else
				{
					if ((i - 12) == 2)
					{
						if ((year2 % 4 == 0 && year2 % 100 != 0) || (year2 % 400 == 0)) //????//
						{
								  monthday2 = monthday2 + 29;
						}
						else
						{
							monthday2 = monthday2 + 28;
						}
					}
					 else
					 {
						 monthday2 = monthday2 + 30;
					 }
				}
			}
			else
			{
				if ((i <= 7 && i % 2 != 0) || (i>7 && i % 2 == 0))
				{
					monthday2 = monthday2 + 31;
				}
				else
				{
					if (i == 2)
					{
						if ((judgeyear2 % 4 == 0 && judgeyear2 % 100 != 0) || (judgeyear2 % 400 == 0)) //????//
						{
								  monthday2 = monthday2 + 29;
						}
						else
						{
							monthday2 = monthday2 + 28;
						}
					}
					 else
					 {
						 monthday2 = monthday2 + 30;
					 }
				}
			}
		}
		monthday = monthday2 - monthday1;
		yearday = 365 * year; //??????365????????????????

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


