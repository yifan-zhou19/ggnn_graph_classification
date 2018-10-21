package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int w;
		int[] month = new int[13];
		int week;
		int sum_day = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		month[1] = 31;
		month[2] = 28;
		month[3] = 31;
		month[4] = 30;
		month[5] = 31;
		month[6] = 30;
		month[7] = 31;
		month[8] = 31;
		month[9] = 30;
		month[10] = 31;
		month[11] = 30;
		month[12] = 31;
	for (j = 1;j < 13;j++)
	{
			for (i = 1;i < 366;i++)
			{
				week = (i + w - 1) % 7;
				if ((i - sum_day) == 13 && week == 5)
				{
				System.out.printf("%d\n",j);
				}

			}
				sum_day += month[j];

	}

	return 0;
	}

}

