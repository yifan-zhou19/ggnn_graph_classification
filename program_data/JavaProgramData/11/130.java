package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			int[] d = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
			for (i = 0;i < month;i++)
			{
				day = day + d[i];
			}

		}
		else
		{
			int[] d = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
			for (i = 0;i < month;i++)
			{
			   day = day + d[i];
			}
		}
		System.out.printf("%d",day);
		return 0;
	}
}

