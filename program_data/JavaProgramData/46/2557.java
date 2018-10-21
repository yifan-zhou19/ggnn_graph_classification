package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int k;
		int l;
		int m;
		int[][] a = new int[100][100];
		int[] b = new int[10000];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < row ; i++)
		{
			for (j = 0 ; j < col ; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0 ; i <= row / 2 ; i++)
		{
			for (j = i ; j < col - i ; j++)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");
				if (j == col - i - 1)
				{
					for (k = i + 1 ; k < row - i ; k++)
					{
						System.out.print(a[k][j]);
						System.out.print("\n");
						if (k == row - i - 1)
						{
							for (l = col - i - 2 ; l >= i ; l--)
							{
								System.out.print(a[k][l]);
								System.out.print("\n");
								if (l == i)
								{
									for (m = row - i - 2 ; m > i ; m--)
									{
										System.out.print(a[m][l]);
										System.out.print("\n");
									}
								}
							}
						}
					}
				}
			}
		}
	}
}

