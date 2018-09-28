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
		int n;
		int i;
		int e;
		int day1;
		int day2;
		int[] y = new int[200];
		int[] m1 = new int[200];
		int[] m2 = new int[200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m1[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				m2[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			e = (y[i] % 4 == 0 && y[i] % 100 != 0 || y[i] % 400 == 0)?29:28;
			switch (m1[i])
			{
			case 1:
			{
				day1 = 1;
				break;
			}
			case 2:
			{
				day1 = 32;
				break;
			}
			case 3:
			{
				day1 = 32 + e;
				break;
			}
			case 4:
			{
				day1 = 63 + e;
				break;
			}
			case 5:
			{
				day1 = 93 + e;
				break;
			}
			case 6:
			{
				day1 = 124 + e;
				break;
			}
			case 7:
			{
				day1 = 154 + e;
				break;
			}
			case 8:
			{
				day1 = 185 + e;
				break;
			}
			case 9:
			{
				day1 = 216 + e;
				break;
			}
			case 10:
			{
				day1 = 246 + e;
				break;
			}
			case 11:
			{
				day1 = 277 + e;
				break;
			}
			case 12:
			{
				day1 = 307 + e;
				break;
			}
			}
			switch (m2[i])
			{
			case 1:
			{
				day2 = 1;
				break;
			}
			case 2:
			{
				day2 = 32;
				break;
			}
			case 3:
			{
				day2 = 32 + e;
				break;
			}
			case 4:
			{
				day2 = 63 + e;
				break;
			}
			case 5:
			{
				day2 = 93 + e;
				break;
			}
			case 6:
			{
				day2 = 124 + e;
				break;
			}
			case 7:
			{
				day2 = 154 + e;
				break;
			}
			case 8:
			{
				day2 = 185 + e;
				break;
			}
			case 9:
			{
				day2 = 216 + e;
				break;
			}
			case 10:
			{
				day2 = 246 + e;
				break;
			}
			case 11:
			{
				day2 = 277 + e;
				break;
			}
			case 12:
			{
				day2 = 307 + e;
				break;
			}
			}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


