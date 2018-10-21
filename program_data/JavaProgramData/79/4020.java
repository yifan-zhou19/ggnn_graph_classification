package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[300];
		int n;
		int m;
		int i;
		int k;
		int l;
		int p;
		int[] king = new int[100];
		for (p = 1;p > 0;p++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0 && n == 0)
			{
				break;
			}
			for (i = 0;i < n;i++)
			{
				sz[i] = 1;
			}
			i = -1;
			for (k = 0;k < n;k++)
			{
				l = 0;
				while (l < m)
				{
					if (i == n - 1)
					{
						i = 0;
					}
					else
					{
						i++;
					}
					if (sz[i] == 1)
					{
						l++;
					}
				}
				sz[i] = 0;
			}
			king[p] = i + 1;
		}
		int x;
		for (x = 1;x < p;x++)
		{
			System.out.printf("%d\n",king[x]);
		}
		return 0;
	}
}

