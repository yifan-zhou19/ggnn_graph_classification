//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	/*
	 *
	 * ????
	 * ???2011-01-09
	 * ?????? 1000012774
	 * ???
	 */

	public static int judge(int year)
	{
		int i;
		int j;
		int t;
		if (year % 4 != 0)
		{
			return 0;
		}
		else
		{
			if (year % 100 == 0)
			{
				if (year % 400 == 0)
				{
					return 1;
				}
				else
				{
					return 0;
				}
			}
			else
			{
				return 1;
			}
		}
	}

	public static int Main()
	{
		int y1;
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		int day = 0;
		int temp;
		int[] a = new int[14];
		int i;
		int j;
		int k;
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[1] = 31;
		a[2] = 28;
		a[3] = 31;
		a[4] = 30;
		a[5] = 31;
		a[6] = 30;
		a[7] = 31;
		a[8] = 31;
		a[9] = 30;
		a[10] = 31;
		a[11] = 30;
		a[12] = 31;
		if ((y2 - y1) > 1)
		{
			for (i = y1 + 1;i < y2;i++)
			{
				if (judge(i) != 0)
				{
					day = day + 366;
				}
				else
				{
					day = day + 365;
				}
			}
		}
		if ((y2 - y1) != 0)
		{
		if (judge(y1) != 0)
		{
			a[2] = 29;
			if (m1 != 12)
			{
			for (i = m1 + 1;i <= 12;i++)
			{
				day = day + a[i];
			}
			}
			day = day + a[m1] - d1;
		}
		a[2] = 28;
		if (judge(y1) == 0)
		{
			if (m1 != 12)
			{
				for (i = m1 + 1;i <= 12;i++)
				{
				day = day + a[i];
				}
			}
			day = day + a[m1] - d1;
		}
		if (judge(y2) != 0)
		{
			a[2] = 29;
			temp = 0;
					if (m2 != 1)
					{
					for (i = 1;i < m2;i++)
					{
						day = day + a[i];
					}
					day = day + d2;
					}
					else
					{
						day = day + d2;
					}
		}
		a[2] = 28;
		if (judge(y2) == 0)
		{
						if (m2 != 1)
						{
						for (i = 1;i < m2;i++)
						{
							day = day + a[i];
						}
						day = day + d2;
						}
						else
						{
							day = day + d2;
						}
		}
		}
		a[2] = 28;
		if (y2 - y1 == 0)
		{
			if (judge(y1) == 0)
			{
				if ((m2 - m1) != 0)
				{
					for (i = m1 + 1;i < m2;i++)
					{
						day = day + a[i];
					}
				day = day + a[m1] - d1 + d2;
				}
				else
				{
					day = d2 - d1;
				}
			}
			if (judge(y1) != 0)
			{
				a[2] = 29;
						if ((m2 - m1) != 0)
						{
							for (i = m1 + 1;i < m2;i++)
							{
								day = day + a[i];
							}
						day = day + a[m1] - d1 + d2;
						}
						else
						{
							day = d2 - d1;
						}
			}
		}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


