package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[1000];
		int a;
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			for (int j = 0;j < a;j++)
			{
				if (j == 0 || j == 1)
				{
					sz[j] = 1;
				}
				else
				{
					 sz[j] = sz[j - 1] + sz[j - 2];
				}
			}
			System.out.printf("%d\n",sz[a - 1]);
		}
		return 0;
	}


}

