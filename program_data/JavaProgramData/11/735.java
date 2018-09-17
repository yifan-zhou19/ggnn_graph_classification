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
		int leap = int year;
		int cal = new int(int month,int day);
		int call = new int(int month,int day);
		int k;
		int year;
		int month;
		int day;
		int num;
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
		k = leap(year);
		if (k == 0)
		{
			num = cal(month, day);
		}
		if (k == 1)
		{
			num = call(month, day);
		}
		System.out.printf("%d\n",num);
		return 0;
	}

	public static int leap(int year)
	{
		int k;
		if (year % 4 == 0)
		{
			if (year % 100 == 0)
			{
				if (year % 400 == 0)
				{
					k = 1;
				}
				else
				{
					k = 0;
				}
			}
			else
			{
				k = 1;
			}
		}
		else
		{
			k = 0;
		}
		return k;
	}
	public static int cal(int month,int day)
	{
		int k;
		switch (month)
		{
		case 1:
			k = day;
			break;
		case 2:
			k = day + 31;
			break;
		case 3:
			k = day + 31 + 28;
			break;
		case 4:
			k = day + 31 + 28 + 31;
			break;
		case 5:
			k = day + 31 + 28 + 31 + 30;
			break;
		case 6:
			k = day + 31 + 28 + 31 + 30 + 31;
			break;
		case 7:
			k = day + 31 + 28 + 31 + 30 + 31 + 30;
			break;
		case 8:
			k = day + 31 + 28 + 31 + 30 + 31 + 30 + 31;
			break;
		case 9:
			k = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
			break;
		case 10:
			k = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
			break;
		case 11:
			k = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
			break;
		case 12:
			k = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
			break;
		}
		return k;
	}
	public static int call(int month,int day)
	{
		int k;
		switch (month)
		{
		case 1:
			k = day;
			break;
		case 2:
			k = day + 31;
			break;
		case 3:
			k = day + 31 + 29;
			break;
		case 4:
			k = day + 31 + 29 + 31;
			break;
		case 5:
			k = day + 31 + 29 + 31 + 30;
			break;
		case 6:
			k = day + 31 + 29 + 31 + 30 + 31;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


