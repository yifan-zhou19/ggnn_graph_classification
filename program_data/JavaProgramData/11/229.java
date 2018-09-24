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
		int a;
		int i = 1;
		while (i <= 5)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) == 1)
		{
			switch (month)
			{
			case 1:
				a = day;
				break;
			case 2:
				a = 31 + day;
				break;
			case 3:
				a = 31 + 29 + day;
				break;
			case 4:
				a = 31 + 29 + 31 + day;
				break;
			case 5:
				a = 31 + 29 + 31 + 30 + day;
				break;
			case 6:
				a = 31 + 29 + 31 + 30 + 31 + day;
				break;
			case 7:
				a = 31 + 29 + 31 + 30 + 31 + 30 + day;
				break;
			case 8:
				a = 31 + 29 + 31 + 30 + 31 + 30 + 31 + day;
				break;
			case 9:
				a = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + day;
				break;
			case 10:
				a = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
				break;
			case 11:
				a = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
				break;
			case 12:
				a = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
				break;
			default :
				System.out.print("error\n");
			}
		}
		else
		{
			switch (month)
			{
			case 1:
				a = day;
				break;
			case 2:
				a = 31 + day;
				break;
			case 3:
				a = 31 + 28 + day;
				break;
			case 4:
				a = 31 + 28 + 31 + day;
				break;
			case 5:
				a = 31 + 28 + 31 + 30 + day;
				break;
			case 6:
				a = 31 + 28 + 31 + 30 + 31 + day;
				break;
			case 7:
				a = 31 + 28 + 31 + 30 + 31 + 30 + day;
				break;
			case 8:
				a = 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
				break;
			case 9:
				a = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day;
				break;
			case 10:
				a = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
				break;
			case 11:
				a = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
				break;
			case 12:
				a = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
				break;
			default :
				System.out.print("error\n");
			}
		}
		System.out.printf("%d\n",a);
		i = i + 1;
		}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


