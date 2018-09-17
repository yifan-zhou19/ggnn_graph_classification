package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] m = new int[26];
		int x;
		int cmp = new int(int i,int k,int h[]);
		int max = new int(int m[],int k);
		int k;
		int i;
		int[] h = new int[26];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= k;i++)
		{
			m[i] = cmp(i, k, h);
		}
		x = max(m, k);
		System.out.printf("%d\n",x);
		return 0;
	}
	public static int max(int[] m, int k)
	{
		int big;
		int i;
		big = m[1];
		for (i = 1;i <= k;i++)
		{
			if (big < m[i])
			{
				big = m[i];
			}
		}
		return big;
	}
	public static int cmp(int i, int k, int[] h)
	{
		int[] b = new int[26];
		int j;
		int t = 1;
		if (i == k)
		{
			return 1;
		}
		for (j = i + 1;j <= k;j++)
		{
			if (h[i] >= h[j])
			{
				b[t] = cmp(j, k, h);
				t++;
			}
		}
		if (t == 1)
		{
			return 1;
		}
		return max(b, t - 1) + 1;
	}
}

