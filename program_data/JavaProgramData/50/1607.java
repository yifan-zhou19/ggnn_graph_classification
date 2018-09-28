package <missing>;

public class GlobalMembers
{
	public static int[] sz = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public static int Main()
	{
		int day;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			day = Integer.parseInt(tempVar);
		}

		day = 6 - day;
		if (day <= 0)
		{
			day = day + 7;
		}

		int sum = 0;
		int i;
		for (i = 1;i <= 12;i++)
		{
			if ((sum + 13 - day) % 7 == 0)
			{
				System.out.printf("%d\n",i);
			}
			sum = sum + sz[i];
		}
		return 0;
	}
}

