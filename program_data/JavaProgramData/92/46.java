package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] s1 = new int[MN];
	public static int[] s2 = new int[MN];

	public static int Cmp(int a, int b)
	{
		if (s1[a] > s2[b])
		{
			return 200;
		}
		if (s1[a] == s2[b])
		{
			return 0;
		}
		return -200;
	}

	public static int Main()
	{
		int i;
		int j;
		int ans;
		int k;
		while (scanf("%d", n), n)
		{
			for (i = 0; i < n; i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					s1 + i = tempVar;
				}
			}
			for (i = 0; i < n ;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					s2 + i = tempVar2;
				}
			}
			sort(s1, s1 + n);
			sort(s2, s2 + n);
			ans = -1000000;

			for (i = 0; i < n; i++)
			{
				k = 0;
				for (j = i; j < n; j++)
				{
					k += Cmp(j, j - i);
				}
				k -= 200 * i;
				ans = Math.max(ans, k);
			}
			System.out.printf("%d\n", ans);
		}
	}

}

