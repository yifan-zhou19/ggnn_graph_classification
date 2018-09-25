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
		int sum1 = 0;
		int sum2 = 0;
		int x;
		int k;
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
		sum1 = sum1 + d1;
		sum2 = sum2 + d2;
		for (k = 1;k < m1;k++)
		{
			if (k == 1 || k == 3 || k == 5 || k == 7 || k == 8 || k == 10 || k == 12)
			{
				sum1 = sum1 + 31;
			}
			else if (k == 4 || k == 6 || k == 9 || k == 11)
			{
				sum1 = sum1 + 30;
			}
			else if (k == 2)
			{
				if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
				{
					sum1 = sum1 + 29;
				}
				else
				{
					sum1 = sum1 + 28;
				}
			}
		}
		for (k = 1;k < m2;k++)
		{
			if (k == 1 || k == 3 || k == 5 || k == 7 || k == 8 || k == 10 || k == 12)
			{
				sum2 = sum2 + 31;
			}
			else if (k == 4 || k == 6 || k == 9 || k == 11)
			{
				sum2 = sum2 + 30;
			}
			else if (k == 2)
			{
				if ((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0))
				{
					sum2 = sum2 + 29;
				}
				else
				{
					sum2 = sum2 + 28;
				}
			}
		}
		for (k = y1;k < y2;k++)
		{
			if ((k % 4 == 0 && k % 100 != 0) || (k % 400 == 0))
			{
				sum2 = sum2 + 366;
			}
			else
			{
				sum2 = sum2 + 365;
			}
		}
		x = sum2 - sum1;
		System.out.printf("%d\n",x);
		return 0;
	}


}

