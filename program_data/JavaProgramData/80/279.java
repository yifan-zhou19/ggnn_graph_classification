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
		int startyear;
		int endyear;
		int startmonth;
		int endmonth;
		int startday;
		int endday;
		int year;
		int day;
		int month;
		day = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			startyear = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			startmonth = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			startday = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			endyear = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			endmonth = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			endday = Integer.parseInt(tempVar6);
		}
		if (startyear != endyear)
		{
		for (year = (startyear + 1);year < endyear;year++)
		{
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			{
				day = day + 366;
			}
			else
			{
				day = day + 365;
			}
		}
		if ((startyear % 4 == 0 && startyear % 100 != 0) || (startyear % 400 == 0))
		{
			if (startmonth == 1)
			{
				day = day + (31 - startday) + 29 + (31 * 6) + (30 * 4);
			}
			if (startmonth == 2)
			{
				day = day + (29 - startday) + (31 * 6) + (30 * 4);
			}
			if (startmonth == 3)
			{
				day = day + (31 - startday) + 30 * 4 + 31 * 5;
			}
			if (startmonth == 4)
			{
				day = day + (30 - startday) + 30 * 3 + 31 * 5;
			}
			if (startmonth == 5)
			{
				day = day + (31 - startday) + 30 * 3 + 31 * 4;
			}
			if (startmonth == 6)
			{
				day = day + (30 - startday) + 30 * 2 + 31 * 4;
			}
			if (startmonth == 7)
			{
				day = day + (31 - startday) + 30 * 2 + 31 * 3;
			}
			if (startmonth == 8)
			{
				day = day + (31 - startday) + 30 * 2 + 31 * 2;
			}
			if (startmonth == 9)
			{
				day = day + (30 - startday) + 30 + 31 * 2;
			}
			if (startmonth == 10)
			{
				day = day + (31 - startday) + 31 + 30;
			}
			if (startmonth == 11)
			{
				day = day + (30 - startday) + 31;
			}
			if (startmonth == 12)
			{
				day = day + (31 - startday);
			}
		}
		else
		{
			if (startmonth == 1)
			{
				day = day + (31 - startday) + 28 + (31 * 6) + (30 * 4);
			}
			if (startmonth == 2)
			{
				day = day + (28 - startday) + (31 * 6) + (30 * 4);
			}
			if (startmonth == 3)
			{
				day = day + (31 - startday) + 30 * 4 + 31 * 5;
			}
			if (startmonth == 4)
			{
				day = day + (30 - startday) + 30 * 3 + 31 * 5;
			}
			if (startmonth == 5)
			{
				day = day + (31 - startday) + 30 * 3 + 31 * 4;
			}
			if (startmonth == 6)
			{
				day = day + (30 - startday) + 30 * 2 + 31 * 4;
			}
			if (startmonth == 7)
			{
				day = day + (31 - startday) + 30 * 2 + 31 * 3;
			}
			if (startmonth == 8)
			{
				day = day + (31 - startday) + 30 * 2 + 31 * 2;
			}
			if (startmonth == 9)
			{
				day = day + (30 - startday) + 30 + 31 * 2;
			}
			if (startmonth == 10)
			{
				day = day + (31 - startday) + 31 + 30;
			}
			if (startmonth == 11)
			{
				day = day + (30 - startday) + 31;
			}
			if (startmonth == 12)
			{
				day = day + (31 - startday);
			}
		}
		if ((endyear % 4 == 0 && endyear % 100 != 0) || (endyear % 400 == 0))
		{
			if (endmonth == 1)
			{
				day = day + endday;
			}
			if (endmonth == 2)
			{
				day = day + endday + 31;
			}
			if (endmonth == 3)
			{
				day = day + endday + 31 + 29;
			}
			if (endmonth == 4)
			{
				day = day + endday + 31 * 2 + 29;
			}
			if (endmonth == 5)
			{
				day = day + endday + 31 * 2 + 30 + 29;
			}
			if (endmonth == 6)
			{
				day = day + endday + 31 * 3 + 30 + 29;
			}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


