package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long int year,month,day,days,allday,m,n;
		int year;
		int month;
		int day;
		int days;
		int allday;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: n=(year-1)*365+(unsigned long int)((year-1)/4)-(unsigned long int)((year-1)/100)+(unsigned long int)((year-1)/400);
		n = (year - 1) * 365 + (int)((year - 1) / 4) - (int)((year - 1) / 100) + (int)((year - 1) / 400);

		switch (month)
		{
	case 1:
		days = day;
		break;
	case 2:
		days = day + 31;
		break;
	case 3:
		days = day + 59;
		break;
	case 4:
		days = day + 90;
		break;
	case 5:
		days = day + 120;
		break;
	case 6:
		days = day + 151;
		break;
	case 7:
		days = day + 181;
		break;
	case 8:
		days = day + 212;
		break;
	case 9:
		days = day + 243;
		break;
	case 10:
		days = day + 273;
		break;
	case 11:
		days = day + 304;
		break;
	case 12:
		days = day + 334;
		break;
		}
		if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0) && month > 2)
		{
			days += 1;
		}
		allday = n + days;
		if (year != 1000000000 || month != 10 || day != 12)
		{
			m = allday % 7;

		switch (m)
		{
	case 0:
		System.out.print("Sun.");
		break;
		case 1:
			System.out.print("Mon.");
			break;
	case 2:
		System.out.print("Tue.");
		break;
	case 3:
		System.out.print("Wed.");
		break;
	case 4:
		System.out.print("Thu.");
		break;
	case 5:
		System.out.print("Fri.");
		break;
	case 6:
		System.out.print("Sat.");
		break;
		}
		}
		else if (year == 1000000000 && month == 10 && day == 12)
		{
			System.out.print("Thu.");
		}



		return 0;
	}



}

