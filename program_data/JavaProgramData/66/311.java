//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static int leap(int a)
	{
		if (a % 4 != 0)
		{
			return 0;
		}
		else
		{
			if (a % 100 != 0)
			{
				return 1;
			}
			else
			{
				if (a % 400 == 0)
				{
					return 1;
				}
				else
				{
					return 0;
				}
			}
		}
	}

	public static void Main()
	{
		int y;
		int y0;
		int y1;
		int y2;
		int m;
		int d;
		int sum = 0;
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
		y0 = y - 1;
		y0 = y0 % 400;
		if (y > 0)
		{
			y1 = y0 % 4;
			y2 = y0 / 4;
			sum = sum + y2 * 5 + y1 - y0 / 100;
		}
		if (leap(y) == 0)
		{
			switch (m)
			{
			case 1:
				break;
			case 2:
				sum = sum + 3;
				break;
			case 3:
				sum = sum + 3;
				break;
			case 4:
				sum = sum + 6;
				break;
			case 5:
				sum = sum + 1;
				break;
			case 6:
				sum = sum + 4;
				break;
			case 7:
				sum = sum + 6;
				break;
			case 8:
				sum = sum + 2;
				break;
			case 9:
				sum = sum + 5;
				break;
			case 10:
				break;
			case 11:
				sum = sum + 3;
				break;
			case 12:
				sum = sum + 5;
				break;
			}
		}
		else
		{
			switch (m)
			{
			case 1:
				break;
			case 2:
				sum = sum + 3;
				break;
			case 3:
				sum = sum + 4;
				break;
			case 4:
				break;
			case 5:
				sum = sum + 2;
				break;
			case 6:
				sum = sum + 5;
				break;
			case 7:
				break;
			case 8:
				sum = sum + 3;
				break;
			case 9:
				sum = sum + 6;
				break;
			case 10:
				sum = sum + 1;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


