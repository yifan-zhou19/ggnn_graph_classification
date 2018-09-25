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
		int i;
		int answer;
		int sumdays1 = 0;
		int sumdays2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			startyear = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			startmonth = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			startday = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			endyear = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			endmonth = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			endday = Integer.parseInt(tempVar6);
		}
		for (i = 1;i < startyear;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				sumdays1 += 366;
			}
			else
			{
				sumdays1 += 365;
			}
		}
		if ((startyear % 4 == 0 && startyear % 100 != 0) || (startyear % 400 == 0))
		{
			switch (startmonth)
			{
			case 1:
				sumdays1 += 0;
				break;
			case 2:
				sumdays1 += 31;
				break;
			case 3:
				sumdays1 += 60;
				break;
			case 4:
				sumdays1 += 91;
				break;
			case 5:
				sumdays1 += 121;
				break;
			case 6:
				sumdays1 += 152;
				break;
			case 7:
				sumdays1 += 182;
				break;
			case 8:
				sumdays1 += 213;
				break;
			case 9:
				sumdays1 += 244;
				break;
			case 10:
				sumdays1 += 274;
				break;
			case 11:
				sumdays1 += 305;
				break;
			case 12:
				sumdays1 += 335;
				break;
			}
		}
		else
		{
			switch (startmonth)
			{
			case 1:
				sumdays1 += 0;
				break;
			case 2:
				sumdays1 += 31;
				break;
			case 3:
				sumdays1 += 59;
				break;
			case 4:
				sumdays1 += 90;
				break;
			case 5:
				sumdays1 += 120;
				break;
			case 6:
				sumdays1 += 151;
				break;
			case 7:
				sumdays1 += 181;
				break;
			case 8:
				sumdays1 += 212;
				break;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


