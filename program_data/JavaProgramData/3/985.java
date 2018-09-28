package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int[] sz = new int[1000];
		int m;
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
				(sz[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n - 2;i++)
		{
			for (j = i + 1;j < n - 1;j++)
			{
				for (m = j + 1;m < n;m++)
				{
				   if (sz[i] + sz[j] + sz[m] == k)
				   {
					  System.out.print("yes");
					  return 0;
				   }
				}
			}
		}
			System.out.print("no");
			return 0;
	}

}

