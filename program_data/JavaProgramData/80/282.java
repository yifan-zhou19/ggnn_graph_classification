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
		int year1;
		int year2;
		int mon1;
		int mon2;
		int date1;
		int date2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			mon1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			date1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			year2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			mon2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			date2 = Integer.parseInt(tempVar6);
		}
		int[] y = new int[3000];
		int n;
		int i;
		n = year2 - year1;
		y[0] = year1;
		for (i = 0;i <= n;i++)
		{
			 if ((y[i] % 4 == 0 && y[i] % 100 != 0) || (y[i] % 400 == 0)) //runnian
			 {
				 y[i + 1] = y[i] + 1;
				 y[i] = 366;
			 }
			 else
			 {
				 y[i + 1] = y[i] + 1;
				 y[i] = 365;
			 }

		}
		int sum = 0;
		if (n >= 2)
		{
			for (i = 1;i < n;i++)
			{
		  sum = sum + y[i];
			}
		}


			   if (mon2 == 1)
			   {
			   if (mon1 == 1)
			   {
				   sum = date2 - 1 + sum + y[0] - date1;
			   }
			   if (mon1 == 2)
			   {
				   sum = date2 - 1 + sum + y[0] - 31 - date1;
			   }

				   if (mon1 == 3)
				   {
					   sum = date2 - 1 + sum + y[0] - 59 - date1;
				   }
				   if (mon1 == 4)
				   {
					   sum = date2 - 1 + sum + y[0] - 89 - date1;
				   }
				   if (mon1 == 5)
				   {
					   sum = date2 - 1 + sum + y[0] - 120 - date1;
				   }
				   if (mon1 == 6)
				   {
					   sum = date2 - 1 + sum + y[0] - 150 - date1;
				   }
				   if (mon1 == 7)
				   {
					   sum = date2 - 1 + sum + y[0] - 181 - date1;
				   }
				   if (mon1 == 8)
				   {
					   sum = date2 - 1 + sum + y[0] - 212 - date1;
				   }
				   if (mon1 == 9)
				   {
					   sum = date2 - 1 + sum + y[0] - 242 - date1;
				   }
				   if (mon1 == 10)
				   {
					   sum = date2 - 1 + sum + y[0] - 273 - date1;
				   }
				   if (mon1 == 11)
				   {
					   sum = date2 - 1 + sum + y[0] - 303 - date1;
				   }
				   if (mon1 == 12)
				   {
					   sum = date2 - 1 + sum + y[0] - 334 - date1;
				   }
				if (y[0] == 366)
				{
					if (mon2 > mon1)
					{
						sum = sum + 1;
					}
				}
			   }
			   if (mon2 == 2)
			   {
				   if (mon1 == 1)
				   {
					   sum = 31 + date2 - 1 + sum + y[0] - date1;
				   }
				   if (mon1 == 2)
				   {
					   sum = 31 + date2 - 1 + sum + y[0] - 31 - date1;
				   }

				   if (mon1 == 3)
				   {
					   sum = 31 + date2 - 1 + sum + y[0] - 59 - date1;
				   }
				   if (mon1 == 4)
				   {
					   sum = 31 + date2 - 1 + sum + y[0] - 89 - date1;
				   }
				   if (mon1 == 5)
				   {
					   sum = 31 + date2 - 1 + sum + y[0] - 120 - date1;
				   }
				   if (mon1 == 6)
				   {
					   sum = 31 + date2 - 1 + sum + y[0] - 150 - date1;
				   }
				   if (mon1 == 7)
				   {
					   sum = 31 + date2 - 1 + sum + y[0] - 181 - date1;
				   }
				   if (mon1 == 8)
				   {
					   sum = 31 + date2 - 1 + sum + y[0] - 212 - date1;
				   }
				   if (mon1 == 9)
				   {
					   sum = 31 + date2 - 1 + sum + y[0] - 242 - date1;
				   }
				   if (mon1 == 10)
				   {
					   sum = 31 + date2 - 1 + sum + y[0] - 273 - date1;
				   }
				   if (mon1 == 11)
				   {
					   sum = 31 + date2 - 1 + sum + y[0] - 303 - date1;
				   }
				   if (mon1 == 12)
				   {
					   sum = 31 + date2 - 1 + sum + y[0] - 334 - date1;
				   }
				  if (y[0] == 366)
				  {
					  if (mon2 > mon1)
					  {
						  sum = sum + 1;
					  }
				  }

			   }
			   if (mon2 == 3)
			   {

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


