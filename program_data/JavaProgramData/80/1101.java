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
		int startYear;
		int startMonth;
		int startDay;
		int endYear;
		int endMonth;
		int endDay;
		int y;
		int a;
		int n;
		int m;
		int b;
		int b2;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			startYear = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			startMonth = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			startDay = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			endYear = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			endMonth = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			endDay = Integer.parseInt(tempVar6);
		}
		y = startYear;
		a = 0;
		while (y <= endYear)
		{
			int f;
			   if ((y % 4 == 0 && y % 100 != 0) || (y % 100 == 0 && y % 400 == 0))
			   {
				   f = 1;
			   }
				else
				{
					f = 0;
				}
			   if (f == 1)
			   {
				   a = a + 1;
			   }
			 y = y + 1;
		}
		if ((startYear % 4 == 0 && startYear % 100 != 0) || (startYear % 100 == 0 && startYear % 400 == 0))
		{
		a = a - 1;
		}
		if ((endYear % 4 == 0 && endYear % 100 != 0) || (endYear % 100 == 0 && endYear % 400 == 0))
		{
		a = a - 1;
		}
		n = a * 366;
		if ((startYear % 4 == 0 && startYear % 100 != 0) || (startYear % 100 == 0 && startYear % 400 == 0))
		{
		 if (startMonth == 1)
		 {
			   b = 0;
		 }
		   else if (startMonth == 2)
		   {
			   b = 31;
		   }
		   else if (startMonth == 3)
		   {
			   b = 60;
		   }
		   else if (startMonth == 4)
		   {
			   b = 91;
		   }
		   else if (startMonth == 5)
		   {
			   b = 121;
		   }
		   else if (startMonth == 6)
		   {
			   b = 152;
		   }
		   else if (startMonth == 7)
		   {
			   b = 182;
		   }
		   else if (startMonth == 8)
		   {
			   b = 213;
		   }
		   else if (startMonth == 9)
		   {
			   b = 244;
		   }
		   else if (startMonth == 10)
		   {
			   b = 274;
		   }
		   else if (startMonth == 11)
		   {
			   b = 305;
		   }
		   else
		   {
			   b = 335;
		   }
		}
		else
		{
		if (startMonth == 1)
		{
			   b = 0;
		}
		   else if (startMonth == 2)
		   {
			   b = 31;
		   }
		   else if (startMonth == 3)
		   {
			   b = 59;
		   }
		   else if (startMonth == 4)
		   {
			   b = 90;
		   }
		   else if (startMonth == 5)
		   {
			   b = 120;
		   }
		   else if (startMonth == 6)
		   {
			   b = 151;
		   }
		   else if (startMonth == 7)
		   {
			   b = 181;
		   }
		   else if (startMonth == 8)
		   {
			   b = 212;
		   }
		   else if (startMonth == 9)
		   {
			   b = 243;
		   }
		   else if (startMonth == 10)
		   {
			   b = 273;
		   }
		   else if (startMonth == 11)
		   {
			   b = 304;
		   }
		   else
		   {
			   b = 334;
		   }

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


