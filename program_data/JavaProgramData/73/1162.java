package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[5][5];
		int[][] ss = new int[5][5];
		int i;
		int j;
		int[] h = new int[5];
		int[] l = new int[5];
		int a;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[i][j] = Integer.parseInt(tempVar);
				}
				ss[i][j] = sz[i][j];
			}
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 1;j < 5;j++)
			{
				if (sz[i][j - 1] > sz[i][j])
				{
					a = sz[i][j];
					sz[i][j] = sz[i][j - 1];
					sz[i][j - 1] = a;
				}
			}
			h[i] = sz[i][4];
		}
		for (j = 0;j < 5;j++)
		{
			for (i = 1;i < 5;i++)
			{
				if (ss[i - 1][j] < ss[i][j])
				{
					a = ss[i][j];
					ss[i][j] = ss[i - 1][j];
					ss[i - 1][j] = a;
				}
			}
			l[j] = ss[4][j];
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (h[i] == l[j])
				{
					System.out.printf("%d %d %d",i + 1,j + 1,l[j]);
					break;
				}
			}
			if (j != 5)
			{
				break;
			}
		}
		if (i == 5 && j == 5 && h[4] != l[4])
		{
			System.out.print("not found");
		}
		return 0;
	}

}

