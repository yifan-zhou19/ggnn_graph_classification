//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	/*
	 * 5.cpp
	 *
	 *  Created on: 2011-11-4
	 *      Author: 11132
	 */

	public static int Main()
	{
	   int y1;
	   int m1;
	   int d1;
	   int y2;
	   int m2;
	   int d2;
	   int t1;
	   int t2;
	   int n;
	   int i;
	   int p = 0;
	   y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	   if ((y1 % 4 == 0) && (y1 % 100 != 0) || (y1 % 400 == 0))
	   {
		   switch (m1)
		   {
	   case 1:
		   t1 = d1;
		   break;
	   case 2:
		   t1 = 31 + d1;
		   break;
	   case 3:
		   t1 = 59 + d1 + 1;
		   break;
	   case 4:
		   t1 = 90 + d1 + 1;
		   break;
	   case 5:
		   t1 = 120 + d1 + 1;
		   break;
	   case 6:
		   t1 = 151 + d1 + 1;
		   break;
	   case 7:
		   t1 = 181 + d1 + 1;
		   break;
	   case 8:
		   t1 = 212 + d1 + 1;
		   break;
	   case 9:
		   t1 = 243 + d1 + 1;
		   break;
	   case 10:
		   t1 = 273 + d1 + 1;
		   break;
	   case 11:
		   t1 = 304 + d1 + 1;
		   break;
	   case 12:
		   t1 = 334 + d1 + 1;
		   break;
		   }
	   t1 = 366 - t1;
	   }
	   else
	   {
		   switch (m1)
		   {
	   case 1:
		   t1 = d1;
		   break;
	   case 2:
		   t1 = 31 + d1;
		   break;
	   case 3:
		   t1 = 59 + d1;
		   break;
	   case 4:
		   t1 = 90 + d1;
		   break;
	   case 5:
		   t1 = 120 + d1;
		   break;
	   case 6:
		   t1 = 151 + d1;
		   break;
	   case 7:
		   t1 = 181 + d1;
		   break;
	   case 8:
		   t1 = 212 + d1;
		   break;
	   case 9:
		   t1 = 243 + d1;
		   break;
	   case 10:
		   t1 = 273 + d1;
		   break;
	   case 11:
		   t1 = 304 + d1;
		   break;
	   case 12:
		   t1 = 334 + d1;
		   break;
		   }
	   t1 = 365 - t1;
	   }

	   if ((y2 % 4 == 0) && (y2 % 100 != 0) || (y2 % 400 == 0))
	   {
		   switch (m2)
	   {

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


