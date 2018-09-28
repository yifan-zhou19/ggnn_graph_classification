package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int y;
		int m;
		int d;
		int sum = 0;
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
		y = y % 400;
		if (y == 0)
		{
			y = 400;
		}
		for (i = 1;i < y;i++)
		{
			if (i % 4 == 0 && i % 100 != 0 || i == 400)
			{
				sum += 2;
			}
			else
			{
				sum++;
			}
		}
		for (i = 1;i < m;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				sum += 3;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				sum += 2;
			}
			else
			{
				if (y % 4 == 0 && y % 100 != 0 || y == 400)
				{
				   sum++;
				}
			}
		}
		sum += d;
		sum %= 7;
		switch (sum)
		{
		case 0:
			System.out.print("Sun.");
			break;
		case 1:
			System.out.print("Mon.");
			break;
		case 2:
			System.out.print("Tue.");
			break;
		case 3:
			System.out.print("Wen.");
			break;
		case 4:
			System.out.print("Thu");
			break;
		case 5:
			System.out.print("Fri.");
			break;
		case 6:
			System.out.print("Sat.");
			break;
		}
		return 0;
	}
}

