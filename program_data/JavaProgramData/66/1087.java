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
		int date;
		int a;
		int b;
		int c;
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
		a = (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		if (year % 4 != 0)
		{
		  switch (month)
		  {
		  case 1:
			  b = 0;
			  break;
		  case 2:
			  b = 31;
			  break;
		  case 3:
			  b = 59;
			  break;
		  case 4:
			  b = 90;
			  break;
		  case 5:
			  b = 120;
			  break;
		  case 6:
			  b = 151;
			  break;
		  case 7:
			  b = 181;
			  break;
		  case 8:
			  b = 212;
			  break;
		  case 9:
			  b = 243;
			  break;
		  case 10:
			  b = 273;
			  break;
		  case 11:
			  b = 304;
			  break;
		  case 12:
			  b = 334;
			  break;
		  }
		}
		if (year % 4 == 0)
		{
			if ((year % 100 != 0) || (year % 400 == 0))
			{
			   switch (month)
			   {
		  case 1:
			  b = 0;
			  break;
		  case 2:
			  b = 31;
			  break;
		  case 3:
			  b = 60;
			  break;
		  case 4:
			  b = 91;
			  break;
		  case 5:
			  b = 121;
			  break;
		  case 6:
			  b = 152;
			  break;
		  case 7:
			  b = 182;
			  break;
		  case 8:
			  b = 213;
			  break;
		  case 9:
			  b = 244;
			  break;
		  case 10:
			  b = 274;
			  break;
		  case 11:
			  b = 305;
			  break;
		  case 12:
			  b = 335;
			  break;
			   }
			}
		  if (year % 100 == 0 && year % 400 != 0)
		  {
			  switch (month)
		  {
		  case 1:

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


