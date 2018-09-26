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
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
		int i;
		int x = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			y2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			m2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			d2 = Integer.parseInt(tempVar6);
		}
		i = y1;
		for (i = y1;i < y2;i++)
		{
			if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0))
			{
				x = x + 366;
			}
			else
			{
				x = x + 365;
			}
		}
		switch (m1)
		{
		case 1:
			break;
		case 2:
			x = x - 31;
			break;
		case 3:
			x = x - 59;
			break;
		case 4:
			x = x - 90;
			break;
		case 5:
			x = x - 120;
			break;
		case 6:
			x = x - 151;
			break;
		case 7:
			x = x - 181;
			break;
		case 8:
			x = x - 212;
			break;
		case 9:
			x = x - 243;
			break;
		case 10:
			x = x - 273;
			break;
		case 11:
			x = x - 304;
			break;
		case 12:
			x = x - 334;
			break;
		}
		switch (m2)
		{
		case 1:
			break;
		case 2:
			x = x + 31;
			break;
		case 3:
			x = x + 59;
			break;
		case 4:
			x = x + 90;
			break;
		case 5:
			x = x + 120;
			break;
		case 6:
			x = x + 151;
			break;
		case 7:
			x = x + 181;
			break;
		case 8:
			x = x + 212;
			break;
		case 9:
			x = x + 243;
			break;
		case 10:
			x = x + 273;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


