//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static int d(int day1)
	{
		day1 = day1 % 7;
		if (day1 == 0)
		{
			day1 = 7;
		}
		return (day1);
	}

	public static int firstday(int year)
	{
		int m;
		int n;
		int y;
		int x;
		if ((year % 400) == 0)
		{
			x = 6;
		}
		else
		{
			year = year % 400;
			m = year % 100;
			m = (year - m) / 100;
			if ((year % 100) == 0)
			{
				x = d((5 * m));
			}
			else
			{
				year = year % 100;
				y = year % 4;
				n = (year - y) / 4;
				if (y == 0)
				{
					x = d((m + n) * 5 - 1);
				}
				else
				{
					x = d((m + n) * 5 + y);
				}
			}
		}
		return (x);
	}

	public static int weekday(int x,int month,int day)
	{
		int j;
		j = day % 7;
		if (month == 1)
		{
			x = d(x + 2);
			x = d(x + j - 1);
		}
		else if (month == 2)
		{
			x = d(x + 3);
			x = d(x + j - 1);
		}
		else if (month == 3)
		{
			x = d(x + 3);
			x = d(x + j - 1);
		}
		else if (month == 4)
		{
			x = d(x + 6);
			x = d(x + j - 1);
		}
		else if (month == 5)
		{
			x = d(x + 1);
			x = d(x + j - 1);
		}
		else if (month == 6)
		{
			x = d(x + 4);
			x = d(x + j - 1);
		}
		else if (month == 7)
		{
			x = d(x + 6);
			x = d(x + j - 1);
		}
		else if (month == 8)
		{
			x = d(x + 2);
			x = d(x + j - 1);
		}
		else if (month == 9)
		{
			x = d(x + 5);
			x = d(x + j - 1);
		}
		else if (month == 10)
		{
			x = x;
			x = d(x + j - 1);
		}
		else if (month == 11)
		{
			x = d(x + 3);
			x = d(x + j - 1);
		}
		else
		{
			x = d(x + 5);
			x = d(x + j - 1);
		}
		return (x);
	}

	public static void Main()
	{
		char[] c = {0, '\0', '\0', '\0'};
		int t;
		int w;
		int year;
		int month;
		int day;
		int x;
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
		if ((year % 400) == 0)
		{
			t = 0;
		}
		else if ((year % 100) == 0)
		{
			t = 0;
		}
		else if ((year % 4) == 0)
		{
			t = 1;
		}
		else
		{
			t = 0;
		}
		x = firstday(year);
		x = x + t;
		w = weekday(x, month, day);
		if (w == 1)
		{
			c = "Mon".toCharArray();
		}
		else if (w == 2)
		{

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


