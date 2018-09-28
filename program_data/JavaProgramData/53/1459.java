package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz = new int[300];
		int[] sz1 = new int[300];
		int i = 0;
		int j = 0;
		int i1 = 0;
		int b = 0;
		int m = 0;
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
		System.out.printf("%d",sz[0]);
		sz1[0] = sz[0];
		i = 1;
		for (i = 1;i < n;i++)
		{
			for (i1 = 0;i1 <= j;i1++)
			{
				b = 0;
				if (sz1[i1] == sz[i])
				{
					b = 1;
					break;
				}
			}
			if (b == 0)
			{
				j++;
				sz1[j] = sz[i];
			}
		}
		for (i1 = 1;i1 <= j;i1++)
		{
			System.out.printf(",%d",sz1[i1]);
		}
		return 0;
	}




}

