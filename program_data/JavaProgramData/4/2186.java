package <missing>;

public class GlobalMembers
{
	//******************************************
	//*????????????.cpp           **
	//*??: ??     1100012808              **
	//*???2011.10.31                       **
	//******************************************
	public static int Main() //???
	{ //?????
		int row;
		int col;
		int[][] array = new int[100][100];
		int i = 0;
		int j = 0;
		int[][] flag = new int[100][100];
		int k = 0;
		int l = 1;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < (row * col); i++)
		{
			array[i / col][i % col] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		i = 0;
		for (k = 0; k < col; k++)
		{
			j = k;
			for (i = 0; i < row; i++)
			{
				if ((j != -1) && (i != row))
				{
					System.out.print(array[i][j]);
					System.out.print("\n");
					j--;
				}
				else
				{
					break;
				}
			}
			if (k == col - 1)
			{
				i = 1;
				for (l = 1; l < row; l++)
				{
					j = col - 1;
					for (i = l; (j != -1) && (i != row); i++)
					{
						System.out.print(array[i][j]);
						System.out.print("\n");
						j--;
					}
				}
			}
		}
		return 0;
	}






}

