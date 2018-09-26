package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int sum = 0;
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
		int m;
		int month;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead("\n");
		if (tempVar4 != null)
		{
			y2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			m2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			d2 = Integer.parseInt(tempVar6);
		}
		for (;y1 < y2;y1++)
		{
			if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
			{
				sum += 366;
			}
			else
			{
				sum += 365;
			}
		}
		if (m1 > m2)
		{
			m1 = m1 - 1;
			for (;m1 >= m2;m1--)
			{
				switch (m1)
				{
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						month = 31;
						break;
					case 4:
					case 6:
					case 9:
					case 11:
						month = 30;
						break;
					case 2:
					{
						if (y2 % 4 == 0 && y2 % 400 != 0 || y2 % 400 == 0)
						{
							month = 28;
						}
						else
						{
							month = 29;
						}
					}
				}
				sum = sum - month;
			}
		}
		else if (m1 < m2)
		{
			for (;m1 < m2;m1++)
			{
				switch (m1)
				{
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						month = 31;
						break;
					case 4:
					case 6:
					case 9:
					case 11:
						month = 30;
						break;
					case 2:
					{
						if ((y2 % 4 == 0 && y2 % 400 != 0) || (y2 % 400 == 0))
						{
							month = 29;
						}
						else
						{
							month = 28;
						}
					}
				}
				sum += month;
			}
		}
		sum = sum + d2 - d1;
		System.out.printf("%d",sum);
	}

}

