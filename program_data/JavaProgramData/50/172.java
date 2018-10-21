package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] mon = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int[] day = new int[12];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		day[0] = 0;
		for (i = 1; i < 12; i++)
		{
			day[i] = mon[i - 1] + day[i - 1];
		}
		for (i = 0; i < 12; i++)
		{
			day[i] = day[i] + 13 + (n - 1);
		}
		for (i = 0; i < 12; i++)
		{
			if (day[i] % 7 == 5)
			{
				System.out.printf("%d\n", i + 1);
			}
			else
			{
				continue;
			}
		}
	}
}

