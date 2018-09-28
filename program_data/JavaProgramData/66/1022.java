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
		int year;
		int month;
		int day;
		int daytal = 0;
		int day1;
		int i;
		int weekday;
		int r;
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
		r = (year - 1) / 4 + (year - 1) / 400 - (year - 1) / 100;

			daytal = daytal + ((year - 1) % 7) * (365 % 7);
		daytal = daytal + r;
		if (year % 400 == 0 || ((year % 100 != 0) && (year % 4 == 0)))
		{
			switch (month)
			{
			case 1:
				day1 = 0;
				break;
			case 2:
				day1 = 31;
				break;
			case 3:
				day1 = 60;
				break;
			case 4:
				day1 = 91;
				break;
			case 5:
				day1 = 121;
				break;
			case 6:
				day1 = 152;
				break;
			case 7:
				day1 = 182;
				break;
			case 8:
				day1 = 213;
				break;
			case 9:
				day1 = 244;
				break;
			case 10:
				day1 = 274;
				break;
			case 11:
				day1 = 305;
				break;
			case 12:
				day1 = 335;
				break;
			}
			day1 = day1 + day;
			daytal = daytal + day1;
			weekday = daytal % 7;
			switch (weekday)
			{
			case 0:
				System.out.print("Sun.\n");
				break;
			case 1:
				System.out.print("Mon.\n");
				break;
			case 2:
				System.out.print("Tue.\n");
				break;
			case 3:
				System.out.print("Wed.\n");
				break;
			case 4:
				System.out.print("Thu.\n");
				break;
			case 5:
				System.out.print("Fri.");
				break;
			case 6:
				System.out.print("Sat.\n");
				break;
			}
		}
		else
		{
			switch (month)
			{
			case 1:
				day1 = 0;
				break;
			case 2:
				day1 = 31;
				break;
			case 3:
				day1 = 59;
				break;
			case 4:
				day1 = 90;
				break;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


