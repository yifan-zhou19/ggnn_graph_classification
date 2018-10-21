package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] sz = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(sz[0]) = Integer.parseInt(tempVar2);
		}
		for (int i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar3);
			}
		}
		System.out.printf("%d",sz[0]);
		for (int j = 1;j < n;j++)
		{
			for (m = 0;m < j;m++)
			{

				if (sz[j] == sz[m])
				{
					break;
				}
			}
			if (sz[j] != sz[j - 1] && m == j)
			{
				System.out.print(",");
				System.out.printf("%d",sz[j]);
			}
		}
		return 0;

	}

}

