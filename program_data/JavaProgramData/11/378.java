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
		int y;
		int m;
		int d;
		int a;
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
		if (y % 4 != 0)
		{
			switch (m)
			{
			case 1:
				a = d;
				break;
			case 2:
				a = 31 + d;
				break;
			case 3:
				a = 31 + 28 + d;
				break;
			case 4:
				a = 31 + 28 + 31 + d;
				break;
			case 5:
				a = 31 + 28 + 31 + 30 + d;
				break;
			case 6:
				a = 31 + 28 + 31 + 30 + 31 + d;
				break;
			case 7:
				a = 31 + 28 + 31 + 30 + 31 + 30 + d;
				break;
			case 8:
				a = 31 + 28 + 31 + 30 + 31 + 30 + 31 + d;
				break;
			case 9:
				a = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + d;
				break;
			case 10:
				a = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + d;
				break;
			case 11:
				a = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + d;
				break;
			case 12:
				a = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + d;
				break;
			}
			System.out.printf("%d",a);
		}
		else if (y % 400 == 0)
		{
			switch (m)
			{
			case 1:
				a = d;
				break;
			case 2:
				a = 31 + d;
				break;
			case 3:
				a = 31 + 29 + d;
				break;
			case 4:
				a = 31 + 29 + 31 + d;
				break;
			case 5:
				a = 31 + 29 + 31 + 30 + d;
				break;
			case 6:
				a = 31 + 29 + 31 + 30 + 31 + d;
				break;
			case 7:
				a = 31 + 29 + 31 + 30 + 31 + 30 + d;
				break;
			case 8:
				a = 31 + 29 + 31 + 30 + 31 + 30 + 31 + d;
				break;
			case 9:
				a = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + d;
				break;
			case 10:
				a = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + d;
				break;
			case 11:
				a = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + d;
				break;
			case 12:
				a = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + d;
				break;
			}
			System.out.printf("%d",a);
		}
		else if (y % 4 == 0 && y % 100 == 0 && y % 400 != 0)
		{
			switch (m)
			{
			case 1:
				a = d;
				break;
			case 2:

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


