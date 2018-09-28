package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] sz = new int[100];
		int[] chance = new int[100];
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
		for (j = 0;j < n - 1;j++)
		{
			chance[j] = sz[i - 1];
			System.out.printf("%d ",chance[j]);
			i--;
		}
		j += 1;
		chance[j] = sz[i - 1];
		System.out.printf("%d",chance[j]);
		return 0;
	}

}

