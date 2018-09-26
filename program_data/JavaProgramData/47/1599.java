package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[100];
		int i;
		int n;
		int t;
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

		if (n % 2 == 0)
		{
			for (i = 0;i < (n / 2);i++)
			{
				t = sz[i];
				sz[i] = sz[n - 1 - i];
				sz[n - 1 - i] = t;
			}

		}
		else if (n % 2 != 0)
		{
			for (i = 0;i < ((n - 1) / 2);i++)
			{
				t = sz[i];
				sz[i] = sz[n - 1 - i];
				sz[n - 1 - i] = t;
			}
		}

		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				System.out.printf("%d",sz[i]);
			}
			else
			{
				System.out.printf(" %d",sz[i]);
			}
		}

		return 0;
	}
}

