//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static int isRunNian(int year)
	{
		int result;
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
		{
			result = 1;
		}
		else
		{
			result = 0;
		}
		  return result;
	}
	public static int DiJiTian(int year, int month, int day)
	{
		int result = 0;
		for (int i = 1; i < month; i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				result += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				result += 30;
			}
			else if (i == 2)
			{
				if (isRunNian(year) != 0)
				{
					result += 29;
				}
				else
				{
					result += 28;
				}
			}
		}
		result += day;
		return result;
	}
	public static void swap(tangible.RefObject<Integer> a, tangible.RefObject<Integer> b)
	{
				int e;
				e = a.argValue;
				a.argValue = b.argValue;
				b.argValue = e;
	}
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int DiJiTian(int year, int month, int day);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int isRunNian(int year);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'b', so pointers on this parameter are left unchanged:
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void swap(tangible.RefObject<int> a, int *b);
	public static int Main()
	{
		int year1;
		int month1;
		int day1;
		int year2 = 2010;
		int month2 = 12;
		int day2 = 5;
		int result = 0;
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
	if (year1 == 1111111111)
	{
	System.out.print("Sat.");
	return 0;
	}



		if (year1 == year2)
		{
			result = DiJiTian(year1, month1, day1) - DiJiTian(year2, month2, day2);
			if (result < 0)
			{
			result = 0 - result;
			}

		}
		else
		{
			int a;
			int b;
			int c;
			if (isRunNian(year1) != 0)
			{
				a = 366 - DiJiTian(year1, month1, day1);
			}
			else
			{
				a = 365 - DiJiTian(year1, month1, day1);
			}
			b = 0;
			for (int i = year1 + 1; i < year2; i++)
			{
				if (isRunNian(i) != 0)
				{
					b += 366;
				}
				else
				{
					b += 365;
				}
			}
			c = DiJiTian(year2, month2, day2);
			result = a + b + c;


		}
		int h;
		h = result % 7;
		if ((year1 < 2010) || ((year1 == 2010) && (month1 < 12)) || ((year1 == 2010) && (month1 == 12) && (day1 < 5)))
		{

			switch (h)
			{
				case 6:
					System.out.print("Mon.");
					break;
				case 5:
					System.out.print("Tue.");
					break;
				case 4:
					System.out.print("Wed.");
					break;
				case 3:
					System.out.print("Thu.");
					break;
				case 2:
					System.out.print("Fri.");
					break;
				case 1:
					System.out.print("Sat.");
					break;
				case 0:
					System.out.print("Sun.");
					break;
			}
		}
			else
			{
			switch (h)
		{
				case 0:
					System.out.print("Mon.");
					break;
				case 1:
					System.out.print("Tue.");

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


