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
		int y1;
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		int i;
		int j;
		int sum = 0;
		int k;
		int m;
		int year;
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (y1 < y2)
		{
			for (i = y1 + 1;i < y2;i++)
			{
				if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
				{
					sum += 366;
				}
				else
				{
					sum += 365;
				}
			}
			year = y1;
			for (i = m1 + 1;i <= 12;i++)
			{
				switch (i)
				{
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						m = 31;
						break;
					case 2:
						if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
						{
								 m = 29;
						}
							 else
							 {
								 m = 28;
							 }
							 break;
					case 4:
					case 6:
					case 9:
					case 11:
						m = 30;
						break;
				}
				sum += m;
			}
			switch (m1)
			{
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					m = 31;
					break;
				case 2:
					if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
					{
								m = 29;
					}
							else
							{
								m = 28;
							}
							break;
				case 4:
				case 6:
				case 9:
				case 11:
					m = 30;
					break;
			}
			sum += m - d1;
			year = y2;
			for (i = 1;i < m2;i++)
			{
				switch (i)
				{
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						m = 31;
						break;
					case 2:
						if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
						{
								 m = 29;
						}
							 else
							 {
								 m = 28;
							 }
							 break;
					case 4:
					case 6:
					case 9:
					case 11:
						m = 30;
						break;
				}
				sum += m;
			}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


