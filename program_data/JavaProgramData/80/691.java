//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	//??????????????
	//?????startyear?????????????endyear
	//?????11.4
	//????wayne
	public static int Main()
	{
		int syear;
		int smonth;
		int sday;
		int eyear;
		int emonth;
		int eday;
		int i;
		int sum = 0;
		syear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		smonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		eyear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		emonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		eday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (smonth > 2) //??2??????????
		{
			switch (smonth)
			{
			case 3:
				sum = sum + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 - sday;
				break;
			case 4:
				sum = sum + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 - sday;
				break;
			case 5:
				sum = sum + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 - sday;
				break;
			case 6:
				sum = sum + 31 + 30 + 31 + 30 + 31 + 31 + 30 - sday;
				break;
			case 7:
				sum = sum + 31 + 30 + 31 + 30 + 31 + 31 - sday;
				break;
			case 8:
				sum = sum + 31 + 30 + 31 + 30 + 31 - sday;
				break;
			case 9:
				sum = sum + 31 + 30 + 31 + 30 - sday;
				break;
			case 10:
				sum = sum + 31 + 30 + 31 - sday;
				break;
			case 11:
				sum = sum + 31 + 30 - sday;
				break;
			case 12:
				sum = sum + 31 - sday; //????break????????
			}
		}
		else if ((syear % 4 == 0 && syear % 100 != 0) || (syear % 400 == 0)) //???????????????
		{
			switch (smonth)
			{
			case 1:
				sum = sum + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + 29 + 31 - sday;
				break;
			case 2:
				sum = sum + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + 29 - sday;
			}
		}
		else
		{
			switch (smonth)
			{
			case 1:
				sum = sum + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + 28 + 31 - sday;
				break;
			case 2:
				sum = sum + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + 28 - sday;
			}
		}
		for (i = syear + 1;i <= eyear - 1;i++) //????????????????????365??366
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				sum = sum + 366;
			}
			else
			{
				sum = sum + 365;
			}
		}
		if (emonth == 1)
		{
			sum = sum + eday;
		}
		else if (emonth == 2) //ednyear???????????????
		{
			sum = sum + 31 + eday;
		}
		else if ((eyear % 4 == 0 && eyear % 100 != 0) || (eyear % 400 == 0))
		{
			switch (emonth)
			{
			case 12:
				sum = sum + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + eday;
				break;
			case 11:
				sum = sum + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + eday;
				break;
			case 10:
				sum = sum + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + eday;
				break;
			case 9:
				sum = sum + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + eday;
				break;
			case 8:
				sum = sum + 31 + 29 + 31 + 30 + 31 + 30 + 31 + eday;
				break;
			case 7:
				sum = sum + 31 + 29 + 31 + 30 + 31 + 30 + eday;
				break;
			case 6:
				sum = sum + 31 + 29 + 31 + 30 + 31 + eday;
				break;
			case 5:
				sum = sum + 31 + 29 + 31 + 30 + eday;
				break;
			case 4:
				sum = sum + 31 + 29 + 31 + sday;
				break;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


