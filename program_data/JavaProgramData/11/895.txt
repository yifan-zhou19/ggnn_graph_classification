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
		int year;
		int month;
		int day;
		int leap;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}

		if (year % 4 == 0)
		{
			if (year % 100 == 0)
			{
				if (year % 400 == 0)
				{
					leap = 1;
				}
				else
				{
					leap = 0;
				}
			}
			else
			{
				leap = 1;
			}
		}
		else
		{
			leap = 0;
		}

		if (leap == 1)
		{
			switch (month)
			{
			case 1:
				System.out.printf("%d",day);
				break;
			case 2:
				System.out.printf("%d",31 + day);
				break;
			case 3:
				System.out.printf("%d",29 + 31 + day);
				break;
			case 4:
				System.out.printf("%d",31 + 29 + 31 + day);
				break;
			case 5:
				System.out.printf("%d",30 + 31 + 29 + 31 + day);
				break;
			case 6:
				System.out.printf("%d",31 + 30 + 31 + 29 + 31 + day);
				break;
			case 7:
				System.out.printf("%d",30 + 31 + 30 + 31 + 29 + 31 + day);
				break;
			case 8:
				System.out.printf("%d",31 + 30 + 31 + 30 + 31 + 29 + 31 + day);
				break;
			case 9:
				System.out.printf("%d",31 + 31 + 30 + 31 + 30 + 31 + 29 + 31 + day);
				break;
			case 10:
				System.out.printf("%d",30 + 31 + 31 + 30 + 31 + 30 + 31 + 29 + 31 + day);
				break;
			case 11:
				System.out.printf("%d",31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + 29 + 31 + day);
				break;
			case 12:
				System.out.printf("%d",30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + 29 + 31 + day);
				break;
			}
		}
		else
		{
			switch (month)
			{
			case 1:
				System.out.printf("%d",day);
				break;
			case 2:
				System.out.printf("%d",31 + day);
				break;
			case 3:
				System.out.printf("%d",28 + 31 + day);
				break;
			case 4:
				System.out.printf("%d",31 + 28 + 31 + day);
				break;
			case 5:
				System.out.printf("%d",30 + 31 + 28 + 31 + day);
				break;
			case 6:
				System.out.printf("%d",31 + 30 + 31 + 28 + 31 + day);
				break;
			case 7:
				System.out.printf("%d",30 + 31 + 30 + 31 + 28 + 31 + day);
				break;
			case 8:
				System.out.printf("%d",31 + 30 + 31 + 30 + 31 + 28 + 31 + day);
				break;
			case 9:
				System.out.printf("%d",31 + 31 + 30 + 31 + 30 + 31 + 28 + 31 + day);
				break;
			case 10:
				System.out.printf("%d",30 + 31 + 31 + 30 + 31 + 30 + 31 + 28 + 31 + day);
				break;
			case 11:
				System.out.printf("%d",31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + 28 + 31 + day);
				break;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


