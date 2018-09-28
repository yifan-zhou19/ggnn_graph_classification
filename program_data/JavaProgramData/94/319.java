package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[500];
		int n;
		int i;
		int k;
		int s;
		int d;
		int c;
		int e;
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
		for (k = 1;k <= n;k++)
		{
		   for (i = 0;i < n - k;i++)
		   {
			   if (sz[i] > sz[i + 1])
			   {
				   s = sz[i + 1];
				   sz[i + 1] = sz[i];
				   sz[i] = s;
			   }
		   }
		}
		for (c = 0;c < n;c++)
		{
			d = sz[c] % 2;
			if (d == 1)
			{
			System.out.printf("%d",sz[c]);
			}
			break;
		}
		for (e = c + 1;e < n;e++)
		{
			d = sz[e] % 2;
			if (d == 1)
			{
			System.out.printf(",%d",sz[e]);
			}
		}
		return 0;
	}

}

