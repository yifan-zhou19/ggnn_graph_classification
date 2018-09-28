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
		int day = new int(int,int);
		int sy;
		int sm;
		int sd;
		int ey;
		int em;
		int ed;
		int d = 0;
		int d1;
		int d2;
		sy = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sd = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ey = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		em = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ed = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int run = 0;
		for (i = sy;i < ey;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
			run = run + 1;
			}
		}
		d = 365 * (ey - sy - run) + 366 * run;
		d = d - day(sy, sm) + day(ey, em) - sd + ed;
		System.out.print(d);
		return 0;
	}
	public static int day(int year,int month)
	{
		int a;
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
		switch (month)
		{
		case 1:
			a = 0;
			break;
		case 2:
			a = 31;
			break;
		case 3:
			a = 60;
			break;
		case 4:
			a = 91;
			break;
		case 5:
			a = 121;
			break;
		case 6:
			a = 152;
			break;
		case 7:
			a = 182;
			break;
		case 8:
			a = 213;
			break;
		case 9:
			a = 244;
			break;
		case 10:
			a = 274;
			break;
		case 11:
			a = 305;
			break;
		case 12:
			a = 335;
			break;
		}
		}
		else
		{
			switch (month)
			{
				case 1:
					a = 0;
					break;
				case 2:
					a = 31;
					break;
				case 3:
					a = 59;
					break;
				case 4:
					a = 90;
					break;
				case 5:
					a = 120;
					break;
				case 6:
					a = 151;
					break;
				case 7:
					a = 181;
					break;
				case 8:
					a = 212;
					break;
				case 9:
					a = 243;
					break;
				case 10:
					a = 273;
					break;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


