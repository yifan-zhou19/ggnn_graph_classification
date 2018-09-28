package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz = new int[1000];
		int k;
		int j;
		int i;
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
			if (i == 0)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i] = Integer.parseInt(tempVar3);
				}
			}
			else
			{
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				sz[i] = Integer.parseInt(tempVar4);
			}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (sz[i] + sz[j] == k)
				{
					System.out.print("yes");
					m = 1;
					break;
				}
			}
			if (m == 1)
			{
			break;
			}
		}
		if (m != 1)
		{
		System.out.print("no");
		}
		 return 0;
	}
}

