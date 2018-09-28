package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int[] sz = new int[50000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n + 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (sz[i] + sz[j] == k)
				{
					System.out.print("yes");
					j = n;
					i = n + 1;
				}
			}
			if (i == n)
			{
				System.out.print("no");
			}
		}
		return 0;
	}

}

