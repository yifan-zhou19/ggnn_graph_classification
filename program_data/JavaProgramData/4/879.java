package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] array = new int[100][100];
		int i;
		int j;
		int m;
		int n;
		int a = 1;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < row ; i++)
		{
			for (j = 0; j < col; j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		n = 0;
			for (m = 0 ; m < col ; m++)
			{
				j = m;
				i = n;
				do
				{
					if (i >= row != 0 || j < 0)
					{
						break;
					}
					System.out.print(array[i][j]);
					System.out.print("\n");
					i++;
					j--;
				}while (1 != 0);
			}
			for (n = 1; n < row; n++)
			{
				i = n;
				j = col - 1;
				do
				{
					 if (i >= row != 0 || j < 0)
					 {
						 break;
					 }
					System.out.print(array[i][j]);
					System.out.print("\n");
					i++;
					j--;
				}while (1 != 0);
			}
		return 0;
	}
}

