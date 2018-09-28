package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] sz = new int[199][2];
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
				(sz[i][0]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(sz[i][1]) = Integer.parseInt(tempVar3);
			}
		}
		j = 0;
		for (i = 0;i < n;i++)
		{
			if (sz[i][1] - sz[i][0] == 1 || sz[i][0] - sz[i][1] == 2)
			{
				j++;
			}
			if (sz[i][1] - sz[i][0] == -1 || sz[i][0] - sz[i][1] == -2)
			{
				j--;
			}
		}
		if (j > 0)
		{
			System.out.print("A");
		}
		if (j == 0)
		{
			System.out.print("Tie");
		}
		if (j < 0)
		{
			System.out.print("B");
		}
		return 0;
	}
}

