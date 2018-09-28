package <missing>;

public class GlobalMembers
{
	//****************************************
	//*??? 
	//*????? 1100012996       *
	//*???2011.10.26**
	//****************************************

	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int l;
		int k;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[100][100];
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		l = 0;
		k = 1;
		if (row == 1 && col == 1)
		{
			System.out.print(a[0][0]);
		}
		else
		{
			for (j = 0; j < row * col;)
			{
				switch (k)
				{
				case 1:
					for (i = l; i < col - l; i++)
					{
						System.out.print(a[l][i]);
						System.out.print("\n");
						j++;
					}
					k++;
					break;
				case 2:
					for (i = l + 1; i < row - 1 - l; i++)
					{
						System.out.print(a[i][col - 1 - l]);
						System.out.print("\n");
						j++;
					}
					k++;
					break;
				case 3:
					for (i = col - l - 1; i >= l; i--)
					{
						System.out.print(a[row - l - 1][i]);
						System.out.print("\n");
						j++;
					}
					k++;
					break;
				case 4:
					for (i = row - l - 2; i > l; i--)
					{
						System.out.print(a[i][l]);
						System.out.print("\n");
						j++;
					}
					k++;
					break;
				default:
					k = 1;
					l++;
					break;
				}
			}
		}
		return 0;
	}

}

