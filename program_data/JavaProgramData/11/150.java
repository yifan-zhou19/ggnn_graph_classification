package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int mun;
		int day;
		int year;
		int i;
		int days = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			mun = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		days += day;
		for (i = 1;i < mun;i++)
		{
			days += a[i];
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			{
				days += 1;
			}

		}
		 System.out.printf("%d",days);
		return 0;
	}
}

