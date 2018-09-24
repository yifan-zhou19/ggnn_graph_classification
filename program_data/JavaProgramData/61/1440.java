package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		int n;
		for (j = 0;j < r;j++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int[] sz = new int[10000];
		sz[0] = 0;
		sz[1] = 1;
		if (n == 1)
		{
			System.out.print("1\n");
		}
		   if (n >= 2)
		   {
			for (i = 2;i <= n;i++)
			{
				sz[i] = sz[i - 1] + sz[i - 2];
			}
				System.out.printf("%d\n",sz[n]);
				for (i = 2;i <= n;i++)
				{
					sz[i] = 0;
				}
		   }
		}
		return 0;
	}
}

