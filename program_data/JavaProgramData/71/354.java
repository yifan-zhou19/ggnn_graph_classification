package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] d = new int[12];
		d[0] = 0;
		d[1] = 31;
		d[2] = 28;
		d[3] = 31;
		d[4] = 30;
		d[5] = 31;
		d[6] = 30;
		d[7] = 31;
		d[8] = 31;
		d[9] = 30;
		d[10] = 31;
		d[11] = 30;
		int n;
		int i;
		int y;
		int m1;
		int m2;
		int j1;
		int j2;
		int day1;
		int day2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			day1 = 0;
			day2 = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				m2 = Integer.parseInt(tempVar4);
			}
			if ((y % 400 == 0) || ((y % 100 != 0) && (y % 4 == 0)))
			{
				d[2] = 29;
				for (j1 = 0;j1 < m1;j1++)
				{
				day1 = day1 + d[j1];
				}
				for (j2 = 0;j2 < m2;j2++)
				{
				day2 = day2 + d[j2];
				}
				if (day2 > day1)
				{
					day2 = day2 + day1;
					day1 = day2 - day1;
					day2 = day2 - day1;
				}
				if ((day1 - day2) % 7 == 0)
				{
					System.out.print("YES");
					if (i != n - 1)
					{
					System.out.print("\n");
					}
				}
				else
				{
					System.out.print("NO");
					if (i != n - 1)
					{
					System.out.print("\n");
					}
				}
			}
			else
			{
				d[2] = 28;
				for (j1 = 0;j1 < m1;j1++)
				{
				day1 = day1 + d[j1];
				}
				for (j2 = 0;j2 < m2;j2++)
				{
				day2 = day2 + d[j2];
				}
				if (day2 > day1)
				{
					day2 = day2 + day1;
					day1 = day2 - day1;
					day2 = day2 - day1;
				}
				if ((day1 - day2) % 7 == 0)
				{
					System.out.print("YES");
					if (i != n - 1)
					{
					System.out.print("\n");
					}
				}
				else
				{
					System.out.print("NO");
					if (i != n - 1)
					{
					System.out.print("\n");
					}
				}
			}
		}
	}

}

