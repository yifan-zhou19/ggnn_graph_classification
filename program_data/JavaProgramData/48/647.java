package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][][] n = new int[5][9][9];
		int a;
		int b;
		int k = 0;
		int i;
		int j;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(n,0,(Integer.SIZE / Byte.SIZE));
		n[0][4][4] = a;
		for (i = 1;i <= b;i++)
		{
			for (j = 0;j < 9;j++)
			{
				for (k = 0;k < 9;k++)
				{
					n[i][j][k] = n[i - 1][j][k] * 2;
					if (j > 0)
					{
						n[i][j][k] += n[i - 1][j - 1][k];
						if (k > 0)
						{
							n[i][j][k] += n[i - 1][j - 1][k - 1];
						}
						if (k < 8)
						{
							n[i][j][k] += n[i - 1][j - 1][k + 1];
						}
					}
					if (k > 0)
					{
						n[i][j][k] += n[i - 1][j][k - 1];
					}
					if (k < 8)
					{
						n[i][j][k] += n[i - 1][j][k + 1];
					}
					if (j < 8)
					{
						n[i][j][k] += n[i - 1][j + 1][k];
						if (k > 0)
						{
							n[i][j][k] += n[i - 1][j + 1][k - 1];
						}
						if (k < 8)
						{
							n[i][j][k] += n[i - 1][j + 1][k + 1];
						}
					}
				}
			}
		}
		for (i = 0;i < 9;i++)
		{
			System.out.print(n[b][i][0]);
			for (j = 1;j < 9;j++)
			{
				System.out.print(' ');
				System.out.print(n[b][i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}

}

