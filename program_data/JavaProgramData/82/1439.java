package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] high = new int[101];
		int[] low = new int[101];
		int[] t = new int[101];
		int e;
		int j = 0;
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
			if (high[i] <= 140 && high[i] >= 90 && low[i] <= 90 && low[i] >= 60)
			{
				t[j]++;
			}
			else
			{
				j++;
				continue;

			}

		}
		int max = t[0];
		for (i = 0;i <= j;i++)
		{
			if (t[i] > max)
			{
				e = max;
				max = t[i];
				t[i] = e;
			}
		}
		System.out.printf("%d",max);



		return 0;
	}


}

