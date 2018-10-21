package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
		int i;
		int[] sz = new int[1000];
		for (i = 0;i < x;i++)
		{
			if (i == 0)
			{
				sz[i] = 1;
			}
			if (i == 1)
			{
				sz[i] = 1;
			}
			if (i > 1)
			{
				sz[i] = sz[i - 1] + sz[i - 2];
			}
		}
		return sz[x - 1];
	}
	public static int Main()
	{
		int n;
		int y;
		int[] m = new int[1000];
		int[] h = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (y = 0;y < n;y++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[y] = Integer.parseInt(tempVar2);
			}
			h[y] = f(m[y]);
		}
		for (y = 0;y < n;y++)
		{
			System.out.printf("%d\n",h[y]);
		}
		return 0;
	}
}

