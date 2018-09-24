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
	 int date;
	 int a;
	 int b;
	 int c;
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
		 date = Integer.parseInt(tempVar3);
	 }
	 if (year < 100)
	 {
	  a = 3;
	 }
	 else
	 {
	 a = year / 100 % 4 * (-2) + 5 + year % 100 / 4 + year % 100;
	 }
	 if ((year % 400 != 0 && year % 100 == 0) || year % 4 != 0)
	 {
	  switch (month)
	  {
	  case 1:
	  case 10:
	   b = 1;
	   break;
	  case 2:
	  case 3:
	  case 11:
	   b = 4;
	   break;
	  case 4:
	  case 7:
	   b = 0;
	   break;
	  case 5:
	   b = 2;
	   break;
	  case 6:
	   b = 5;
	   break;
	  case 8:
	   b = 3;
	   break;
	  case 9:
	  case 12:
	   b = 6;
	   break;
	  }

	 }
		else
		{
	   switch (month)
	   {
	  case 10:
	   b = 1;
	   break;
	  case 3:
	  case 11:
	   b = 4;
	   break;
	  case 1:
	  case 4:
	  case 7:
	   b = 0;
	   break;
	  case 5:
	   b = 2;
	   break;
	  case 6:
	   b = 5;
	   break;
	  case 2:
	  case 8:
	   b = 3;
	   break;
	  case 9:
	  case 12:
	   b = 6;
	   break;
	   }
		}
	 c = (a + b + date) % 7;
	 switch (c)
	 {
	 case 1:
	  System.out.print("Mon.");
	  break;
	 case 2:
	  System.out.print("Tue.");
	  break;
	 case 3:
	  System.out.print("Wed.");
	  break;
	 case 4:
	  System.out.print("Thu.");
	  break;
	 case 5:
	  System.out.print("Fri.");
	  break;
	 case 6:
	  System.out.print("Sat.");
	  break;
	 case 0:
	  System.out.print("Sun.");

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


