package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz = new int[1000];
		int k;
		int p = 0;
		int[][] h = new int[1000][1000];
		int i;
		int j;
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n - i - 1;j++)
			{
				h[i][j] = sz[i] + sz[j];
				if (h[i][j] == k)
				{
					p = 1;
				}
			}
		}
		if (p == 0)
		{
			System.out.print("no");
		}
		else if (p == 1)
		{
			System.out.print("yes");
		}
		return 0;
	}

}

