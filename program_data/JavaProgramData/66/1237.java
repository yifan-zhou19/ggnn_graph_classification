package <missing>;

public class GlobalMembers
{
	public static int rn(int y)
	{
		int r;
		r = 0;
		if (y % 400 == 0 || (y % 100 != 0 && y % 4 == 0))
		{
			r = 1;
		}
		return r;
	}

	public static int Main()
	{
		int ye;
		int mon;
		int day;
		int d;
		int i;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ye = Integer.parseInt(tempVar);
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
		d = day;
		for (i = 1;i < mon;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
			{
				d = d + 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				d = d + 30;
			}
			else if (i == 2)
			{
				if (rn(ye) == 1)
				{
					d = d + 29;
				}
				else
				{
					d = d + 28;
				}
			}
		}
		d += 365 * (ye-1) + (ye-1) / 4 - (ye-1) / 100 + (ye-1) / 400 - (ye-1) / 4000;
		if (ye > 4000)
		{
			d++;
		}
		x = d % 7;
		if (x == 0)
		{
			System.out.print("Sun.");
		}
		else if (x == 1)
		{
			System.out.print("Mon.");
		}
		else if (x == 2)
		{
			System.out.print("Tue.");
		}
		else if (x == 3)
		{
			System.out.print("Wed.");
		}
		else if (x == 4)
		{
			System.out.print("Thu.");
		}
		else if (x == 5)
		{
			System.out.print("Fri.");
		}
		else if (x == 6)
		{
			System.out.print("Sat.");
		}


		return 0;
	}
}

