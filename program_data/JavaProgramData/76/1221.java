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
		int[][] sz = new int[50000][2];
		int r = 0;
		int t = 0;
		int[] szz = new int[10000];
		for (int i = 0;i < n;i++)
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
			if (i >= 1)
			{
				if (sz[i][1] > sz[r][1])
				{
					r = i;
				}
				if (sz[i][0] < sz[t][0])
				{
					t = i;
				}
			}
		}
		for (int k = 0;k < n;k++)
		{
			for (int p = sz[k][0] * 2;p <= 2 * sz[k][1];p++)
			{
				szz[p] = 1;
			}
		}
		for (int b = sz[t][0] * 2;b <= 2 * sz[r][1];b++)
		{
			if (szz[b] == 0)
			{
				System.out.print("no");
				break;
			}
			else if (b == 2 * sz[r][1])
			{
				System.out.printf("%d %d",sz[t][0],sz[r][1]);
			}
		}


		return 0;
	}
}

