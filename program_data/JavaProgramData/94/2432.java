package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[500];
		int i;
		int n;
		int j;
		int a = 0;
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
				(sz[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] % 2 == 1)
			{
			if (a < sz[i])
			{
				a = sz[i];
			}
			}
		}
		for (j = 1;j < a;j += 2)
		{
			for (i = 0;i < n;i++)
			{
				if (j == sz[i])
				{
					System.out.printf("%d,",j);
				}
			}
		}
		System.out.printf("%d",a);
		return 0;
	}


}

