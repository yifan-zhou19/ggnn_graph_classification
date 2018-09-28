package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int year;
		int month1;
		int month2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
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
			{
				if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
				{
					int[] days = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
					int day1 = 0;
					int day2 = 0;
					for (i = 0;i < month1;i++)
					{
						day1 += days[i];
					}
					for (i = 0;i < month2;i++)
					{
						day2 += days[i];
					}
					if ((day2 - day1) % 7 == 0)
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
					int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
					int day1 = 0;
					int day2 = 0;
					for (i = 0;i < month1;i++)
					{
						day1 += days[i];
					}
					for (i = 0;i < month2;i++)
					{
						day2 += days[i];
					}
					if ((day2 - day1) % 7 == 0)
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

