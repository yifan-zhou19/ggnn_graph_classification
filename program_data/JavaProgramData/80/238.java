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
		int syear;
		int smonth;
		int sday;
		int eyear;
		int emonth;
		int eday;
		int cha = 0;
		syear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		smonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		eyear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		emonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		eday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int sum1 = 0;
		int sum2 = 0;
		switch (smonth)
		{
		case 1:
			sum1 += 0;
			break;
		case 2:
			sum1 += 31;
			break;
		case 3:
			sum1 += 31 + 28;
			break;
		case 4:
			sum1 += 31 + 28 + 31;
			break;
		case 5:
			sum1 += 31 + 28 + 31 + 30;
			break;
		case 6:
			sum1 += 31 + 28 + 31 + 30 + 31;
			break;
		case 7:
			sum1 += 31 + 28 + 31 + 30 + 31 + 30;
			break;
		case 8:
			sum1 += 31 + 28 + 31 + 30 + 31 + 30 + 31;
			break;
		case 9:
			sum1 += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
			break;
		case 10:
			sum1 += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
			break;
		case 11:
			sum1 += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
			break;
		case 12:
			sum1 += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
			break;
		default:
			break;
		}
		switch (emonth)
		{
		case 1:
			sum2 += 0;
			break;
		case 2:
			sum2 += 31;
			break;
		case 3:
			sum2 += 31 + 28;
			break;
		case 4:
			sum2 += 31 + 28 + 31;
			break;
		case 5:
			sum2 += 31 + 28 + 31 + 30;
			break;
		case 6:
			sum2 += 31 + 28 + 31 + 30 + 31;
			break;
		case 7:
			sum2 += 31 + 28 + 31 + 30 + 31 + 30;
			break;
		case 8:
			sum2 += 31 + 28 + 31 + 30 + 31 + 30 + 31;
			break;
		case 9:
			sum2 += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
			break;
		case 10:
			sum2 += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
			break;
		case 11:
			sum2 += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
			break;
		case 12:
			sum2 += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
			break;
		default:
			break;
		}
		int sum = 0;
		int year;
		for (year = syear + 1;year < eyear;year++)
		{
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			{

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


