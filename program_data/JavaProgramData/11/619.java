//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass:
public class AnonymousClass
{
	public int year;
	public int month;
	public int day;
}

package <missing>;

public class GlobalMembers
{
	public static AnonymousClass date = new AnonymousClass();
	public static int Main()
	{
		int days;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			date.year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			date.month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			date.day = Integer.parseInt(tempVar3);
		}
		switch (date.month)
		{
		case 1:
			days = date.day;
			break;
		case 2:
			days = date.day + 31;
			break;
		case 3:
			days = date.day + 59;
			break;
		case 4:
			days = date.day + 90;
			break;
		case 5:
			days = date.day + 120;
			break;
		case 6:
			days = date.day + 151;
			break;
		case 7:
			days = date.day + 181;
			break;
		case 8:
			days = date.day + 212;
			break;
		case 9:
			days = date.day + 243;
			break;
		case 10:
			days = date.day + 273;
			break;
		case 11:
			days = date.day + 304;
			break;
		case 12:
			days = date.day + 334;
			break;
		}
		if ((date.year % 4 == 0 && date.year % 100 != 0 || date.year % 400 == 0) && date.month >= 3)
		{
			days += 1;
		}
		System.out.printf("%d",days);
		return 0;
	}
}

