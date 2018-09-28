package <missing>;

public class GlobalMembers
{
	public static int[] mon = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int day(int m)
	{
		int day = 0;
		int i;
		for (i = 1;i < m;i++)
		{
			day = day + mon[i];
		}
		day = day + 13;
		return (day);
	}
	public static int Main()
	{
		int i;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 1;i < 13;i++)
		{
			if ((a + day(i) - 1) % 7 == 5)
			{
				System.out.printf("%d\n",i);
			}
		}
		return 0;
	}

}

