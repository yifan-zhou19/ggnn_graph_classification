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
		int t = 0;
		int l;
		int a;
		int b;
		int c;
		int ry;
		int d1 = 0;
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
		a = (y - 1) / 4;
		b = (y - 1) / 100;
		c = (y - 1) / 400;
		ry = a - b + c;
		d1 = 365 % 7 * (y - 1) % 7 + ry % 7;
		if (y >= 4 && y < 100 && y % 4 == 0)
		{
				t = 1;
		}
		else if (y >= 100 && y % 4 == 0 && y % 100 != 0)
		{
				t = 1;
		}
		else if (y >= 100 && y % 100 == 0 && y % 400 == 0)
		{
				t = 1;
		}
		if (t == 0)
		{
		switch (m)
		{
		case 1:
			d1 += d;
			break;
		case 2:
			d1 = d1 + 31 + d;
			break;
		case 3:
			d1 = d1 + 59 + d;
			break;
		case 4:
			d1 = d1 + 90 + d;
			break;
		case 5:
			d1 = d1 + 120 + d;
			break;
		case 6:
			d1 = d1 + 151 + d;
			break;
		case 7:
			d1 = d1 + 181 + d;
			break;
		case 8:
			d1 = d1 + 212 + d;
			break;
		case 9:
			d1 = d1 + 243 + d;
			break;
		case 10:
			d1 = d1 + 273 + d;
			break;
		case 11:
			d1 = d1 + 304 + d;
			break;
		case 12:
			d1 = d1 + 334 + d;
			break;
		}
		}
		if (t == 1)
		{
		switch (m)
		{
		case 1:
			d1 += d;
			break;
		case 2:
			d1 = d1 + 31 + d;
			break;
		case 3:
			d1 = d1 + 60 + d;
			break;
		case 4:
			d1 = d1 + 91 + d;
			break;
		case 5:
			d1 = d1 + 121 + d;
			break;
		case 6:
			d1 = d1 + 152 + d;
			break;
		case 7:
			d1 = d1 + 182 + d;
			break;
		case 8:
			d1 = d1 + 213 + d;
			break;
		case 9:
			d1 = d1 + 244 + d;
			break;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


