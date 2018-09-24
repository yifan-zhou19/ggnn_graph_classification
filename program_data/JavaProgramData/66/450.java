package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int a;
		int r;
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
		r = (y - 1) + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;
		for (int i = 1;i < m;i++)
		{
			if ((i == 1) || (i == 3) || (i == 5) || (i == 7) || (i == 8) || (i == 10) || (i == 12))
			{
				r += 3;
			}
			if ((i == 4) || (i == 6) || (i == 9) || (i == 11))
			{
				r += 2;
			}
			if (i == 2)
			{
				if ((y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0)))
				{
					r += 1;
				}
			}
		}
		r += d;
		a = r % 7;
		if (a == 0)
		{
			System.out.print("Sun.\n");
		}
		if (a == 1)
		{
			System.out.print("Mon.\n");
		}
		if (a == 2)
		{
			System.out.print("Tue.\n");
		}
		if (a == 3)
		{
			System.out.print("Wed.\n");
		}
		if (a == 4)
		{
			System.out.print("Thu.\n");
		}
		if (a == 5)
		{
			System.out.print("Fri.\n");
		}
		if (a == 6)
		{
			System.out.print("Sat.\n");
		}
		return 0;
	}
}

