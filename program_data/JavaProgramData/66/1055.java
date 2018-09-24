package <missing>;

public class GlobalMembers
{
	public static int isrunnian(int m)
	{
		if (m % 4 == 0 && m % 100 != 0 || m % 400 == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int dijitian(int a, int b, int c)
	{
		int days = 0;
		for (int i = 1;i < b;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				days += 31;
			}
			if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				days += 30;
			}
			if (i == 2)
			{
				if (isrunnian(a) != 0)
				{
					days += 29;
				}
				else
				{
					days += 28;
				}
			}
		}
		days += c;
		return days % 7;
	}
	public static int Main()
	{
		int x;
		int y;
		int z;
		int k;
		int p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			z = Integer.parseInt(tempVar3);
		}
		p = x + dijitian(x, y, z) + (x - 1) / 4 - (x - 1) / 100 + (x - 1) / 400 - 1;
		if (p % 7 == 1)
		{
			System.out.print("Mon.");
		}
		if (p % 7 == 2)
		{
			System.out.print("Tue.");
		}
		if (p % 7 == 3)
		{
			System.out.print("Wed.");
		}
		if (p % 7 == 4)
		{
			System.out.print("Thu.");
		}
		if (p % 7 == 5)
		{
			System.out.print("Fri.");
		}
		if (p % 7 == 6)
		{
			System.out.print("Sat.");
		}
		if (p % 7 == 0)
		{
			System.out.print("Sun.");
		}
		return 0;
	}
}

