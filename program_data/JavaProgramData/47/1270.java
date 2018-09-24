package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[100];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 1;i <= n;i++)
		{
			if (i < n)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i - 1] = Integer.parseInt(tempVar2);
				}
			}
			else
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i - 1] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = n;i >= 1;i--)
		{
			if (i > 1)
			{
				System.out.printf("%d ",sz[i - 1]);
			}
			else
			{
				System.out.printf("%d",sz[i - 1]);
			}
		}
		return 0;
	}
}

