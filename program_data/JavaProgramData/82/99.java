package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] count = new int[1000];
		int[] high = new int[1000];
		int[] low = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				high[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				low[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			count[i] = 0;
			for (j = i;j < n;j++)
			{
				if (high[j] <= 140 && high[j] >= 90 && low[j] >= 60 && low[j] <= 90)
				{
					count[i]++;
				}
				else
				{
					break;
				}
			}
		}
		for (i = 1;i < n;i++)
		{
			if (count[0] < count[i])
			{
				count[0] = count[i];
			}
		}
		System.out.printf("%d",count[0]);
		return 0;
	}

}

