package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[MAX];
		int n;
		int i;
		int j;
		int e;
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
		for (i = 1;i <= n;i++)
		{
		  for (j = 0;j < n - i;j++)
		  {
			if (sz[j] >= sz[j + 1])
			{
				  e = sz[j];
				  sz[j] = sz[j + 1];
				  sz[j + 1] = e;
			}
		  }
		}
		for (i = n - 1;i > 0;i--)
		{
			if (sz[i] % 2 != 0)
			{
			   t = sz[i];

			   break;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] % 2 != 0)
			{
				if (sz[i] != t)
				{
					System.out.printf("%d,",sz[i]);
				}
				else
				{
				   System.out.printf("%d",sz[i]);
				}
			}
		}
		return 0;
	}
}

