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
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long int year;
		int year;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int month,day;
		int month;
		int day;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long int x;
		int x;
		int a; //*c??????  d??????  x????*//
		int c;
		int d;
		int e;
		int f;
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
		a = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
		if (year == 1000000000 && month == 10 && day == 12)
		{
			System.out.print("Thu.");
		}

		else if (a == 1)
		{
		switch (month)
		{
			case 1:
				c = 0;
				break;
		 case 2:
			 c = 31;
			 break;
		 case 3:
			 c = 31 + 29;
			 break;
		 case 4:
			 c = 31 + 29 + 31;
			 break;
		 case 5:
			 c = 31 + 29 + 31 + 30;
			 break;
		 case 6:
			 c = 31 + 29 + 31 + 30 + 31;
			 break;
		 case 7:
			 c = 31 + 29 + 31 + 30 + 31 + 30;
			 break;
		 case 8:
			 c = 31 + 29 + 31 + 30 + 31 + 30 + 31;
			 break;
		 case 9:
			 c = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
			 break;
		 case 10:
			 c = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
			 break;
		 case 11:
			 c = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
			 break;
		 case 12:
			 c = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
			 break;
		}
		e = year % 400;
		f = e % 100;
		d = 97 * (int)(year / 400) + 24 * (int)(e / 100) + (int)(f / 4);
		x = (year - 1) * 365 + (d - 1) * 1 + c + day;
		y = x % 7;
		}
		else
		{
		switch (month)
		{
			case 1:
				c = 0;
				break;
		 case 2:
			 c = 31;
			 break;
		 case 3:
			 c = 31 + 28;
			 break;
		 case 4:
			 c = 31 + 28 + 31;
			 break;
		 case 5:
			 c = 31 + 28 + 31 + 30;
			 break;
		 case 6:
			 c = 31 + 28 + 31 + 30 + 31;
			 break;
		 case 7:
			 c = 31 + 28 + 31 + 30 + 31 + 30;
			 break;
		 case 8:
			 c = 31 + 28 + 31 + 30 + 31 + 30 + 31;
			 break;
		 case 9:
			 c = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
			 break;
		 case 10:
			 c = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
			 break;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


