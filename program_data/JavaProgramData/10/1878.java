package <missing>;

public class GlobalMembers
{
	public static final int maxsize = 26;
	public static int maxnum(int[] r, int n)
	{
		int ans = 1;
		int i;
		int j;
		int temp;
		int[] maxlen = new int[maxsize];
		maxlen[0] = 1;
		for (i = 1; i < n; i++)
		{
			temp = 0;
			for (j = 0; j < i; j++)
			{
				if (r[j] >= r[i])
				{
					if (maxlen[j] > temp)
					{
						temp = maxlen[j];
					}
				}
			}
			maxlen[i] = temp + 1;
			if (ans < maxlen[i])
			{
				ans = maxlen[i];
			}
		}
		return ans;
	}
	public static int Main()
	{
		int i;
		int k;
		int[] r = new int[maxsize];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0; i < k; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				r + i = tempVar2;
			}
		}
		System.out.printf("%d\n", maxnum(r, k));
		return 0;
	}

}

