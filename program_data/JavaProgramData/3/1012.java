package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[1001];
		int n;
		int i;
		int j;
		int k;
		int m;
		m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (sz[i] + sz[j] == k)
				{
					m = 1;
					System.out.print("yes");
					break;
				}

			}
			if (m == 1)
			{
				break;
			}
		}
		if (m == 0)
		{
			System.out.print("no");
		}
		return 0;
	}



}

