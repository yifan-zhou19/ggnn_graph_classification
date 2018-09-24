package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[100];
		int x;
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			sz[i] = x;
		}
		for (int j = n - 1;j >= 0;j--)
		{
			if (j != 0)
			{
				System.out.printf("%d ",sz[j]);
			}
			else
			{
				System.out.printf("%d",sz[j]);
			}
		}
		return 0;
	}

}

