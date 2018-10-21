package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int w;
		int[] day = new int[12];
		int[] mon = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		day[0] = 13;
		for (i = 1;i < 12;i++)
		{
			day[i] = day[i - 1] + mon[i - 1];
		}
		for (i = 0;i < 12;i++)
		{
			if ((day[i] + w) % 7 == 6)
			{
				System.out.printf("%d\n",i + 1);
			}
		}
		return 0;
	}
}

