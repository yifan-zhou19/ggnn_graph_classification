package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
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
		int[] dmonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i = 0;
		int sum = 0;
		for (i = 0;i < month - 1;i++)
		{
			sum = sum + dmonth[i];
		}
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			if (month >= 3)
			{
				sum = sum + day + 1;
			}
		}
		else
		{
			sum = sum + day;
		}
		System.out.printf("%d",sum);
		return 0;
	}
}

