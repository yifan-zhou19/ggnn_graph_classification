package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int i;
		int j;
		int[] sz = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			if (a == 1 || a == 2)
			{
				sz[a - 1] = 1;
			}
			else
			{
				for (j = 2;j < a;j++)
				{
					sz[0] = 1;
					sz[1] = 1;
					sz[j] = sz[j - 2] + sz[j - 1];
				}
			}
			System.out.printf("%d\n",sz[a - 1]);
		}
		return 0;
	}

}

