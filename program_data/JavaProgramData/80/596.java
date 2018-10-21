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
		int month1;
		int month2;
		int day1;
		int day2;
		int a;
		int b;
		int year;
		int days;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			year2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			month2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			day2 = Integer.parseInt(tempVar6);
		}
		if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0))
		{
			switch (month1)
			{
			case 1:
				a = day1;
				break;
			case 2:
				a = 31 + day1;
				break;
			case 3:
				a = 60 + day1;
				break;
			case 4:
				a = 91 + day1;
				break;
			case 5:
				a = 121 + day1;
				break;
			case 6:
				a = 152 + day1;
				break;
			case 7:
				a = 182 + day1;
				break;
			case 8:
				a = 213 + day1;
				break;
			case 9 :
				a = 244 + day1;
				break;
			case 10:
				a = 274 + day1;
				break;
			case 11:
				a = 305 + day1;
				break;
			case 12:
				a = 335 + day1;
				break;
			}
		}
		else
		{
			switch (month1)
			{
			case 1:
				a = day1;
				break;
			case 2:
				a = 31 + day1;
				break;
			case 3:
				a = 59 + day1;
				break;
			case 4:
				a = 90 + day1;
				break;
			case 5:
				a = 120 + day1;
				break;
			case 6:
				a = 151 + day1;
				break;
			case 7:
				a = 181 + day1;
				break;
			case 8:
				a = 212 + day1;
				break;
			case 9:
				a = 243 + day1;
				break;
			case 10 :

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


