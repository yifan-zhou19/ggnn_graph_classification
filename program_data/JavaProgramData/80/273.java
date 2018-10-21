package <missing>;

public class GlobalMembers
{
	public static double h;
	public static double r;

	public static int i;
	public static int ans = 0;
	public static int year1;
	public static int year2;
	public static int month1;
	public static int month2;
	public static int day1;
	public static int day2;
	public static int[] num_month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			year2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			month2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			day2 = Integer.parseInt(tempVar6);
		}
		for (i = year1 + 1;i < year2;++i)
		{
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
			{
				++ans;
			}
		}
		ans += 365 * (year2 - year1 - 1);
		for (i = 1;i <= month2 - 1;++i)
		{
			ans += num_month[i];
		}
		for (i = month1 + 1;i <= 12;++i)
		{
			ans += num_month[i];
		}
		ans += day2 + num_month[month1] - day1;
		if ((year1 % 4 == 0 && year1 % 100 != 0 || year1 % 400 == 0) && month1 <= 2)
		{
			++ans;
		}
		if ((year2 % 4 == 0 && year2 % 100 != 0 || year2 % 400 == 0) && month2 > 2)
		{
			++ans;
		}
		System.out.printf("%d\n",ans);
		return 0;
	}
}

