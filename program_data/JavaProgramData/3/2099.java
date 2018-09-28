package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
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
		int[] sz = new int[1000];
		for (int i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		int j;
		int m;
		for (j = 0;j < n;j++)
		{
			for (m = 0;m < n;m++)
			{
				if (j == m)
				{
					System.out.print("");
				}
				else if (sz[j] + sz[m] == k)
				{
					System.out.print("yes");
					break;
				}
			}
			if (sz[j] + sz[m] == k)
			{
				break;
			}
		}
		if (j == n && m == n)
		{
			System.out.print("no");
		}
		return 0;
	}
}

