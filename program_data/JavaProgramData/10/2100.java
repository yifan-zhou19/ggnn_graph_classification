package <missing>;

public class GlobalMembers
{
	public static final int maxn = 30;
	public static int[] h = new int[maxn];
	public static int[] f = new int[maxn];
	public static int Main()
	{
		int n;
	//	freopen("readin","r",stdin);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h + i = tempVar2;
			}
		}
		f[1] = 1;
		int j;
		int max = 0;
		for (i = 2;i <= n;i++)
		{
			max = 0;
			for (j = 1;j <= i - 1;j++)
			{
				if (h[i] <= h[j])
				{
				if (max < f[j])
				{
					max = f[j];
				}
				}
			}
			f[i] = max + 1;
		}
		max = 0;
		for (i = 1;i <= n;i++)
		{
			if (max < f[i])
			{
			max = f[i];
			}
		}
		System.out.printf("%d\n",max);
		return 0;
	}
}

