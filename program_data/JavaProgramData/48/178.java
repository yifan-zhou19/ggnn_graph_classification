package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] shu = new int[9][9];
		int[][] qi = new int[9][9];
		int i;
		int j;
		int k;
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(shu, 0, (Integer.SIZE / Byte.SIZE));
		shu[4][4] = m;
		for (i = 1; i <= n; i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(qi, 0, (Integer.SIZE / Byte.SIZE));
			for (j = 0; j < 9; j++)
			{
				for (k = 0; k < 9; k++)
				{
					if (shu[j][k] != 0)
					{
						qi[j][k + 1] = qi[j][k + 1] + shu[j][k];
						qi[j][k - 1] = qi[j][k - 1] + shu[j][k];
						qi[j - 1][k] = qi[j - 1][k] + shu[j][k];
						qi[j + 1][k] = qi[j + 1][k] + shu[j][k];
						qi[j + 1][k + 1] = qi[j + 1][k + 1] + shu[j][k];
						qi[j + 1][k - 1] = qi[j + 1][k - 1] + shu[j][k];
						qi[j - 1][k + 1] = qi[j - 1][k + 1] + shu[j][k];
						qi[j - 1][k - 1] = qi[j - 1][k - 1] + shu[j][k];
						shu[j][k] = shu[j][k] * 2;
					}
				}
			}
			for (j = 0; j < 9; j++)
			{
				for (k = 0; k < 9; k++)
				{
					shu[j][k] = shu[j][k] + qi[j][k];
				}
			}
		}
		for (i = 0; i < 9; i++)
		{
			for (j = 0; j < 9; j++)
			{
				if (j == 8)
				{
					System.out.print(shu[i][j]);
					System.out.print("\n");
				}
				else
				{
					System.out.print(shu[i][j]);
					System.out.print(" ");
				}
			}
		}
		return 0;
	}
}

