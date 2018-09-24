package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int m;
		int d;
		int i;
		int x;
		int k;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
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
		 s = (year - 1) * 1 + (year - 1) / 4 + (year - 1) / 400 - (year - 1) / 100;
		for (k = 1;k < m;k++)
		{
				if (k == 1 || k == 3 || k == 5 || k == 7 || k == 8 || k == 10 || k == 12)
				{
					s += 31;
				}
				if (k == 4 || k == 6 || k == 9 || k == 11)
				{
					s += 30;
				}
				if ((k == 2) && (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)))
				{
					s += 29;
				}
				else
				{
					s += 28;
				}

		}
			s += d;
			x = s % 7;
			if (x == 1)
			{
				System.out.print("Mon.");
			}
			if (x == 2)
			{
				System.out.print("Tue.");
			}
			if (x == 3)
			{
				System.out.print("Wed.");
			}
			if (x == 4)
			{
				System.out.print("Thu.");
			}
			if (x == 5)
			{
				System.out.print("Fri.");
			}
			if (x == 6)
			{
				System.out.print("Sat.");
			}
			if (x == 0)
			{
				System.out.print("Sun.");
			}
			return 0;
	}


}

