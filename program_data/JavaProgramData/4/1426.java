package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int col;
		int row;
		int[][] sz = new int[100][100];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int l;
			int m;
		for (l = 0;l < row;l++)
		{
			for (m = 0;m < col;m++)
			{
				sz[l][m] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int i;
		int j;
		int k;

		for (k = 0;k < row + col - 1;k++)
		{
		for (i = 0;i < row;i++)
		{
				for (j = 0;j < col;j++)
				{
					if (k == i + j)
					{
						System.out.print(sz[i][j]);
						System.out.print("\n");
					}
					if (i + j > k)
					{
						break;
					}

				}
		}
		}





		return 0;
	}


}

