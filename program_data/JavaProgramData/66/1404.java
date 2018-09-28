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
		int j;
		int zong = 0;
		int xingqi;
		int i;
		for (i = 1;i < month;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				zong += 31;
			}
			if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				zong += 30;
			}
			if (i == 2)
			{
				if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
				{
					zong += 29;
				}
				else
				{
					zong += 28;
				}
			}
		}
		zong = zong + day;
		zong += (year - 1) + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		xingqi = zong % 7;
		if (xingqi == 1)
		{
			System.out.print("Mon.");
		}
		if (xingqi == 2)
		{
			System.out.print("Tue.");
		}
		if (xingqi == 3)
		{
			System.out.print("Wed.");
		}
		if (xingqi == 4)
		{
			System.out.print("Thu.");
		}
		if (xingqi == 5)
		{
			System.out.print("Fri.");
		}
		if (xingqi == 6)
		{
			System.out.print("Sat.");
		}
		if (xingqi == 0)
		{
			System.out.print("Sun.");
		}
		return 0;
	}
}

