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
		int e;
		int f;
		int m;
		int n;
		int num = 0;
		int i;
		int o;
		int p;
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
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			e = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			f = Integer.parseInt(tempVar6);
		}
		for (i = a + 1;i < d;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				num = num + 1;
			}
		}
		if (((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) && b <= 2)
		{
				num = num + 1;
		}
		if (((d % 4 == 0 && d % 100 != 0) || (d % 400 == 0)) && e >= 3)
		{
				num = num + 1;
		}

		m = d - a;
		n = 365 * m + num;
		switch (b)
		{
			case 1:
				o = c;
				break;
			case 2:
				o = 31 + c;
				break;
			case 3:
				o = 59 + c;
				break;
			case 4:
				o = 90 + c;
				break;
			case 5:
				o = 120 + c;
				break;
			case 6:
				o = 151 + c;
				break;
			case 7:
				o = 181 + c;
				break;
			case 8:
				o = 212 + c;
				break;
			case 9:
				o = 243 + c;
				break;
			case 10:
				o = 273 + c;
				break;
			case 11:
				o = 304 + c;
				break;
			case 12:
				o = 334 + c;
				break;
		}
		switch (e)
		{
			case 1:
				p = f;
				break;
			case 2:
				p = 31 + f;
				break;
			case 3:
				p = 59 + f;
				break;
			case 4:
				p = 90 + f;
				break;
			case 5:
				p = 120 + f;
				break;
			case 6:
				p = 151 + f;
				break;
			case 7:
				p = 181 + f;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


