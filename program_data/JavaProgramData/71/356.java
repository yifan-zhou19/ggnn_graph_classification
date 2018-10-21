package <missing>;

public class GlobalMembers
{
	public static int leap(int n)
	{
		if ((n % 4 == 0 && n % 100 != 0) || n % 400 == 0)
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
		int year;
		int mon1;
		int mon2;
		int[] mon = {0, 3, 0, 3, 2, 3, 2, 3, 3, 2, 3, 2, 3};
		int i;
		int j;
		int n;
		int temp;
		int day;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
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
			if (mon1 > mon2)
			{
				temp = mon1;
				mon1 = mon2;
				mon2 = temp;
			}
			if (leap(year) != 0)
			{
				mon[2]++;
			}
			day = 0;
			for (j = mon1;j < mon2;j++)
			{
				day += mon[j];
			}
			if (day % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
			if (leap(year) != 0)
			{
				mon[2]--;
			}
		}
	}
}

