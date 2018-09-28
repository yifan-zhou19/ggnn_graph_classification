package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int e;
		int year;
		int month1;
		int month2;
		int day;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
					  day = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				month1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				month2 = Integer.parseInt(tempVar4);
			}
			if (month1 > month2)
			{
				e = month2;
				month2 = month1;
				month1 = e;
			}

			for (k = month1;k < month2;k++)
			{
				if (k == 1 || k == 3 || k == 5 || k == 7 || k == 8 || k == 10 || k == 12)
				{
					day = day + 31;
				}
			else if (k == 4 || k == 6 || k == 9 || k == 11)
			{
				day = day + 30;
			}
			else if (k == 2)
			{
				if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
				{
					day = day + 29;
				}
				else
				{
					day += 28;
				}
			}
			}
			if (day % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else if (day % 7 != 0)
			{
				System.out.print("NO\n");
			}
		}

		return 0;
	}
}

