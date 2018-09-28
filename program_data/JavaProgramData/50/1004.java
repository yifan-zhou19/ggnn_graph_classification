package <missing>;

public class GlobalMembers
{
	public static int month_len(int x)
	{
		int day = 31;
		if (x == 0)
		{
			day = 0;
		}
		if (x == 2)
		{
			day = 28;
		}
		if (x == 4 || x == 6 || x == 9 || x == 11)
		{
			day = 30;
		}
		return day;
	}
	public static int sum_days(int y)
	{
		int ctr;
		int sum = 0;
		for (ctr = 0;ctr < y;ctr++)
		{
			sum += month_len(ctr);
		}
			sum += 12;
			return sum;
	}
	public static void Main()
	{
		int i;
		int w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 12;i++)
		{
			if (sum_days(i) % 7 + w == 5 || sum_days(i) % 7 + w == 12)
			{
				System.out.printf("%d\n",i);
			}
		}
	}
}

