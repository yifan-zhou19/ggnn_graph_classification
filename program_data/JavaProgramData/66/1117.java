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
		int a;
		int b;
		int B;
		int c;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}

		if ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0))
		{
			switch (b)
			{
			case 1:
				B = 0;
				break;
			case 2:
				B = 31;
				break;
			case 3:
				B = 31 + 29;
				break;
			case 4:
				B = 31 * 2 + 29;
				break;
			case 5:
				B = 31 * 2 + 29 + 30;
				break;
			case 6:
				B = 31 * 3 + 29 + 30;
				break;
			case 7:
				B = 31 * 3 + 29 + 30 * 2;
				break;
			case 8:
				B = 31 * 4 + 29 + 30 * 2;
				break;
			case 9:
				B = 31 * 5 + 29 + 30 * 2;
				break;
			case 10:
				B = 31 * 5 + 29 + 30 * 3;
				break;
			case 11:
				B = 31 * 6 + 29 + 30 * 3;
				break;
			case 12:
				B = 31 * 6 + 29 + 30 * 4;
				break;
			}
		}
		else
		{
			switch (b)
			{
			case 1:
				B = 0;
				break;
			case 2:
				B = 31;
				break;
			case 3:
				B = 31 + 28;
				break;
			case 4:
				B = 31 * 2 + 28;
				break;
			case 5:
				B = 31 * 2 + 28 + 30;
				break;
			case 6:
				B = 31 * 3 + 28 + 30;
				break;
			case 7:
				B = 31 * 3 + 28 + 30 * 2;
				break;
			case 8:
				B = 31 * 4 + 28 + 30 * 2;
				break;
			case 9:
				B = 31 * 5 + 28 + 30 * 2;
				break;
			case 10:
				B = 31 * 5 + 28 + 30 * 3;
				break;
			case 11:
				B = 31 * 6 + 28 + 30 * 3;
				break;
			case 12:
				B = 31 * 6 + 28 + 30 * 4;
				break;
			}
		}
		x = a - 1 + (a - 1) / 4 - (a - 1) / 100 + (a - 1) / 400 + B + c;
		y = x % 7;
		switch (y)
		{
		case 1:
			System.out.print("Mon.");
			break;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


