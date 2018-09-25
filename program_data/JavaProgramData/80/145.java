//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static int leapYear(int year)
	{
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			return 1;
		}
		return 0;
	}
	public static int Main()
	{
		int i;
		int startYear;
		int endYear;
		int startMonth;
		int endMonth;
		int startDay;
		int endDay;
		int count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			startYear = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			startMonth = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			startDay = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			endYear = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			endMonth = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			endDay = Integer.parseInt(tempVar6);
		}
		if (startYear < endYear)
		{
			for (i = startMonth + 1; i <= 12; i++)
			{
				switch (i)
				{
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						count += 31;
						break;
					case 4:
					case 6:
					case 9:
					case 11:
						count += 30;
						break;
					case 2:
						if (leapYear(startYear) != 0)
						{
							count += 29;
						}
						else
						{
							count += 28;
						}
				}
			}
			for (i = 1; i < endMonth; i++)
			{
				switch (i)
				{
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						count += 31;
						break;
					case 4:
					case 6:
					case 9:
					case 11:
						count += 30;
						break;
					case 2:
						if (leapYear(endYear) != 0)
						{
							count += 29;
						}
						else
						{
							count += 28;
						}
				}
			}
			switch (startMonth)
			{
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					count += 31;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					count += 30;
					break;
				case 2:
					if (leapYear(endYear) != 0)
					{
						count += 29;
					}
					else
					{
						count += 28;
					}
			}
			count += endDay - startDay;
		}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


