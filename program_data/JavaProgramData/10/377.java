package <missing>;

public class GlobalMembers
{
	public static int num(int[] m, int i, int k)
	{
		int re = 0;
		int j;
		int t;
		if (i == k)
		{
			return (0);
		}
		for (j = i + 1;j <= k;j++)
		{
			if (m[j] <= m[i])
			{
				t = num(m, j, k);
				if (t > re)
				{
					re = t;
				}
			}
		}
		re++;
		return (re);
	}
	public static void Main()
	{
		int k;
		int i;
		int t;
		int ans = 0;
		int[] m = new int[25];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i <= k;i++)
		{
			t = num(m, i, k);
			if (t > ans)
			{
				ans = t;
			}
		}
		System.out.printf("%d",ans);
	}
}

