package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] sz = new int[n][2];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i][1] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i][2] = Integer.parseInt(tempVar3);
			}
		}
		int[] sz2 = new int[n];
		int j = 0;
			for (i = 0;i <= n;i++)
			{
			sz2[i] = 0;

			}
		for (i = 0;i < n;i++)
		{
			if (sz[i][1] >= 90 && sz[i][1] <= 140 && sz[i][2] >= 60 && sz[i][2] <= 90)
			{
				sz2[j]++;

			}
			else
			{
				j++;
			}
		}
		int max = 0;
		for (i = 0;i <= j;i++)
		{
			if (sz2[i] > max)
			{
				max = sz2[i];
			}
		}

		System.out.printf("%d",max);

		return 0;
	}

}

