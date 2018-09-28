package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[5][5];
		int hang;
		int lie;
		int p;
		int i;
		int j;
		int e;
		int n;
		for (hang = 0;hang < 5;hang++)
		{
			for (lie = 0;lie < 5;lie++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[hang][lie] = Integer.parseInt(tempVar);
				}
			}
		}
		for (i = 0,p = 1;i < 5;i++)
		{
			for (j = 0,e = 0;j < 5;j++)
			{
				if (sz[i][j] > e)
				{
					n = j;
				e = sz[i][j];
				}

			}

				if (e <= sz[0][n] != 0 && e <= sz[1][n] != 0 && e <= sz[2][n] != 0 && e <= sz[3][n] != 0 && e <= sz[4][n])
				{
					System.out.printf("%d %d %d\n",i + 1,n + 1,e);
					p = p * 0;
				}
		}
		if (p == 1)
		{
			System.out.print("not found");
		}
		return 0;


	}
}

