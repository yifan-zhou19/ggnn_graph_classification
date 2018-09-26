package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int[] sz = new int[1000];
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
	for (int i = 0;i < n;i++)
	{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
	}
	for (int j = 0;j < n - 1;j++)
	{
			for (int l = j + 1;l < n;l++)
			{
					if (sz[j] + sz[l] == k)
					{
									  System.out.print("yes");
									  return 0;
					}
			}
	}
			System.out.print("no");
	  return 0;
	}
}

