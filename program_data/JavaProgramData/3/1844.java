package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		int i;
		int[] sz = new int[1000];
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		int[][] he = new int[1000][1000];
		int j;
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < n;i++)
			{
				if (i != j)
				{
				he[i][j] = sz[i] + sz[j];
				}
			}
		}
		int t = 0;
			int d = 1;
		for (j = 0;j < n && d == 1;j++)
		{
			for (i = 0;i < n;i++)
			{
				if (i != j)
				{
					if (he[i][j] == k)
					{
						System.out.print("yes");
						d = 0;
											break;
					}
				}
				t++;
			}
		}
		if (t == n * n)
		{
			System.out.print("no");
		}
		return 0;
	}

}

