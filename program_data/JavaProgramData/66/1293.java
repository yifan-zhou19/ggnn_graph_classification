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
		int c;
		int d;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		b = 0;
		if (a % 100 == 0 && (a / 100) % 4 != 0 && a % 4 != 0)
		{
			b = a / 4 + a - (a / 100 - a / 400) - 1;
		}
		else
		{
			b = a / 4 + a - (a / 100 - a / 400) - 2;
		}
		if (a % 100 == 0 && (a / 100) % 4 != 0 && a % 4 != 0)
		{
			switch (c)
			{
			case 1:
				b = b;
				break;
			case 2:
				b = b + 3;
				break;
			case 3:
				b = b + 3;
				break;
			case 4:
				b = b + 6;
				break;
			case 5:
				b = b + 1;
				break;
			case 6:
				b = b + 4;
				break;
			case 7:
				b = b + 6;
				break;
			case 8:
				b = b + 2;
				break;
			case 9:
				b = b + 5;
				break;
			case 10:
				b = b + 7;
				break;
			case 11:
				b = b + 3;
				break;
			case 12:
				b = b + 5;
				break;
			}
		}
		else
		{
			switch (c)
			{
			case 1:
				b = b;
				break;
			case 2:
				b = b + 3;
				break;
			case 3:
				b = b + 4;
				break;
			case 4:
				b = b + 7;
				break;
			case 5:
				b = b + 2;
				break;
			case 6:
				b = b + 5;
				break;
			case 7:
				b = b + 7;
				break;
			case 8:
				b = b + 3;
				break;
			case 9:
				b = b + 6;
				break;
			case 10:
				b = b + 1;
				break;
			case 11:
				b = b + 4;
				break;
			case 12:
				b = b + 6;
				break;
			}
		}
		b = b + d;
		e = b % 7;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


