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
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		int i;
		int j;
		int a;
		i = 1;
		j = 1;
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
		int leap;
		int yi;
		yi = 0;
		while (i < y1)
		{
			if (i % 4 == 0)
			{
				if (i % 100 == 0)
				{
					if (i % 400 == 0)
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
			i++;
			if (leap != 0)
			{
				yi = yi + 366;
			}
			else
			{
				yi = yi + 365;
			}
		}
		int l;
		if (y1 % 4 == 0)
		{
				if (y1 % 100 == 0)
				{
					if (y1 % 400 == 0)
					{
						l = 1;
					}
					else
					{
						l = 0;
					}
				}
				else
				{
					l = 1;
				}
		}
			else
			{
				l = 0;
			}
			if (l = 1)
			{
				switch (m1)
				{
	case 1:
		yi = yi + d1;
		break;
	case 2:
		yi = yi + 31 + d1;
		break;
	case 3:
		yi = yi + 31 + 29 + d1;
		break;
	case 4:
		yi = yi + 31 + 29 + 31 + d1;
		break;
	case 5:
		yi = yi + 31 + 29 + 31 + 30 + d1;
		break;
	case 6:
		yi = yi + 31 + 29 + 31 + 30 + 31 + d1;
		break;
	case 7:
		yi = yi + 31 + 29 + 31 + 30 + 31 + 30 + d1;
		break;
	case 8:
		yi = yi + 31 + 29 + 31 + 30 + 31 + 30 + 31 + d1;
		break;
	case 9:
		yi = yi + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + d1;
		break;
	case 10:
		yi = yi + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + d1;
		break;
	case 11:
		yi = yi + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + d1;
		break;
	case 12:
		yi = yi + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + d1;
		break;
				}
			}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


