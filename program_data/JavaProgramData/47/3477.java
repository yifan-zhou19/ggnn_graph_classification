package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			if (i != n - 1)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i] = Integer.parseInt(tempVar2);
				}
			}
			else
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i] = Integer.parseInt(tempVar3);
				}
			}
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

