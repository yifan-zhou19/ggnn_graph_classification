package <missing>;

public class GlobalMembers
{
	public static int y(int year)
	{
		if (((year % 4 == 0) && (year % 100 != 0)) || ((year % 400 == 0) && (year % 100 == 0)))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int[] a = {3, 0, 3, 2, 3, 2, 3, 3, 2, 3, 2, 3};
		int day;
		int i;
		int j = 0;
		int time;
		int year;
		int m1;
		int m2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			time = Integer.parseInt(tempVar);
		}
		for (;time > 0;time--)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year = Integer.parseInt(tempVar2);
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
			a[1] = y(year);
			if (m1 > m2)
			{
				day = m1;
				m1 = m2;
				m2 = day;
			}
			day = 0;
			for (i = m1;i < m2;i++)
			{
				day += a[i - 1];
			}
			if (day % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
			j++;
		}
	}

}

