package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
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
		int e;
		for (int k = 1;k < n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				e = sz[i];
				sz[i] = sz[i + 1];
				sz[i + 1] = e;
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

