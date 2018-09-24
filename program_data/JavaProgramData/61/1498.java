package <missing>;

public class GlobalMembers
{
	public static int w(int n)
	{
		int i;
		int[] sz = new int[100];
		sz[0] = 0;
		sz[1] = 1;
		if (n == 0 || n == 1)
		{
			return sz[n];
		}
		else
		{
			for (i = 1;i < n + 1;i++)
			{
				sz[i + 1] = sz[i] + sz[i - 1];
			}
		}
		return sz[n];
	}
	public static int Main()
	{
		int m;
		int n;
		int[] sz = new int[100];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",w(n));
		}
		return 0;
	}
}

