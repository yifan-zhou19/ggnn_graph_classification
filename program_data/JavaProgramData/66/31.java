package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int xingqi;
		int k;
		int a;
		int b;
		int c;
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
		int[] d = {0, 31, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};

		k = month;
		if (year == 1)
		{
			for (;month > 1;month--)
			{
				day += d[month];
			}
			day = day % 7;
		}
		else
		{
			for (;month > 1;month--)
			{
				day += d[month];
			}
			day += year % 7 - 1;
			day = day % 7;
			if (k < 3)
			{
				year--;
			}
			a = year / 4;
			b = year / 100;
			c = year / 400;

			day = day + a + c - b;


			day = day % 7;

		}

		xingqi = day;
		switch (xingqi)
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

