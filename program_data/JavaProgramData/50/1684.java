package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int dayofweek;
		int days = 12;
		int[] mon = new int[12];
		int i;
		int d;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			dayofweek = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 12;i++)
		{
			if (i == 1)
			{
				mon[i] = 28;
			}
			else if (i == 3 || i == 5 || i == 8 || i == 10)
			{
				mon[i] = 30;
			}
			else
			{
				mon[i] = 31;
			}

		}
		e = 5 - dayofweek;
		if (e < 0)
		{
			e += 7;
		}
		for (i = 0;i < 12;i++)
		{
			d = days % 7;
			if (d == e)
			{
				System.out.printf("%d\n",i + 1);
			}
			days += mon[i];
		}
		return 0;
	}
}

