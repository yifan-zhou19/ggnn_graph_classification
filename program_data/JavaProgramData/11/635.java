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
	  int leap;
	  int sum;
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
	  if (year % 4 != 0)
	  {
		  leap = 0;
	  }
	  if (year % 4 == 0)
	  {
		  if (year % 100 != 0)
		  {
			  leap = 1;
		  }
		  if (year % 100 == 0 && year % 400 == 0)
		  {
			  leap = 1;
		  }
		  else
		  {
			  leap = 0;
		  }
	  }
	  if (leap == 1)
	  {
		  switch (month)
		  {
		  case 1:
			  sum = day;
			  break;
		  case 2:
			  sum = 31 + day;
			  break;
		  case 3:
			  sum = 31 + 29 + day;
			  break;
		  case 4:
			  sum = 31 + 29 + 31 + day;
			  break;
		  case 5:
			  sum = 31 + 29 + 31 + 30 + day;
			  break;
		  case 6:
			  sum = 31 + 29 + 31 + 30 + 31 + day;
			  break;
		  case 7:
			  sum = 31 + 29 + 31 + 30 + 31 + 30 + day;
			  break;
		  case 8:
			  sum = 31 + 29 + 31 + 30 + 31 + 30 + 31 + day;
			  break;
		  case 9:
			  sum = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + day;
			  break;
		  case 10:
			  sum = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
			  break;
		  case 11:
			  sum = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
			  break;
		  case 12:
			  sum = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
			  break;
		  }
	  }
	  if (leap == 0)
	  {
		  switch (month)
		  {
		  case 1:
			  sum = day;
			  break;
		  case 2:
			  sum = 31 + day;
			  break;
		  case 3:
			  sum = 31 + 28 + day;
			  break;
		  case 4:
			  sum = 31 + 28 + 31 + day;
			  break;
		  case 5:
			  sum = 31 + 28 + 31 + 30 + day;
			  break;
		  case 6:
			  sum = 31 + 28 + 31 + 30 + 31 + day;
			  break;
		  case 7:
			  sum = 31 + 28 + 31 + 30 + 31 + 30 + day;
			  break;
		  case 8:
			  sum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
			  break;
		  case 9:
			  sum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day;
			  break;
		  case 10:
			  sum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
			  break;
		  case 11:
			  sum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
			  break;
		  case 12:

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


