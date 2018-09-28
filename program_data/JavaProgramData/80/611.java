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
		int y;
		int the_number = 0;
		int u;
		int k;
		int s;
		int t;
		int i;
		int h;
		int v;
		int l;
		int p;
		int q;
		int c;
		int w;
		int e;
		int f;
		int z = 0;
		int year1;
		int month1;
		int day1;
		int year2;
		int month2;
		int day2;
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //the number of days of every month
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			month1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			day1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			year2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			month2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			day2 = Integer.parseInt(tempVar6);
		}
		y = year2 - year1;
		if (y == 0) //the dates are in the same year
		{
			if (month2 - month1 == 0)
			{
				the_number = day2 - day1;
			}
			else
			{
				if (month1 > 2 || month2 <= 2)
				{
					for (i = 1;i <= (month2 - month1) - 1;i++)
					{
					   the_number = the_number + month[month1 + i];
					}
					the_number = the_number + month[month1] - day1 + day2;
				}
				else
				{
					for (q = 1;q <= month2 - month1 - 1;q++)
					{
					   the_number = the_number + month[month1 + q];
					}
					the_number = the_number + month[month1] - day1 + day2 + theleapyeardata(year1);
				}
			}
		}
		else //the dates are in differentyears
		{
			if (month1 > 2 && month2 <= 2)
			{
				for (p = 1;p <= y - 2;p++)
				{
					z = z + theleapyeardata(year1 + p);
				}
				for (l = 1;l <= 12 - month1;l++)
				{
					the_number = the_number + month[month1 + l];
				}
				for (w = 1;w <= month2 - 1;w++)
				{
					the_number = the_number + month[w];
				}
				the_number = the_number + month[month1] - day1 + day2 + 365 * (year2 - year1 - 1) + z;
			}
			else
			{
				if (month1 <= 2 && month2>2)
				{
					for (h = 0;h <= y;h++) //the number of leapyears
					{
					   z = z + theleapyeardata(year1 + h);
					}
					for (v = 1;v <= 12 - month1;v++) //the first year without the first month
					{
					   the_number = the_number + month[month1 + v];
					}
					for (c = 1;c <= month2 - 1;c++) //the last year without the last month
					{
						the_number = the_number + month[c];
					}
					the_number = the_number + month[month1] - day1 + day2 + 365 * (year2 - year1 - 1) + z;
				}
				else
				{
					if (month1 <= 2 && month2 <= 2)
					{
						for (s = 1;s <= y;s++)
						{
						   z = z + theleapyeardata(year1 + s - 1);
						}
						for (t = 1;t <= 12 - month1;t++)
						{
							  the_number = the_number + month[month1 + t];
						}
						for (e = 1;e <= month2 - 1;e++)
						{
						   the_number = the_number + month[e];
						}
						the_number = the_number + month[month1] - day1 + day2 + 365 * (year2 - year1 - 1) + z;
					}
					else
					{
						for (u = 1;u <= y;u++)
						{
						   z = z + theleapyeardata(year1 + u);
						}
						for (k = 1;k <= 12 - month1;k++)
						{
						   the_number = the_number + month[month1 + k];
						}
						for (f = 1;f <= month2 - 1;f++)
						{
							the_number = the_number + month[f];
						}
						the_number = the_number + month[month1] - day1 + day2 + 365 * (year2 - year1 - 1) + z;
					}
				}
			}
		}
		System.out.printf("%d\n",the_number);
		return 0;
	}

	public static int theleapyeardata(int year)
	{
		int z;
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			z = 1;
		}
		else
		{

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


