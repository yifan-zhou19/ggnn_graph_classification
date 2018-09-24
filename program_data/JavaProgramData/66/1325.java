package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int y;
		int d;
		int num4;
		int num100;
		int x;
		int[] a = {0, 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
		int[] b = {0, 0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335};
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
		y = year % 400;
		if (y == 0)
		{
			y = 400;
		}
		num4 = (y - 1) / 4;
		num100 = (y - 1) / 100;
		if (num100 == 4)
		{
			num100 = 3;
		}
		d = (y - 1) * 365 + num4 - num100;
		if (y % 4 != 0)
		{
			d = d + a[month] + day;
		}
		if (y % 4 == 0)
		{
			d = d + b[month] + day;
		}
		x = d % 7;
		if (x == 0)
		{
			System.out.print("Sun.\n");
		}
		if (x == 1)
		{
			System.out.print("Mon.\n");
		}
		if (x == 2)
		{
			System.out.print("Tue.\n");
		}
		if (x == 3)
		{
			System.out.print("Wed.\n");
		}
		if (x == 4)
		{
			System.out.print("Thu.\n");
		}
		if (x == 5)
		{
			System.out.print("Fri.\n");
		}
		if (x == 6)
		{
			System.out.print("Sat.\n");
		}
		return 0;
	}



}

