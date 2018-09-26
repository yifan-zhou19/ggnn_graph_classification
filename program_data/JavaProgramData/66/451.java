package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int a = 0;
		int i;
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
		if (y > 2800)
		{
			y = y - (y / 2800) * 2800;
		}
		for (i = 1;i < y;i++)
		{
			if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0))
			{
				a += 2;
			}
			else
			{
				a += 1;
			}
		}
		for (i = 1;i < m;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				a += 3;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				a += 2;
			}
			else if (i == 2)
			{
				if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))
				{
					a += 1;
				}
				else
				{
					a += 0;
				}
			}
		}
		a += d;
		if (a % 7 == 1)
		{
			System.out.print("Mon.\n");
		}
		else if (a % 7 == 2)
		{
			System.out.print("Tue.\n");
		}
		else if (a % 7 == 3)
		{
			System.out.print("Wed.\n");
		}
		else if (a % 7 == 4)
		{
			System.out.print("Thu.\n");
		}
		else if (a % 7 == 5)
		{
			System.out.print("Fri.\n");
		}
		else if (a % 7 == 6)
		{
			System.out.print("Sat.\n");
		}
		else if (a % 7 == 0)
		{
			System.out.print("Sun.\n");
		}
		return 0;
	}
}

