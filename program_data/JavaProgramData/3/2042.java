package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sigma;
		int sb = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			sigma = Integer.parseInt(tempVar2);
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
		for (int j = 0;j < n;j++)
		{
			for (int k = 0;k < n;k++)
			{
				if (k == j)
				{
					continue;
				}
				else if (k != j)
				{
					if (sz[j] + sz[k] == sigma)
					{
						sb = 1;
						break;
					}
				}
			}
			if (sb == 1)
			{
				break;
			}
		}
		if (sb == 1)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}
}

