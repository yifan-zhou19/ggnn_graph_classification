package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int m;
		int e;
		int[] sz = new int[1000];
		int x = -1;
		int[] a = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (m = 1;m <= N;m++)
		{
			for (int a = 0;a < N - m;a++)
			{
				if (sz[a] > sz[a + 1])
				{
					e = sz[a + 1];
					sz[a + 1] = sz[a];
					sz[a] = e;
				}
			}
		}
		for (int y = 0;y < N;y++)
		{
			if (sz[y] % 2 == 1)
			{
				x++;
				a[x] = sz[y];
			}
		}
		for (int q = 0;q <= x;q++)
		{
			if (q < x)
			{
				System.out.printf("%d,",a[q]);
			}
			else if (q == x)
			{
				System.out.printf("%d",a[q]);
			}
		}
		return 0;
	}
}

