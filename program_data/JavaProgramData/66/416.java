package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int c;
		int j;
		int num = 0;
		int day = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		c = y - 1;
		day += c * (365 % 7) + c / 4 - c / 100 + c / 400;
		for (j = 1;j < m;j++)
		{
		switch (j)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day += 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day += 30;
			break;
		case 2:
			if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
			{
				day += 29;
			}

			else
			{
				day += 28;
			}
			break;
		}
		}
		day += d;
			 if (day % 7 == 1)
			 {
				System.out.print("Mon.");
			 }
			if (day % 7 == 2)
			{
				System.out.print("Tue.");
			}
			 if (day % 7 == 3)
			 {
				System.out.print("Wed.");
			 }
			if (day % 7 == 4)
			{
				System.out.print("Thu.");
			}
			if (day % 7 == 5)
			{
				System.out.print("Fri.");
			}
			if (day % 7 == 6)
			{
				System.out.print("Sat.");
			}
			if (day % 7 == 0)
			{
				System.out.print("Sun.");
			}
			return 0;
	}
}

