package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
		int y;
		int m;
		int d;
		int day1;
		int day2;
		int all1 = 0;
		int all2 = 0;
		int all3 = 0;
		int all;
		int[] s = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 0, 0, 0, 0, 0, 0, 0};
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
		String tempVar4 = ConsoleInput.scanfRead("\n");
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

		day1 = 365 * (y1 - 1) + (y1 - 1) / 4 - (y1 - 1) / 100 + (y1 - 1) / 400;
		day2 = 365 * (y2 - 1) + (y2 - 1) / 4 - (y2 - 1) / 100 + (y2 - 1) / 400;

		all2 = day2 - day1;

		for (y = y1;y < 2;y++)
		{
			if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
			{
				all2++;
			}
		}

		for (m = 1;m < m2;m++)
		{
			all3 = all3 + s[m];
		}
		all3 = all3 + d2;
		if ((y2 % 4 == 0 && y2 % 100 != 0) || y2 % 400 == 0)
		{
			if (m2 > 2)
			{
				all3++;
			}
		}

		for (m = 1;m < m1;m++)
		{
			all1 = all1 + s[m];
		}
		all1 = all1 + d1;
		if ((y1 % 4 == 0 && y1 % 100 != 0) || y1 % 400 == 0)
		{
			if (m2 > 2)
			{
				all3++;
			}
		}

		all = all2 + all3 - all1;

		System.out.printf("%d",all);
	}
}

