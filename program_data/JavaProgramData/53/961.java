package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int a;
		int b = 1;
		int j;
		int[] sz = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(sz[0]) = Integer.parseInt(tempVar2);
		}
		for (i = 1;i < n;i++)
		{
			j = 0;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a = Integer.parseInt(tempVar3);
			}
			for (m = 0;m < b;m++)
			{
				if (sz[m] == a)
				{
					j += 1;
				}
			}
			if (j == 0)
			{
				sz[b] = a;
				b += 1;
			}
		}
		int c = 0;
		for (i = 0;i < b;i++)
		{
			if (c > 0)
			{
				System.out.printf(",%d",sz[i]);
			}
			else
			{
				System.out.printf("%d",sz[i]);
			}
			c++;
		}
		return 0;
	}
}

