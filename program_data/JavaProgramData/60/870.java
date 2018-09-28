package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m = 0;
		int p;
		int q;
		int[] sz = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n;i++)
		{
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if (j == i)
			{
				sz[m] = i;
				m++;
			}
		}
		for (p = 0;p < m;p++)
		{
			for (q = p + 1;q < m;q++)
			{
				if (sz[q] - sz[p] == 2)
				{
			System.out.printf("%d %d\n",sz[p],sz[q]);
				}
			}
		}
		if (n <= 4)
		{
			System.out.print("empty");
		}

		return 0;
	}

}

