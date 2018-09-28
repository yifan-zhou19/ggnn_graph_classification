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
		int year;
		int month;
		int day;
		int xq;
		int count;
		int a;
		int b;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		year = year % 400;
		if (year == 0)
		{
			xq = 6;
		}
		else
		{
			a = year / 100;
			if (a == 0)
			{
				xq = 6;
			}
			if (a == 1)
			{
				xq = 4;
			}
			if (a == 2)
			{
				xq = 2;
			}
			if (a == 3)
			{
				xq = 0;
			}
			b = year % 100;
			c = b % 4;
			d = b / 4;
			if (c != 0)
			{
				xq = xq + 5 * d + c + 1;
			}
			if (c == 0)
			{
				xq = xq + 5 * d;
			}



			xq = xq % 7;
		}
		if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0)
		{
			  switch (month)
			  {
			  case 1:
				  count = day - 1;
				  break;
			  case 2:
				  count = day + 31 - 1;
				  break;
			  case 3:
				  count = day + 31 + 28 - 1;
				  break;
			  case 4:
				  count = day + 31 + 28 + 31 - 1;
				  break;
			  case 5:
				  count = day + 31 + 28 + 31 + 30 - 1;
				  break;
			  case 6:
				  count = day + 31 + 28 + 31 + 30 + 31 - 1;
				  break;
			  case 7:
				  count = day + 31 + 28 + 31 + 30 + 31 + 30 - 1;
				  break;
			  case 8:
				  count = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 - 1;
				  break;
			  case 9:
				  count = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 - 1;
				  break;
			  case 10:
				  count = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 - 1;
				  break;
			  case 11:
				  count = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 - 1;
				  break;
			  case 12:
				  count = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 - 1;
				  break;
			  }
		}
		else
		{
			switch (month)
			  {
			  case 1:
				  count = day - 1;
				  break;
			  case 2:
				  count = day + 31 - 1;
				  break;
			  case 3:
				  count = day + 31 + 29 - 1;
				  break;
			  case 4:
				  count = day + 31 + 29 + 31 - 1;
				  break;
			  case 5:
				  count = day + 31 + 29 + 31 + 30 - 1;
				  break;
			  case 6:
				  count = day + 31 + 29 + 31 + 30 + 31 - 1;
				  break;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


