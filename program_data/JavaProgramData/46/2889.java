package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] flag = new int[100][100];
		int i;
		int j;
		int row;
		int col;
		int count = 0;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < row; i++)
		{
		 for (j = 0; j < col; j++)
		 {
			  a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
		}
		int hang1 = 0;
		int hang2 = row - 1;
		int lie1 = col - 1;
		int lie2 = 0;
		while (count < row * col)
		{
			   for (j = 0; j < col; j++)
			   {
					if (flag[hang1][j] == 0)
					{
						System.out.print(a[hang1][j]);
						System.out.print("\n");
						count++;
						flag[hang1][j] = 1;
					}
			   }
			   hang1++;
			   for (i = 0; i < row; i++)
			   {
					if (flag[i][lie1] == 0)
					{
						System.out.print(a[i][lie1]);
						System.out.print("\n");
						count++;
						flag[i][lie1] = 1;
					}
			   }
			   lie1--;
			   for (j = col - 1; j >= 0; j--)
			   {
					if (flag[hang2][j] == 0)
					{
						System.out.print(a[hang2][j]);
						System.out.print("\n");
						count++;
						flag[hang2][j] = 1;
					}
			   }
			   hang2--;
			   for (i = row - 1; i >= 0; i--)
			   {
					if (flag[i][lie2] == 0)
					{
						System.out.print(a[i][lie2]);
						System.out.print("\n");
						count++;
						flag[i][lie2] = 1;
					}
			   }
			   lie2++;
		}
		return 0;
	}


}

