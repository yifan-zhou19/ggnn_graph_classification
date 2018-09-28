package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j = -1;
		int i;
		int[][] sz = new int[100][2];
		int[] time = new int[100];
		int f = 1;
		int max = 0;
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
				sz[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i][1] = Integer.parseInt(tempVar3);
			}
			if (sz[i][0] >= 90 && sz[i][0] <= 140 && 60 <= sz[i][1] != 0 && sz[i][1] <= 90 && f == 1)
			{
				j++;
				time[j]++;
				f = 0;
			}
			else if (sz[i][0] >= 90 && sz[i][0] <= 140 && 60 <= sz[i][1] != 0 && sz[i][1] <= 90)
			{
				time[j]++;
			}

			else
			{
				f = 1;
			}

		}
		for (i = 0;i <= j;i++)
		{
			if (max < time[i])
			{
				max = time[i];
			}
		}
		System.out.printf("%d",max);

		return 0;
	}
}

