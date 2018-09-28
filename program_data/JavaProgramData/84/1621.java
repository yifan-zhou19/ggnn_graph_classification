package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[100];
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
				t = sz[i + 1];
				sz[i + 1] = sz[i];
				sz[i] = t;
			}
			else
			{
				sz[i + 1] = sz[i + 1];
			}
		}
		for (i = 0;i < n - 2;i++)
		{
			if (sz[i] > sz[i + 1])
			{
				t = sz[i + 1];
				sz[i + 1] = sz[i];
				sz[i] = t;
			}
			else
			{
				sz[i + 1] = sz[i + 1];
			}
		}

		System.out.printf("%d\n%d",sz[n - 1],sz[n - 2]);
			return 0;
	}

}

