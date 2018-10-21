package <missing>;

public class GlobalMembers
{
	public static int runnian(int y)
	{
		int t;
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
		{
			t = 1;
		}
		else
		{
			t = 0;
		}
		return t;
	}

	public static int Main()
	{
		int i;
		int y1;
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			y2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			m2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			d2 = Integer.parseInt(tempVar6);
		}
		for (i = y1;i < y2;i++)
		{
			sum += 365 + runnian(i);

		}
			for (i = 1;i < m1;i++)
			{
				if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
				{
					sum -= 31;
				}
				if (i == 4 || i == 6 || i == 9 || i == 11)
				{
					sum -= 30;
				}
				if (i == 2)
				{
					if (runnian(y1) != 0)
					{
						sum -= 29;
					}
					else
					{
						sum -= 28;
					}
				}
			}
			for (i = 1;i < m2;i++)
			{
				if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
				{
					sum += 31;
				}
				if (i == 4 || i == 6 || i == 9 || i == 11)
				{
					sum += 30;
				}
				if (i == 2)
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
			sum = sum + d2 - d1;
			System.out.printf("%d",sum);
			return 0;
	}

}

