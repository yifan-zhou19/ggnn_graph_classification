package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int year;
		int mon1;
		int mon2;
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int day1;
		int day2;
		int day3;
		int day4;
		int i1;
		int i2;
		int k1;
		int k2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1; i <= n; i++)
		{
			day1 = 0;
			day2 = 0;
			day3 = 0;
			day4 = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				mon1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				mon2 = Integer.parseInt(tempVar4);
			}
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			{
				if (mon1 < mon2)
				{
					for (i1 = mon1; i1 < mon2; i1++)
					{
						day1 = day1 + b[i1 - 1];
					}
					if (day1 % 7 == 0)
					{
						System.out.print("YES\n");
					}
					else
					{
						System.out.print("NO\n");
					}
				}
				else
				{
					for (k1 = mon2; k1 < mon1; k1++)
					{
						day2 = day2 + b[k1 - 1];
					}
					if (day2 % 7 == 0)
					{
						System.out.print("YES\n");
					}
					else
					{
						System.out.print("NO\n");
					}
				}
			}
			else
			{
				if (mon1 < mon2)
				{
					for (i2 = mon1; i2 < mon2; i2++)
					{
						day3 = day3 + a[i2 - 1];
					}
					if (day3 % 7 == 0)
					{
						System.out.print("YES\n");
					}
					else
					{
						System.out.print("NO\n");
					}
				}
				else
				{
					for (k2 = mon2; k2 < mon1; k2++)
					{
						day4 = day4 + a[k2 - 1];
					}
					if (day4 % 7 == 0)
					{
						System.out.print("YES\n");
					}
					else
					{
						System.out.print("NO\n");
					}
				}
			}
		}
		return 0;
	}
}

