package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int i;
		int j;
		int k;
		int n;
		int[] sz = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			if (sz[i] > sz[i + 1])
			{
				int tmp;
				tmp = sz[i + 1];
				sz[i + 1] = sz[i];
				sz[i] = tmp;
			}
		}
		System.out.printf("%d\n",sz[n - 1]);
		for (i = 0;i < n - 2;i++)
		{
			if (sz[i] > sz[i + 1])
			{
				int tmp;
				tmp = sz[i + 1];
				sz[i + 1] = sz[i];
				sz[i] = tmp;
			}
		}
		System.out.printf("%d\n",sz[n - 2]);
		return 0;
	}
}

