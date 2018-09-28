package <missing>;

public class GlobalMembers
{
	public static int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
	public static int year;
	public static int month;
	public static int week;
	public static int day;
	public static int d1;
	public static int d2;
	public static int pd(int x)
	{
		if (x % 400 == 0 || (x % 100 != 0 && x % 4 == 0))
		{
		return 1;
		}
	else
	{
		return 0;
	}
	}
	public static int Main()
	{
		int i;
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
		while (year > 1600)
		{
			year -= 1600;
		}
		if (pd(year) != 0)
		{
			a[2]++;
		}
		for (i = 1,d2 = 0;i < year;i++)
		{
			d2 += (pd(i)) != 0? 366:365;
			d2 = d2 % 7;
		}
		for (i = 1,d1 = 0;i < month;i++)
		{
			d1 += a[i];
			d1 = d1 % 7;
		}
		week = (d1 + d2 + day) % 7;
		switch (week)
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
			break;
		}
		System.in.read();
		System.in.read();
		return 0;
	}

}

