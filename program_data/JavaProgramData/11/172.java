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
	   int mon;
	   int day;
	   int n;
	   int leap;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   year = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   mon = Integer.parseInt(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   day = Integer.parseInt(tempVar3);
	   }
	   if (year % 4 == 0)
	   {
			if (year % 100 == 0)
			{
				  if (year % 400 == 0)
				  {
					  leap = 1;
				  }
				  else
				  {
					  leap = 0;
				  }
			}
			else
			{
				leap = 1;
			}
	   }
	   else
	   {
		   leap = 0;
	   }
	   if (leap = 0)
	   {
		  switch (mon)
		  {
			case 1:
				n = day;
				break;
			case 2:
				n = 31 + day;
				break;
			case 3:
				n = 31 + 29 + day;
				break;
			case 4:
				n = 31 + 29 + 31 + day;
				break;
			case 5:
				n = 31 + 29 + 31 + 30 + day;
				break;
			case 6:
				n = 31 + 29 + 31 + 30 + 31 + day;
				break;
			case 7:
				n = 31 + 29 + 31 + 30 + 31 + 30 + day;
				break;
			case 8:
				n = 31 + 29 + 31 + 30 + 31 + 30 + 31 + day;
				break;
			case 9:
				n = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + day;
				break;
			case 10:
				n = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
				break;
			case 11:
				n = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
				break;
			case 12:
				n = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
				break;
		  }
		 System.out.printf("%d",n);
	   }
	   else
		{
		  switch (mon)
		  {
			 case 1:
				 n = day;
				 break;
			case 2:
				n = 31 + day;
				break;
			case 3:
				n = 31 + 28 + day;
				break;
			case 4:
				n = 31 + 28 + 31 + day;
				break;
			case 5:
				n = 31 + 28 + 31 + 30 + day;
				break;
			case 6:
				n = 31 + 28 + 31 + 30 + 31 + day;
				break;
			case 7:
				n = 31 + 28 + 31 + 30 + 31 + 30 + day;
				break;
			case 8:
				n = 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
				break;
			case 9:
				n = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day;
				break;
			case 10:
				n = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
				break;
			case 11:
				n = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


