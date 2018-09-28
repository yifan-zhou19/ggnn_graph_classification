package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[100][100];
		int row;
		int col;
		int i;
		int j;
		int l;
		int k;
		int m;
		int t;
		int[][] f = new int[100][100];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		i = 0;
		m = -1;
		k = row * col;
		while (k > 0)
		{
				for (j = m + 1; j < col; j++)
				{
					if (f[i][j] == 0)
					{
						System.out.print(array[i][j]);
						System.out.print('\n');
						k--;
						f[i][j] = 1;
					}
					else
					{
						break;
					}
				}
				for (t = i + 1; t < row; t++)
				{
					if (f[t][j - 1] == 0)
					{
						System.out.print(array[t][j - 1]);
						System.out.print('\n');
						k--;
						f[t][j - 1] = 1;
					}
					else
					{
						break;
					}
				}
				for (l = j - 2; l >= 0; l--)
				{
					if (f[t - 1][l] == 0)
					{
						System.out.print(array[t - 1][l]);
						System.out.print('\n');
						k--;
						f[t - 1][l] = 1;
					}
					else
					{
						break;
					}
				}
				for (m = t - 2; m >= 0; m--)
				{
					if (f[m][l + 1] == 0)
					{
						System.out.print(array[m][l + 1]);
						System.out.print('\n');
						k--;
						f[m][l + 1] = 1;
					}
					else
					{
						break;
					}
				}
				i++;
		}
		return 0;
	}



}

