package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int year = 0;
		int month = 0;
		int j;
		int days;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		if (a / 4 == 0)
		{
			year = a - 1;
		}
		else if (a / 4 != 0 && a / 100 == 0)
		{
			year = a + a / 4;
			if (a % 4 == 0)
			{
				year--;
			}
		}
		else if (a / 100 != 0 && a / 400 == 0)
		{
			year = a + a / 4 - a / 100;
			if (a % 4 == 0)
			{
				year--;
			}
		}
		else if (a / 400 != 0)
		{
			year = a + a / 4 - a / 100 + a / 400 - 1;
		}
		{
			if (a % 4 == 0)
			{
				year--;
			}

	}

		for (j = 1;j < b;j++)
		{
			if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
			{
				month += 31;
			}
			else if (j == 4 || j == 6 || j == 9 || j == 11)
			{
				month += 30;
			}
			else
			{
				if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
				{
					month += 29;
				}
				else
				{
					month += 28;
				}
			}
		}
		days = year + month + c;
		if (days % 7 == 0)
		{
			System.out.print("Sun.");
		}
		if (days % 7 == 1)
		{
			System.out.print("Mon.");
		}
		if (days % 7 == 2)
		{
			System.out.print("Tue.");
		}
		if (days % 7 == 3)
		{
			System.out.print("Wed.");
		}
		if (days % 7 == 4)
		{
			System.out.print("Thu.");
		}
		if (days % 7 == 5)
		{
			System.out.print("Fri.");
		}
		if (days % 7 == 6)
		{
			System.out.print("Sat.");
		}
		return 0;
	}

}

