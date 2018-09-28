package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int e;
		int[] sz = new int[500];
		int[] a = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = 0;
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (int i = 0;i < n;i++)
		{
			if (sz[i] % 2 == 1)
			{
				a[k] = sz[i];
				k++;
			}
		}
		for (int l = 0;l <= k;l++)
		{
			for (int i = 0;i < k - 1;i++)
			{
				if (a[i] > a[i + 1])
				{
				   e = a[i + 1];
				   a[i + 1] = a[i];
				   a[i] = e;
				}
			}
		}
		for (int i = 0;i < k;i++)
		{
			if (i == 0)
			{
				System.out.printf("%d",(a[i]));
			}
			else
			{
				System.out.printf(",%d",(a[i]));
			}
		}
	return 0;
	}

}

