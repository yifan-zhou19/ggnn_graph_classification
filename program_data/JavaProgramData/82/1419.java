package <missing>;

public class GlobalMembers
{
	public static int[] x = new int[100];
	public static int[] y = new int[100];
	public static int Main()
	{
		int n;
		int i;
		int j;
		int hour;
		int maxhour;
		hour = 0;
		maxhour = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					x[i - 1] = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					y[j - 1] = Integer.parseInt(tempVar3);
				}
				if (x[i - 1] >= 90 && x[i - 1] <= 140 && y[j - 1] >= 60 && y[j - 1] <= 90)
				{
				hour++;
				}
				else
				{
					if (maxhour < hour)
					{
						maxhour = hour;
					}
				hour = 0;
				}
			}
		}
		if (maxhour < hour)
		{
			maxhour = hour;
		}
		System.out.printf("%d",maxhour);
	return 0;
	}
}

