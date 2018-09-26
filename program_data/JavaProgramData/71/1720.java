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
		int year;
		int m1;
		int m2;
		int date = 1;
		int n;
		int x;
		int day;
		int day2;
		int a;
		int b;
		int c;
		int e;
		int g;
		int h;
		int j;
		int d;
		int f;
		int i;
		int k;

		a = c = e = g = h = j = 31;
		d = f = i = k = 30;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (x = 0;x < n;x++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			year = Integer.parseInt(tempVar2);
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

		if ((year % 4 != 0) || (year % 100 == 0 && year % 400 != 0))
		{
			b = 28;
		}
		else
		{
			b = 29;
		}

		switch (m1)
		{
		case 1:
			day = date;
			break;
		case 2:
			day = a + date;
			break;
		case 3:
			day = a + b + date;
			break;
		case 4:
			day = a + b + c + date;
			break;
		case 5:
			day = a + b + c + d + date;
			break;
		case 6:
			day = a + b + c + d + e + date;
			break;
		case 7:
			day = a + b + c + d + e + f + date;
			break;
		case 8:
			day = a + b + c + d + e + f + g + date;
			break;
		case 9:
			day = a + b + c + d + e + f + g + h + date;
			break;
		case 10:
			day = a + b + c + d + e + f + g + h + i + date;
			break;
		case 11:
			day = a + b + c + d + e + f + g + h + i + j + date;
			break;
		case 12:
			day = a + b + c + d + e + f + g + h + i + j + k + date;
			break;
		}

		switch (m2)
		{
		case 1:
			day2 = date;
			break;
		case 2:
			day2 = a + date;
			break;
		case 3:
			day2 = a + b + date;
			break;
		case 4:
			day2 = a + b + c + date;
			break;
		case 5:
			day2 = a + b + c + d + date;
			break;
		case 6:
			day2 = a + b + c + d + e + date;
			break;
		case 7:
			day2 = a + b + c + d + e + f + date;
			break;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


