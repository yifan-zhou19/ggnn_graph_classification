package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int b = 0;
		int i;
		int j;
		int c = 0;
		int d = 0;
		int[][] sz = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i][j] = Integer.parseInt(tempVar2);
			}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 1;j++)
			{
				if ((sz[i][j] == 0 && sz[i][j + 1] == 1) || (sz[i][j] == 1 && sz[i][j + 1] == 2) || (sz[i][j] == 2 && sz[i][j + 1] == 0))
				{
					c++;
				}
				else if ((sz[i][j] == 1 && sz[i][j + 1] == 0) || (sz[i][j] == 2 && sz[i][j + 1] == 1) || (sz[i][j] == 0 && sz[i][j + 1] == 2))
				{
					d++;
				}
			}
		}
		if (c > d)
		{
			System.out.print("A");
		}
		else if (d > c)
		{
		System.out.print("B");
		}
		else
		{
		System.out.print("Tie");
		}
		return 0;
	}

}

