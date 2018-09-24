package <missing>;

public class GlobalMembers
{
	public static void printDigit(int z)
	{
		switch (z)
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

	public static void Main()
	{
		int year;
		int month;
		int day;
		int sum;
		int n;
		int x = 0;
		int y;
		int z;
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int isleapyear = int year;
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
		if (year > 4)
		{
		sum = ((year - 1) / 4) - ((year - 1) / 100) + ((year - 1) / 400);
		}
		else
		{
			sum = 0;
		}

		for (n = 1;n < month;n++)
		{
			x += a[n];
		}
		x += day;
		if (month > 2 && isleapyear(year) != 0)
		{
			x = x + 1;
		}
		y = 365 * ((year - 1) % 7) + (sum + x) % 7;
		z = y % 7;
		printDigit(z);
	}
	public static int isleapyear(int year)
	{
		return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));

	}

}

