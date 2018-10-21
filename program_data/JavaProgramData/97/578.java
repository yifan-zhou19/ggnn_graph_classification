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
		int money;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			money = Integer.parseInt(tempVar);
		}
		int ge;
		int shi;
		int bai;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		ge = money % 10;
		shi = (money % 100 - (money % 100) % 10) / 10;
		bai = money / 100;
		a = bai;
		switch (shi)
		{
		case 0:
			b = 0;
			c = 0;
			d = 0;
			break;
		case 1:
			b = 0;
			c = 0;
			d = 1;
			break;
		case 2:
			b = 0;
			c = 1;
			d = 0;
			break;
		case 3:
			b = 0;
			c = 1;
			d = 1;
			break;
		case 4:
			b = 0;
			c = 2;
			d = 0;
			break;
		case 5:
			b = 1;
			c = 0;
			d = 0;
			break;
		case 6:
			b = 1;
			c = 0;
			d = 1;
			break;
		case 7:
			b = 1;
			c = 1;
			d = 0;
			break;
		case 8:
			b = 1;
			c = 1;
			d = 1;
			break;
		case 9:
			b = 1;
			c = 2;
			d = 0;
			break;
		default:
			break;
		}
		switch (ge)
		{
		case 0:
			e = 0;
			f = 0;
			break;
		case 1:
			e = 0;
			f = 1;
			break;
		case 2:
			e = 0;
			f = 2;
			break;
		case 3:
			e = 0;
			f = 3;
			break;
		case 4:
			e = 0;
			f = 4;
			break;
		case 5:
			e = 1;
			f = 0;
			break;
		case 6:
			e = 1;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


