package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int y;
	  int m;
	  int d;
	  int sum = 0;
	  int i;
	  int x;
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
		y = y % 400 + 400;
		for (i = 1;i < y;i++)
		{
			if (i % 4 == 0 && i % 100 != 0)
			{
				sum += 2;
			}
			else if (i % 100 == 0 && i % 400 == 0)
			{
				sum += 2;
			}
			else
			{
				sum += 1;
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
			else if (y % 4 == 0 && y % 100 != 0 && i == 2)
			{
				sum += 1;
			}
			else if (y % 100 == 0 && y % 400 == 0 && i == 2)
			{
				sum += 1;
			}
			else
			{
				sum += 0;
			}
		}
		sum += d;
		x = sum % 7;
		switch (x)
		{
			case 1:
			System.out.print("Mon.\n");
			break;
			case 2:
			System.out.print("Tue.\n");
			break;
			case 3:
			System.out.print("Wed.\n");
			break;
			case 4:
			System.out.print("Thu.\n");
			break;
			case 5:
			System.out.print("Fri.\n");
			break;
			case 6:
			System.out.print("Sat.\n");
			break;
			case 0:
			System.out.print("Sun.\n");
			break;
		}
	}


}

