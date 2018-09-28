//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static int year(int y)
	{
		if ((y % 100 != 0 && y % 4 == 0) || y % 400 == 0)
		{
			return 2;
		}
		else
		{
			return 1;
		}
	}

	public static int day(int y,int m,int d)
	{
		int days = d;
		if ((y % 100 != 0 && y % 4 == 0) || y % 400 == 0)
		{
			switch (m)
			{
			case 1:
				days += 0;
				break;
			case 2:
				days += 31;
				break;
			case 3:
				days += 60;
				break;
			case 4:
				days += 91;
				break;
			case 5:
				days += 121;
				break;
			case 6:
				days += 152;
				break;
			case 7:
				days += 182;
				break;
			case 8:
				days += 213;
				break;
			case 9:
				days += 244;
				break;
			case 10:
				days += 274;
				break;
			case 11:
				days += 305;
				break;
			case 12:
				days += 335;
				break;
			}
		}
		else
		{
			switch (m)
			{
			case 1:
				days += 0;
				break;
			case 2:
				days += 31;
				break;
			case 3:
				days += 59;
				break;
			case 4:
				days += 90;
				break;
			case 5:
				days += 120;
				break;
			case 6:
				days += 151;
				break;
			case 7:
				days += 181;
				break;
			case 8:
				days += 212;
				break;
			case 9:
				days += 243;
				break;
			case 10:
				days += 273;
				break;
			case 11:
				days += 304;
				break;
			case 12:
				days += 334;
				break;
			}
		}
		return days;
	}

	public static int Main()
	{
	  int y;
	  int m;
	  int d;
	  int i;
	  int s = 0;
	  y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  if (y > 100000)
	  {
		  y = y % 400;
	  }
	  for (i = 1;i < y;i++)
	  {
		  s += year(i);
	  }
	  s = s + day(y, m, d) - 1;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


