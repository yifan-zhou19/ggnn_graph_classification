package <missing>;

public class GlobalMembers
{
	public static int day(int m)
	{
		int d = 0;
		switch (m)
		{
		case 12:
			d += 30;
		case 11:
			d += 31;
		case 10:
			d += 30;
		case 9:
			d += 31;
		case 8:
			d += 31;
		case 7:
			d += 30;
		case 6:
			d += 31;
		case 5:
			d += 30;
		case 4:
			d += 31;
		case 3:
			d += 28;
		case 2:
			d += 31;
		}
		return d;
	}
	public static int Main()
	{
		int n;
		int y;
		int m1;
		int m2;
		int d1;
		int d2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m2 = Integer.parseInt(tempVar4);
			}
			d1 = day(m1);
			d2 = day(m2);
			if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
			{
				if (m1 > 2)
				{
					d1++;
				}
				if (m2 > 2)
				{
					d2++;
				}
			}
			if ((d1 - d2) % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
		return 0;
	}


}

