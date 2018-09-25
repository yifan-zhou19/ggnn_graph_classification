package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] high = new int[100];
		int[] low = new int[100];
		int count;
		int max;
		int all;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			all = Integer.parseInt(tempVar);
		}
		max = 0;
		for (i = 0;i < all;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				high[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				low[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < all - 1;i++)
		{
			if (high[i] >= 90 && high[i] <= 140 && low[i] >= 60 && low[i] <= 90)
			{
				count = 0;
				while (high[i + 1] >= 90 && high[i + 1] <= 140 && low[i + 1] >= 60 && low[i + 1] <= 90)
				{
					i++;
					count++;
				}
				count++;
				if (count > max)
				{
					max = count;
				}

			}
		}
		if (all == 1 && high[i] >= 90 && high[i] <= 140 && low[i] >= 60 && low[i] <= 90)
		{
			max = 1;
		}
		System.out.printf("%d",max);


	return 0;
	}
}

