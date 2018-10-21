package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int i;
		int[][] sz = new int[ROW][COL];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			for (m = 0;m < 2;m++)
			{
				String tempVar2 = ConsoleInput.scanfRead(" ");
				if (tempVar2 != null)
				{
					(sz[k][m]) = Integer.parseInt(tempVar2);
				}
			}
		}
		i = 0;
		for (k = 0;k < n;k++)
		{
			if ((sz[k][0]) == (sz[k][1]) + 1 || (sz[k][0]) == (sz[k][1]) - 2)
			{
				i--;
			}
			if ((sz[k][0]) == (sz[k][1]) - 1 || (sz[k][0]) == (sz[k][1]) + 2)
			{
				i++;
			}
		}
		if (i > 0)
		{
			System.out.print("A");
		}
		if (i < 0)
		{
			System.out.print("B");
		}
		if (i == 0)
		{
			System.out.print("Tie");
		}
		return 0;
	}
}

