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
		int m = 0;
		int n;
		int r = 0;
		int l;
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
		l = a / 4 - a / 100 + a / 400;
		if (((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0))
		{
			r = 1;
		}
		if (r == 1)
		{
			l = l - 1;
			switch (b)
			{
				case 2:
					m = 31;
					break;
				case 3:
					m = 60;
					break;
				case 4:
					m = 91;
					break;
				case 5:
					m = 121;
					break;
				case 6:
					m = 152;
					break;
				case 7:
					m = 182;
					break;
				case 8:
					m = 213;
					break;
				case 9:
					m = 244;
					break;
				case 10:
					m = 274;
					break;
				case 11:
					m = 305;
					break;
				case 12:
					m = 335;
					break;
			}
		}
		else
		{
			switch (b)
			{
				case 2:
					m = 31;
					break;
				case 3:
					m = 59;
					break;
				case 4:
					m = 90;
					break;
				case 5:
					m = 120;
					break;
				case 6:
					m = 151;
					break;
				case 7:
					m = 181;
					break;
				case 8:
					m = 212;
					break;
				case 9:
					m = 243;
					break;
				case 10:
					m = 273;
					break;
				case 11:
					m = 304;
					break;
				case 12:
					m = 334;
					break;
			}
		}
		n = (a - 1 + m + l + c) % 7;
		switch (n)
		{
			case 0:
				System.out.print("Sun.");
				break;
			case 1:

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


