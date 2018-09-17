package <missing>;

public class GlobalMembers
{
	public static int[] map = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int Main()
	{
		int year;
		int month;
		int day;
		int i;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			map[2] = 29;
		}
		if (month == 1)
		{
			sum = day;
		}
		else
		{
			for (i = 1;i < month;i++)
			{
				sum = sum + map[i];
			}
			sum = sum + day;
		}
		System.out.printf("%d",sum);
		return 0;
	}

}

