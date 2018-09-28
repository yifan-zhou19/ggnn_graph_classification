package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m; //?? ???????? ??
		int n;
		int i; //????
		int j;
		int k;
		int p;
		int q;
		int[][][] b = new int[9][9][5]; //?? ????0 b???? b[i][j][k]???i??j??k?
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		b[4][4][0] = m;
		//printf("%d", b[8][8][3]);

		for (i = 1;i <= n;i++) //??????
		{
			for (j = 1;j < 8;j++)
			{
				for (k = 1;k < 8;k++)
				{
					while (b[j][k][i - 1] != 0)
					{
						//printf("xunhuan");
						b[j][k + 1][i] += b[j][k][i - 1];
						b[j][k - 1][i] += b[j][k][i - 1];
						b[j - 1][k - 1][i] += b[j][k][i - 1];
						b[j - 1][k][i] += b[j][k][i - 1];
						b[j - 1][k + 1][i] += b[j][k][i - 1];
						b[j + 1][k - 1][i] += b[j][k][i - 1];
						b[j + 1][k][i] += b[j][k][i - 1];
						b[j + 1][k + 1][i] += b[j][k][i - 1];
						b[j][k][i] += 2 * b[j][k][i - 1];
						break;
					}
				}
			}
		}
		for (p = 0;p <= 8;p++)
		{
			for (q = 0;q < 8;q++)
			{
				System.out.printf("%d ", b[p][q][n]);
			}
			System.out.printf("%d\n", b[p][8][n]);
		}

		return 0;
	}
}

