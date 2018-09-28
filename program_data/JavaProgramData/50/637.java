package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] mon13 = new int[12];
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			mon13[0] = Integer.parseInt(tempVar);
		}
		mon13[0] = mon13[0] + 12;
		for (i = 1;i < 12;i++)
		{
			mon13[i] = mon13[i - 1] + day[i - 1];
		}
		for (i = 0;i < 12;i++)
		{
			if (mon13[i] % 7 == 5)
			{
				System.out.printf("%d\n",i + 1);
			}
		}
		return 0;
	}


}

