package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int date;
		int a;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		y = y % 2800;
		date = 0;
		for (i = 1;i < y;i++)
		{
			if ((i % 400 == 0) || (i % 4 == 0 && i % 100 != 0))
			{
				date += 366;
			}
			else
			{
				date += 365;
			}
		}
		for (k = 1;k < m;k++)
		{
					if ((k == 1) || (k == 3) || (k == 5) || (k == 7) || (k == 8) || (k == 10) || (k == 12))
					{
						date += 31;
					}
					else if ((k == 4) || (k == 6) || (k == 9) || (k == 11))
					{
						date += 30;
					}
					else if (k == 2)
					{
						if ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0))
						{
							date += 29;
						}
						else
						{
							date += 28;
						}
					}
		}
			date += d;
			a = date % 7;
			if (a == 1)
			{
				System.out.print("Mon.");
			}
			else if (a == 2)
			{
				System.out.print("Tue.");
			}
			else if (a == 3)
			{
				System.out.print("Wed.");
			}
			else if (a == 4)
			{
				System.out.print("Thu.");
			}
			else if (a == 5)
			{
				 System.out.print("Fri.");
			}
			else if (a == 6)
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

