package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int a = 1;
		int i;
		int j;
		int[] sz = new int[1000];
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (sz[i] + sz[j] == k)
				{
					a = 0;


				}
			}
		}
		while (a == 0)
		{
			System.out.print("yes");
			break;
		}

		while (a != 0)
		{
			System.out.print("no");
			break;
		}
		return 0;
	}

}

