//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int x;
		int y;
		int z;
		int r;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			d = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			e = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			f = Integer.parseInt(tempVar6);
		}
		a = a - 1;
		x = 366 * (a / 4 - a / 100 + a / 400 - 1) + 365 * (a - (a / 4 - a / 100 + a / 400) + 1);
		a = a + 1;
		if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
		{
			switch (b)
			{
			case 1:
				y = 0;
				break;
			case 2:
				y = 31;
				break;
			case 3:
				y = 31 + 29;
				break;
			case 4:
				y = 31 + 29 + 31;
				break;
			case 5:
				y = 31 + 29 + 31 + 30;
				break;
			case 6:
				y = 31 + 29 + 31 + 30 + 31;
				break;
			case 7:
				y = 31 * 3 + 29 + 30 * 2;
				break;
			case 8:
				y = 31 * 4 + 29 + 30 * 2;
				break;
			case 9:
				y = 31 * 5 + 29 + 30 * 2;
				break;
			case 10:
				y = 31 * 5 + 29 + 30 * 3;
				break;
			case 11:
				y = 31 * 6 + 29 + 30 * 3;
				break;
			default:
				y = 31 * 6 + 29 + 30 * 4;
			}
		}
		else
		{
			switch (b)
			{
			case 1:
				y = 0;
				break;
			case 2:
				y = 31;
				break;
			case 3:
				y = 31 + 28;
				break;
			case 4:
				y = 31 + 28 + 31;
				break;
			case 5:
				y = 31 + 28 + 31 + 30;
				break;
			case 6:
				y = 31 + 28 + 31 + 30 + 31;
				break;
			case 7:
				y = 31 * 3 + 28 + 30 * 2;
				break;
			case 8:
				y = 31 * 4 + 28 + 30 * 2;
				break;
			case 9:
				y = 31 * 5 + 28 + 30 * 2;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


