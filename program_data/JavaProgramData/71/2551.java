package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int year;
		int month1;
		int month2;
		int day = new int(int year,int month);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				month1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				month2 = Integer.parseInt(tempVar4);
			}
			if ((day(year, month1) - day(year, month2)) % 7 == 0)
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
	public static int day(int year,int month)
	{
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int c;
		if (year % 4 == 0 && (year % 100 != 0) || (year % 400 == 0))
		{
			days[2]++;
		}
		c = 0;
		for (i = 1;i < month;i++)
		{
			c += days[i];
		}
		return c;
	}
}

