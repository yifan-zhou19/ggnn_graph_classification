package <missing>;

public class GlobalMembers
{
	public static int[] sz = new int[301];
	public static int m;
	public static int n;
	public static int remove(int k)
	{
		int i;
		int t;
		t = (m + k - 1) % n;
		for (i = t + 1;i < n;i++)
		{
			sz[i - 1] = sz[i];
		}
		return t % (n - 1);
	}
	public static int Main()
	{
		int i;
		int k;
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
		while (m != 0 || n != 0)
		{
			for (i = 0;i < n;i++)
			{
				sz[i] = i + 1;
			}
			for (k = 0;n > 1;n--)
			{
				k = remove(k);
			}
			System.out.printf("%d\n",sz[0]);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m = Integer.parseInt(tempVar4);
			}
		}
		return 0;
	}
}

