package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int year;
		int month1;
		int month2;
		int day = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			day = 0;
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
			if (month1 > month2)
			{
				a = month1;
				month1 = month2;
				month2 = a;
			}

			for (;;)
			{
				if (month1 == month2)
				{
					break;
				}

				if (month1 == 1 || month1 == 3 || month1 == 5 || month1 == 7 || month1 == 8 || month1 == 10 || month1 == 12)
				{
					day = day + 31;
					month1++;
					continue;
				}
				if (month1 == 4 || month1 == 6 || month1 == 9 || month1 == 11)
				{
					day = day + 30;
					month1++;
					continue;
				}
				if (month1 == 2)
				{
					if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
					{
						day = day + 29;
						month1++;
						continue;
					}
					else
					{
						day = day + 28;
						month1++;
						continue;
					}
				}
			}
			if (day % 7 == 0)
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

