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
		int startYear;
		int startMonth;
		int startDay;
		int endYear;
		int endMonth;
		int endDay;
		int i;
		int j;
		int a;
		int b;
		int c = 0;
		int d;
		int m;
		int n;
		int x;
		int y;
		int sum;
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
		a = endYear - startYear;
		sum = 365 * a;
		for (b = startYear;b < endYear;b++)
		{
		  if ((b % 4 == 0 && b % 100 != 0) || (b % 400 == 0))
		  {
		c++;
		  }
		}
		sum = sum + c;
		if ((startYear % 4 == 0 && startYear % 100 != 0) || (startYear % 400 == 0))
		{
		   m = 29;
		   if (startMonth == 1)
		   {
			   x = startDay;
		   }
		   if (startMonth == 2)
		   {
			   x = 31 + startDay;
		   }
		if (startMonth == 3)
		{
			x = 31 + m + startDay;
		}
		if (startMonth == 4)
		{
			x = 31 + m + 31 + startDay;
		}
		if (startMonth == 5)
		{
			x = 31 + m + 31 + 30 + startDay;
		}
		if (startMonth == 6)
		{
			x = 31 + m + 31 + 30 + 31 + startDay;
		}
		if (startMonth == 7)
		{
			x = 31 + m + 31 + 30 + 31 + 30 + startDay;
		}
		if (startMonth == 8)
		{
			x = 31 + m + 31 + 30 + 31 + 30 + 31 + startDay;
		}
		if (startMonth == 9)
		{
			x = 31 + m + 31 + 30 + 31 + 62 + 30 + startDay;
		}
		if (startMonth == 10)
		{
			x = 31 + m + 31 + 30 + 31 + 62 + 30 + 30 + startDay;
		}
		if (startMonth == 11)
		{
			x = 31 + m + 31 + 30 + 31 + 62 + 61 + 30 + startDay;
		}
		if (startMonth == 12)
		{
			x = 31 + m + 31 + 30 + 31 + 62 + 61 + 30 + 30 + startDay;
		}
		}
		else
		{
			 m = 28;
			 if (startMonth == 1)
			 {
				 x = startDay;
			 }
			 if (startMonth == 2)
			 {
				 x = 31 + startDay;
			 }
		if (startMonth == 3)
		{
			x = 31 + m + startDay;
		}
		if (startMonth == 4)
		{
			x = 31 + m + 31 + startDay;
		}
		if (startMonth == 5)
		{
			x = 31 + m + 31 + 30 + startDay;
		}
		if (startMonth == 6)
		{
			x = 31 + m + 31 + 30 + 31 + startDay;
		}
		if (startMonth == 7)
		{
			x = 31 + m + 31 + 30 + 31 + 30 + startDay;
		}
		if (startMonth == 8)
		{
			x = 31 + m + 31 + 30 + 31 + 30 + 31 + startDay;
		}
		if (startMonth == 9)
		{
			x = 31 + m + 31 + 30 + 31 + 62 + 30 + startDay;
		}
		if (startMonth == 10)
		{
			x = 31 + m + 31 + 30 + 31 + 62 + 30 + 30 + startDay;
		}
		if (startMonth == 11)
		{
			x = 31 + m + 31 + 30 + 31 + 62 + 61 + 30 + startDay;
		}
		if (startMonth == 12)
		{
			x = 31 + m + 31 + 30 + 31 + 62 + 61 + 30 + 30 + startDay;
		}
		}
		sum = sum - x;
		if ((endYear % 4 == 0 && endYear % 100 != 0) || (endYear % 400 == 0))
	   {
		   m = 29;
		   if (endMonth == 1)
		   {

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


