//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static int leap_year(int y)
	{
		if (y % 400 == 0)
		{
			return 1;
		}
		else if (y % 4 == 0 && y % 100 != 0)
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
		int y;
		int m;
		int d;
		int count;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		if (leap_year(y) != 0)
		{
			switch (m)
			{
			case 1:
				count = 0;
				break;
			case 2:
				count = 31;
				break;
			case 3:
				count = 31 + 29;
				break;
			case 4:
				count = 31 + 29 + 31;
				break;
			case 5:
				count = 31 + 29 + 31 + 30;
				break;
			case 6:
				count = 31 + 29 + 31 + 30 + 31;
				break;
			case 7:
				count = 31 + 29 + 31 + 30 + 31 + 30;
				break;
			case 8:
				count = 31 + 29 + 31 + 30 + 31 + 30 + 31;
				break;
			case 9:
				count = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
				break;
			case 10:
				count = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
				break;
			case 11:
				count = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
				break;
			case 12:
				count = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
				break;
			}
			count += d;
		}
		else
		{
			switch (m)
			{
			case 1:
				count = 0;
				break;
			case 2:
				count = 31;
				break;
			case 3:
				count = 31 + 28;
				break;
			case 4:
				count = 31 + 28 + 31;
				break;
			case 5:
				count = 31 + 28 + 31 + 30;
				break;
			case 6:
				count = 31 + 28 + 31 + 30 + 31;
				break;
			case 7:
				count = 31 + 28 + 31 + 30 + 31 + 30;
				break;
			case 8:
				count = 31 + 28 + 31 + 30 + 31 + 30 + 31;
				break;
			case 9:
				count = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
				break;
			case 10:
				count = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
				break;
			case 11:
				count = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
				break;
			case 12:
				count = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
				break;
			}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


