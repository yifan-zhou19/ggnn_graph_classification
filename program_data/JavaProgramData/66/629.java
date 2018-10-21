package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int year;
		int y;
		int mon;
		int w;
		int date;
		int day;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			mon = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			date = Integer.parseInt(tempVar3);
		}
		y = year - 1;
		day = y + (y / 400) * 97;
		y = y % 400;
		day += (y / 100) * 24;
		y = y % 100;
		day += (y / 4);
		if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0)))
		{
			t = 29;
		}
		else
		{
			t = 28;
		}
		switch (mon)
		{
		case 12:
			day += 30;
		case 11:
			day += 31;
		case 10:
			day += 30;
		case 9:
			day += 31;
		case 8:
			day += 31;
		case 7:
			day += 30;
		case 6:
			day += 31;
		case 5:
			day += 30;
		case 4:
			day += 31;
		case 3:
			day += t;
		case 2:
			day += 31;
		default:
			day += 0;

		}
		day += date;
		w = day % 7;
		switch (w)
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
				System.out.print("Wes.");
				break;
			case 4:
				System.out.print("Thu.");
				break;
			case 5:
				System.out.print("Fri.");
				break;
			default:
				System.out.print("Sat.");

		}


	}
}

