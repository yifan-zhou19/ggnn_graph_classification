package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		int e;
		int k = 0;
		int a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] sz = new int[100][2];
		int[] sf = new int[100];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sz[i][1] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (i < n - 1)
			{
				if ((sz[i][0] >= 90) && (sz[i][0] <= 140) && (sz[i][1] >= 60) && (sz[i][1] <= 90))
				{
					a++;
				}
				else
				{
					sf[k] = a;
					k++;
					a = 0;
				}
			}
			if (i == n - 1)
			{
				if ((sz[i][0] >= 90) && (sz[i][0] <= 140) && (sz[i][1] >= 60) && (sz[i][1] <= 90))
				{
					sf[k] = a + 1;
				}
				else
				{
					sf[k] = a;
				}
			}

		}
		for (l = 0;l < k;l++)
		{
			if (sf[l] > sf[l + 1])
			{
				e = sf[l];
				sf[l] = sf[l + 1];
				sf[l + 1] = e;
			}
		}
		System.out.printf("%d",sf[k]);
		return 0;
	}
}

