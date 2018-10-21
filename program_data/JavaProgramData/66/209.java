package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
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
		int i;
		int m = 0;

		year = year % 400 + 400;

		m = year - 1;
		for (i = 1;i < year;i++)
		{
			if (i % 400 == 0 || i % 4 == 0 && i % 100 != 0)
			{
				m++;
			}
		}

		int days;
		switch (month)
		{
		case 1:
			days = day;
			break;
		case 2:
			days = 31 + day;
			break;
		case 3:
			days = 31 + 28 + day;
			break;
		case 4:
			days = 31 + 28 + 31 + day;
			break;
		case 5:
			days = 31 + 28 + 31 + 30 + day;
			break;
		case 6:
			days = 31 + 28 + 31 + 30 + 31 + day;
			break;
		case 7:
			days = 31 + 28 + 31 + 30 + 31 + 30 + day;
			break;
		case 8:
			days = 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
			break;
		case 9:
			days = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day;
			break;
		case 10:
			days = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
			break;
		case 11:
			days = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
			break;
		case 12:
			days = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
			break;

		}
		if ((year % 400 == 0 || year % 4 == 0 && year % 100 != 0) && (month > 2))
		{
			days += 1;
		}
		m += days % 7;
		m = m % 7;
		String s = new String(new char[5]);
		switch (m)
		{
		case 1:
			s = "Mon.";
			break;
		case 2:
			s = "Tue.";
			break;
		case 3:
			s = "Wed.";
			break;
		case 4:
			s = "Thu.";
			break;
		case 5:
			s = "Fri.";
			break;
		case 6:
			s = "Sat.";
			break;
		case 0:
			s = "Sun.";
			break;
		}
		System.out.printf("%s",s);


		return 0;
	}

}

