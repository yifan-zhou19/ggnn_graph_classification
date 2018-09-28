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
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int b,m,d,a,l,w,q;
		int b;
		int m;
		int d;
		int a;
		int l;
		int w;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		if ((b % 4 == 0 && b % 100 != 0) || (b % 400 == 0))
		{
			switch (m)
			{
			case 1:
				a = 366;
				break;
			case 2:
				a = 335;
				break;
			case 3:
				a = 306;
				break;
			case 4:
				a = 275;
				break;
			case 5:
				a = 245;
				break;
			case 6:
				a = 214;
				break;
			case 7:
				a = 184;
				break;
			case 8:
				a = 153;
				break;
			case 9:
				a = 122;
				break;
			case 10:
				a = 92;
				break;
			case 11:
				a = 61;
				break;
			case 12:
				a = 31;
				break;
			}
			l = 366 - a + d;

		}
		else
		{
			switch (m)
			{
			case 1:
				a = 365;
				break;
			case 2:
				a = 334;
				break;
			case 3:
				a = 306;
				break;
			case 4:
				a = 275;
				break;
			case 5:
				a = 245;
				break;
			case 6:
				a = 214;
				break;
			case 7:
				a = 184;
				break;
			case 8:
				a = 153;
				break;
			case 9:
				a = 122;
				break;
			case 10:
				a = 92;
				break;
			case 11:
				a = 61;
				break;
			case 12:
				a = 31;
				break;
			}
			l = 365 - a + d;

		}

	w = (b - 1) + (b - 1) / 4 - (b - 1) / 100 + (b - 1) / 400 + l;
	q = w % 7;
	switch (q)
		{

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


