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
		int year;
		int month;
		int day;
		int a;
		int b;
		int c;
		int m;
		int n;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		a = (year - 1) % 400;
		m = a / 100;
		n = a / 4;
		b = 365 * a + (n - m);
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			switch (month)
			{
			case 1:
				c = b;
				break;
			case 2:
				c = b + 31;
				break;
			case 3:
				c = b + 60;
				break;
			case 4:
				c = b + 91;
				break;
			case 5:
				c = b + 121;
				break;
			case 6:
				c = b + 152;
				break;
			case 7:
				c = b + 182;
				break;
			case 8:
				c = b + 213;
				break;
			case 9:
				c = b + 244;
				break;
			case 10:
				c = b + 274;
				break;
			case 11:
				c = b + 305;
				break;
			case 12:
				c = b + 335;
				break;
			}
			x = c + day;
			y = x % 7;
		}
		else
		{
			switch (month)
			{
			case 1:
				c = b;
				break;
			case 2:
				c = b + 31;
				break;
			case 3:
				c = b + 69;
				break;
			case 4:
				c = b + 90;
				break;
			case 5:
				c = b + 120;
				break;
			case 6:
				c = b + 151;
				break;
			case 7:
				c = b + 181;
				break;
			case 8:
				c = b + 212;
				break;
			case 9:
				c = b + 243;
				break;
			case 10:
				c = b + 273;
				break;
			case 11:
				c = b + 304;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


