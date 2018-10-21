//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int y;
		int m1;
		int m2;
		int d1;
		int d2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			d1 = 0;
			d2 = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m2 = Integer.parseInt(tempVar4);
			}
			if (y % 100 == 0 && y % 40 == 0 || y % 100 != 0 && y % 4 == 0) //leap
			{
				switch (m1)
				{
				case 1:
					d1 += 0;
					break;
				case 2:
					d1 += 31;
					break;
				case 3:
					d1 += 60;
					break;
				case 4:
					d1 += 91;
					break;
				case 5:
					d1 += 121;
					break;
				case 6:
					d1 += 152;
					break;
				case 7:
					d1 += 182;
					break;
				case 8:
					d1 += 213;
					break;
				case 9:
					d1 += 244;
					break;
				case 10:
					d1 += 274;
					break;
				case 11:
					d1 += 305;
					break;
				case 12:
					d1 += 335;
					break;
				}
				switch (m2)
				{
				case 1:
					d2 += 0;
					break;
				case 2:
					d2 += 31;
					break;
				case 3:
					d2 += 60;
					break;
				case 4:
					d2 += 91;
					break;
				case 5:
					d2 += 121;
					break;
				case 6:
					d2 += 152;
					break;
				case 7:
					d2 += 182;
					break;
				case 8:
					d2 += 213;
					break;
				case 9:
					d2 += 244;
					break;
				case 10:
					d2 += 274;
					break;
				case 11:
					d2 += 305;
					break;
				case 12:
					d2 += 335;
					break;
				}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


