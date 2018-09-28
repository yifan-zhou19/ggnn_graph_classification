package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int year;
		int mon;
		int day;
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
			day = Integer.parseInt(tempVar3);
		}
		year = year % 2800;
		int x = 0;
		int i;
		if (year == 1)
		{
			x = 0;
		}
		if (year > 1)
		{
			for (i = 1;i < year;i++)
			{
				if ((i % 400 == 0) || ((i % 4 == 0) && (i % 100 != 0)))
				{
					x += 366;
				}
				else
				{
					x += 365;
				}
			}
		}
		if (year == 0)
		{
			x = 2800 * 365 + 700 - 21 - 366;
		}
		for (i = 1;i < mon;i++)
		{
			x += days[i];
			if (((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) && (i == 2))
			{
				x++;
			}
		}
		x += day;
		switch (x % 7)
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
		return 0;
	}



}

