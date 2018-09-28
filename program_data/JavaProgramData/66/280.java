package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l2;
		int m;
		int k;
		int y;
		int mon;
		int day;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			mon = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		m = 0;
		while (y > 40002)
		{
				y -= 40000;
				m += 14609700;
				m %= 7;
		}
		while (y >= 402)
		{
				y -= 400;
				m += 146097;
				m %= 7;
		}
				while (!((y == 1) && (mon == 1) && (day == 1)))
				{
						m++;
						m %= 7;
						day--;
						if (day == 0)
						{
								mon--;
								if (mon == 0)
								{
										mon = 12;
										y--;
								}
								if ((mon == 1) || (mon == 3) || (mon == 5) || (mon == 7) || (mon == 8) || (mon == 10) || (mon == 12))
								{
									day = 31;
								}
								else if ((mon == 4) || (mon == 6) || (mon == 9) || (mon == 11))
								{
									day = 30;
								}
								else if ((y % 100 != 0) && (y % 4 == 0) || (y % 100 == 0) && (y % 400 == 0))
								{
									day = 29;
								}
								else
								{
									day = 28;
								}
						}
				}
				m %= 7;
				switch (m)
				{
					case 0:
						System.out.print("Mon.\n");
						break;
					case 1:
						System.out.print("Tue.\n");
						break;
					case 2:
						System.out.print("Wed.\n");
						break;
					case 3:
						System.out.print("Thu.\n");
						break;
					case 4:
						System.out.print("Fri.\n");
						break;
					case 5:
						System.out.print("Sat.\n");
						break;
					case 6:
						System.out.print("Sun.\n");
						break;
				}

		return 0;
	}

}

