package <missing>;

public class GlobalMembers
{
	public static int runnian(int y)
	{
		if ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0))
		{
		return 1;
		}
		return 0;
	}
	public static int Main()
	{
		int i;
		int y2;
		int m2;
		int d2;
		/*?y,m,d??(year,month,date)???,sum???????,p,q?????*/
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y2 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m2 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d2 = Integer.parseInt(tempVar3);
		}
		while (y2 > (7 * 400))
		{
			y2 = y2 % (7 * 400);
		}
		for (i = 1;i < y2;i++)
		{
			if (runnian(i) != 0)
			{
				sum += 366;
			}
			else
			{
				sum += 365;
			}
		}
		for (i = 1;i < m2;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				sum += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				sum += 30;
			}
			else if (i == 2)
			{
				if (runnian(y2) != 0)
				{
					sum += 29;
				}
				else
				{
					sum += 28;
				}
			}
		}
		sum += d2;
		sum -= 1;
		sum = sum % 7;
		switch (sum)
		{
		case 0:
			System.out.print("Mon.");
			break;
		case 1:
			System.out.print("Tue.");
			break;
		case 2:
			System.out.print("Wed.");
			break;
		case 3:
			System.out.print("Thu.");
			break;
		case 4:
			System.out.print("Fri.");
			break;
		case 5:
			System.out.print("Sat.");
			break;
		case 6:
			System.out.print("Sun.");
			break;
		}
		return 0;
	}



}

