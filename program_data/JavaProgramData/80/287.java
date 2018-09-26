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
		int y1;
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		int sum1;
		int sum2;
		int x1;
		int x2;
		int final;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			y2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			m2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			d2 = Integer.parseInt(tempVar6);
		}
		if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
		{
			switch (m1)
			{
					case 1:
						x1 = d1;
						break;
					case 2:
						x1 = 31 + d1;
						break;
					case 3:
						x1 = 31 + 29 + d1;
						break;
					case 4:
						x1 = 31 + 29 + 31 + d1;
						break;
					case 5:
						x1 = 31 + 29 + 31 + 30 + d1;
						break;
					case 6:
						x1 = 31 + 29 + 31 + 30 + 31 + d1;
						break;
					case 7:
						x1 = 31 + 29 + 31 + 30 + 31 + 30 + d1;
						break;
					case 8:
						x1 = 31 + 29 + 31 + 30 + 31 + 30 + 31 + d1;
						break;
					case 9:
						x1 = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + d1;
						break;
					case 10:
						x1 = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + d1;
						break;
					case 11:
						x1 = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + d1;
						break;
					case 12:
						x1 = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + d1;
						break;
			}
			sum1 = 365 * (y1 - 1) + x1 + (y1 - 1) / 4 - y1 / 100 + y1 / 400;
		}
		else
		{
			 switch (m1)
		{
					case 1:
						x1 = d1;
						break;
					case 2:
						x1 = 31 + d1;
						break;
					case 3:
						x1 = 31 + 28 + d1;
						break;
					case 4:
						x1 = 31 + 28 + 31 + d1;
						break;
					case 5:
						x1 = 31 + 28 + 31 + 30 + d1;
						break;
					case 6:
						x1 = 31 + 28 + 31 + 30 + 31 + d1;
						break;
					case 7:
						x1 = 31 + 28 + 31 + 30 + 31 + 30 + d1;
						break;
					case 8:
						x1 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + d1;
						break;
					case 9:
						x1 = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + d1;
						break;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


