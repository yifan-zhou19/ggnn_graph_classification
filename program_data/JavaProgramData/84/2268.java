package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;

		int[] sz = new int[100];
		int e;
		int y = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
		for (i = 0; i < n;i++)
		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}

		for (i = 0;i < n;i++)
		{
			if (sz[i] >= sz[y])
			{
				y = i;

			}
		}
		if (y != 0)
		{
			e = sz[y];
			sz[y] = sz[0];
			sz[0] = e;
		}
		int x = 1;
		int t;
		int m;
		for (m = 1;m < n;m++)
		{
			if (sz[m] >= sz[x])
			{
				x = m;
			}
		}
		if (x != 1)
		{
			t = sz[x];
			sz[x] = sz[1];
			sz[1] = t;
		}
		System.out.printf("%d\n",sz[0]);
		System.out.printf("%d\n",sz[1]);
		return 0;
	}
}

