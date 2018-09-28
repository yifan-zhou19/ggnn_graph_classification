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
		int i;
		int t;
		int startyear;
		int startMonth;
		int startDay;
		int endyear;
		int endMonth;
		int endDay;
		int day;
		int a;
		int b;
		int m = 0;
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			startyear = Integer.parseInt(tempVar);
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
			endyear = Integer.parseInt(tempVar4);
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
		if ((startyear % 4 == 0 && startyear % 100 != 0) || (startyear % 400 == 0))
		{
			switch (startMonth)
			{
			case 1:
				a = startDay - 32;
				break;
			case 2:
				a = startDay - 1;
				break;
			case 3:
				a = 28 + startDay;
				break;
			case 4:
				a = 59 + startDay;
				break;
			case 5:
				a = 89 + startDay;
				break;
			case 6:
				a = 120 + startDay;
				break;
			case 7:
				a = 150 + startDay;
				break;
			case 8:
				a = 181 + startDay;
				break;
			case 9:
				a = 212 + startDay;
				break;
			case 10:
				a = 242 + startDay;
				break;
			case 11:
				a = 273 + startDay;
				break;
			case 12:
				a = 303 + startDay;
				break;
			}
		}
			else
			{
			switch (startMonth)
			{
			case 1:
				a = startDay - 32;
				break;
			case 2:
				a = startDay - 1;
				break;
			case 3:
				a = 28 + startDay - 1;
				break;
			case 4:
				a = 59 + startDay - 1;
				break;
			case 5:
				a = 89 + startDay - 1;
				break;
			case 6:
				a = 120 + startDay - 1;
				break;
			case 7:
				a = 150 + startDay - 1;
				break;
			case 8:
				a = 181 + startDay - 1;
				break;
			case 9:
				a = 212 + startDay - 1;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


