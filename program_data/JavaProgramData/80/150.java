//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
		int days = 0;
		int month;
		int year;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			y2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			m2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			d2 = Integer.parseInt(tempVar6);
		}
		for (year = y1 + 1;year < y2;year++)
		{
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			{
				days = days + 366;
			}
			else
			{
				days = days + 365;
			}
		}
		if (((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0)) && m1 <= 2)
		{
			days = days + 1;
		}
		for (month = m1;month <= 12;month++)
		{
		switch (month)
		{
		case 1:
			days = days + 31;
			break;
		case 2:
			days = days + 28;
			break;
		case 3:
			days = days + 31;
			break;
		case 4:
			days = days + 30;
			break;
		case 5:
			days = days + 31;
			break;
		case 6:
			days = days + 30;
			break;
		case 7:
			days = days + 31;
			break;
		case 8:
			days = days + 31;
			break;
		case 9:
			days = days + 30;
			break;
		case 10:
			days = days + 31;
			break;
		case 11:
			days = days + 30;
			break;
		case 12:
			days = days + 31;
			break;
		}
		}
		days = days - d1;
		if (((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0)) && m2 > 2)
		{
			days = days + 1;
		}
		for (month = 1;month < m2;month++)
		{
		switch (month)
		{
		case 1:
			days = days + 31;
			break;
		case 2:
			days = days + 28;
			break;
		case 3:
			days = days + 31;
			break;
		case 4:
			days = days + 30;
			break;
		case 5:
			days = days + 31;
			break;
		case 6:
			days = days + 30;
			break;
		case 7:
			days = days + 31;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


