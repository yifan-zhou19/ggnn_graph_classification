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
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}

		int s;
		int r;
		if (y >= 2)
		{
			r = (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;
			s = ((y - 1) + r) % 7;
		}
		else
		{
			s = 0;
		}
		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
		{
			switch (m)
			{
			case 1:
				s = (s + d) % 7;
				break;
			case 2:
				s = (s + 31 + d) % 7;
				break;
			case 3:
				s = (s + 31 + 29 + d) % 7;
				break;
			case 4:
				s = (s + 31 + 29 + 31 + d) % 7;
				break;
			case 5:
				s = (s + 31 + 29 + 31 + 30 + d) % 7;
				break;
			case 6:
				s = (s + 31 + 29 + 31 + 30 + 31 + d) % 7;
				break;
			case 7:
				s = (s + 31 + 29 + 31 + 30 + 31 + 30 + d) % 7;
				break;
			case 8:
				s = (s + 31 + 29 + 31 + 30 + 31 + 30 + 31 + d) % 7;
				break;
			case 9:
				s = (s + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + d) % 7;
				break;
			case 10:
				s = (s + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + d) % 7;
				break;
			case 11:
				s = (s + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + d) % 7;
				break;
			case 12:
				s = (s + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + d) % 7;
				break;
			}
		}
		else
		{
				switch (m)
				{
			case 1:
				s = (s + d) % 7;
				break;
			case 2:
				s = (s + 31 + d) % 7;
				break;
			case 3:
				s = (s + 31 + 28 + d) % 7;
				break;
			case 4:
				s = (s + 31 + 28 + 31 + d) % 7;
				break;
			case 5:
				s = (s + 31 + 28 + 31 + 30 + d) % 7;
				break;
			case 6:
				s = (s + 31 + 28 + 31 + 30 + 31 + d) % 7;
				break;
			case 7:
				s = (s + 31 + 28 + 31 + 30 + 31 + 30 + d) % 7;
				break;
			case 8:
				s = (s + 31 + 28 + 31 + 30 + 31 + 30 + 31 + d) % 7;
				break;
			case 9:
				s = (s + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + d) % 7;
				break;
			case 10:
				s = (s + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + d) % 7;
				break;
			case 11:
				s = (s + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + d) % 7;
				break;
			case 12:
				s = (s + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + d) % 7;
				break;
				}
		}



		switch (s)
		{
		case 1:

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


