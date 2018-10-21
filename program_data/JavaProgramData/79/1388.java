package <missing>;

public class GlobalMembers
{
	public static int procedure(int n, int m)
	{
		int num = n;
		int i;
		int j;
		int k;
		int r;
		int[] sz = new int[300];
		for (i = 0;i < n;i++)
		{
			sz[i] = 0;
		}
		i = 0;
		for (k = num;k > 1;k--)
		{
			j = 0;
			while (j < m)
			{
				if (i == n)
				{
					i = 0;
				}
				if (j == m - 1 && sz[i] == 0)
				{
					sz[i] = 1;
					break;
				}
				if (sz[i] == 0)
				{
					j = j + 1;
				}
				i = i + 1;
				continue;
			}
		}
		for (r = 0;r < n;r++)
		{
			if (sz[r] == 0)
			{
				return r + 1;
			}
		}
	}

	public static int Main()
	{
		int[] ans = new int[100];
		int n;
		int m;
		int t;
		int s;
		t = 0;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n == 0 && m == 0)
			{
				break;
			}
			else
			{
				ans[t] = procedure(n, m);
				t++;
			}
		}
		for (s = 0;s < t;s++)
		{
			System.out.printf("%d\n",ans[s]);
		}
		return 0;
	}
}

