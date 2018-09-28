package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int k;
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
		int[] num = new int[1500];
		int[] sz = new int[1500];
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(num[i]) = Integer.parseInt(tempVar3);
			}
			sz[i] = num[i];
		}
		for (i = 0;i < n;i++)
		{
			for (j = i;j < n;j++)
			{
				if (num[i] + sz[j] == k)
				{
					System.out.print("yes");
					break;
				}
					if ((i == n - 1) && (j == n - 1))
					{
						System.out.print("no");
					}

			}
			if (num[i] + sz[j] == k)
			{
					break;
			}
		}
		return 0;
	}
}

