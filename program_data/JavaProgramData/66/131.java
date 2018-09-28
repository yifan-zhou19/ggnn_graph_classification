package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int leapnum;
		short month;
		short day;
		short mod;
		char now;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month = Short.parseShort(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day = Short.parseShort(tempVar3);
		}
		now = (year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)?'T':'F';
		leapnum = year / 4 - year / 100 + year / 400;
		if (now == 'T')
		{
			leapnum--;
		}
		leapnum %= 7;
		mod = (year - 1) % 7;
		mod += leapnum;
		switch (month)
		{
		case 12:
			mod += 30;
		case 11:
			mod += 31;
		case 10:
			mod += 30;
		case 9:
			mod += 31;
		case 8:
			mod += 31;
		case 7:
			mod += 30;
		case 6:
			mod += 31;
		case 5:
			mod += 30;
		case 4:
			mod += 31;
		case 3:
			mod += 28;
		case 2:
			mod += 31;
		case 1:
			;
		}
		if (now == 'T' && month > 2)
		{
			mod++;
		}
		mod += day;
		switch (mod % 7)
		{
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
			System.out.print("Fri.\n");
			break;
		case 6:
			System.out.print("Sat.\n");
			break;
		case 0:
			System.out.print("Sun.\n");
		}
		return (0);
	}




}

