package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t = 0;
		int[] monthday = {0, 31, 28 + t, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		int year;
		int month;
		int day;
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
			t = 1;
		}

		int summonth = 0;
		int sum = 0;

		int i;
		for (i = 0;i < month;i++)
		{
			summonth += monthday[i];
		}
		sum = summonth + day;
		System.out.printf("%d",sum);



		return 0;

	}
}

