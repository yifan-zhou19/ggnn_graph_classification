package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][][] f = new int[2][15][15];
		int i;
		int j;
		int k;
		int m;
		int n;
		int p;
		int q;
		int t;
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
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(f, 0, (Integer.SIZE / Byte.SIZE));
		f[0][5][5] = m;
		p = 0;
		q = 1;
		for (k = 1; k <= n; k++)
		{
			for (i = 1; i <= 9; i++)
			{
				for (j = 1; j <= 9; j++)
				{
					f[q][i][j] = 0;
				}
			}
			for (i = 1; i <= 9; i++)
			{
				for (j = 1; j <= 9; j++)
				{
					if (f[p][i][j] != 0)
					{
						f[q][i][j] += f[p][i][j] * 2;
						f[q][i - 1][j - 1] += f[p][i][j];
						f[q][i - 1][j] += f[p][i][j];
						f[q][i - 1][j + 1] += f[p][i][j];
						f[q][i][j - 1] += f[p][i][j];
						f[q][i][j + 1] += f[p][i][j];
						f[q][i + 1][j - 1] += f[p][i][j];
						f[q][i + 1][j] += f[p][i][j];
						f[q][i + 1][j + 1] += f[p][i][j];
					}
				}
			}
			t = p;
			p = q;
			q = t;
		}
		for (i = 1; i <= 9; i++)
		{
			for (j = 1; j < 9; j++)
			{
				System.out.printf("%d ", f[p][i][j]);
			}
			System.out.printf("%d\n", f[p][i][9]);
		}
		return 0;
	}

}

