package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int[] mon = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
		int day;
		day = d;
		y = y % 400;
		if (y == 0)
		{
			y = 400;
		}
		int i;
		if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
		{
			if (m > 2)
			{
				day = day + 1;
			}
		}

		for (i = 1; i < y; i++)
		{
			  day = day + 365;
			  if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			  {
					day = day + 1;
			  }
		}

		for (i = 1; i < m; i++)
		{
			 day = day + mon[i];
		}



		switch (day % 7)
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

		return 0;
	}


}

