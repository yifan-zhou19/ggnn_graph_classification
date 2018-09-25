package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
		int a;
		int i;
		int gap;
		int y;
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

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
		gap = 0;

		if (y1 > y2)
		{
			a = y1;
			y1 = y2;
			y2 = a;
		}

		for (y = y1;y <= y2;y++)
		{
			if (y % 400 == 0 || (y % 100 != 0 && y % 4 == 0))
			{
				gap += 366;
			}
			else
			{
				gap += 365;
			}
		}

		if (y1 % 400 == 0 || (y1 % 100 != 0 && y1 % 4 == 0))
		{
			month[2] = 29;
		}
		for (i = 1;i < m1;i++)
		{
			gap -= month[i];
		}
		gap -= d1;

		if ((y2 % 400 == 0 || (y2 % 100 != 0 && y2 % 4 == 0)) == 0)
		{
			month[2] = 28;
		}
		for (i = m2;i <= 12;i++)
		{
			gap -= month[i];
		}
		gap += d2;

		System.out.printf("%d",gap);

		return 0;
	}

}

