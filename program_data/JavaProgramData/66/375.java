package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int p;
		int q;
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
		int i;
		int n = 0;
		p = (y - 1) / 400;
		q = (y - 1) % 400;
		for (i = 1;i <= q;i++)
		{
			if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0))
			{
			n += 366;
			}
			else
			{
			n += 365;
			}
		}


		for (i = 1;i < m;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				n += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				n += 30;
			}
			else if (i == 2)
			{
				if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))
				{
					n += 29;
				}
				else
				{
					n += 28;
				}
			}
		}
		n += d;
		int x;
		x = n % 7;
		if (x == 1)
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
		else
		{
			System.out.print("Sun.");
		}
		return 0;
	}


}

