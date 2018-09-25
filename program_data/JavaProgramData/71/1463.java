package <missing>;

public class GlobalMembers
{
	public static int xgy(int year,int month1,int month2)
	{
		int i;
		int m;
		int days = 0;
		if (month1 > month2)
		{
			m = month1;
			month1 = month2;
			month2 = m;
		}
		for (i = month1;i < month2;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				days += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				days += 30;
			}
			else if (i == 2)
			{
				if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
				{
					days += 29;
				}
				else
				{
					days += 28;
				}
			}
		}
		if (days % 7 == 0)
		{
			return 1;
		}
		if (days % 7 != 0)
		{
			return 0;
		}
	}
	public static int Main()
	{
		int i;
		int n;
		int year;
		int month1;
		int month2;
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
				month1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				month2 = Integer.parseInt(tempVar4);
			}
			if (xgy(year, month1, month2) != 0)
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

