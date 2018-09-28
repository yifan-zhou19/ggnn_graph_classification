package <missing>;

public class GlobalMembers
{
	public static int fc(int year, int mon1, int mon2)
	{
		int delta = 0;
		int i;
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (i = mon1;i < mon2;i++)
		{
			delta += month[i];
		}
		if (mon1 == 2 || (mon1 == 1 && mon2 > 2))
		{
			if (year % 4 == 0 && year >= 4 && year % 100 != 0)
			{
				delta += 1;
			}
			else if (year % 100 == 0 && year >= 100 && year % 400 == 0)
			{
				delta += 1;
			}
		}
		return delta;
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < n;i++)
		{
			int year;
			int mon1;
			int mon2;
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
				int tmp;
				tmp = mon1;
				mon1 = mon2;
				mon2 = tmp;
			}
			if (fc(year, mon1, mon2) % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
		return 0;
	}
}

