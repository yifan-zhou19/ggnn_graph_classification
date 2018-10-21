package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int mon;
		int day;
		int i;
		int x = 0;
		int y = 0;
		int z = 0;
		int sum;
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
		x = (year - 1) + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		for (i = 1;i < mon;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				y += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 10)
			{
				y += 30;
			}
			else
			{
				if (year % 400 == 0 || ((year % 4 == 0) && (year % 100 != 0)))
				{
					y += 29;
				}
				else
				{
					y += 28;
				}
			}
		}
		z = day;
		sum = x + y + z;
		int ys = sum % 7;
		if (ys == 1)
		{
			System.out.print("Mon.");
		}
		else if (ys == 2)
		{
			System.out.print("Tue.");
		}
		else if (ys == 3)
		{
			System.out.print("Wed.");
		}
		else if (ys == 4)
		{
			System.out.print("Thu.");
		}
		else if (ys == 5)
		{
			System.out.print("Fri.");
		}
		else if (ys == 6)
		{
			System.out.print("Sat.");
		}
		else
		{
			System.out.print("Sun.");
		}


		return 0;
	}






}

