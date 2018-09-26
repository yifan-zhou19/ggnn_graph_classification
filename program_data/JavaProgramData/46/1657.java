package <missing>;

public class GlobalMembers
{
	//???????????????
	//?????11.4
	//????wayne
	public static int Main()
	{
		int row; //n,m???????????
		int col;
		int n;
		int m;
		int[][] a = new int[101][101];
		int i; //row1???i???????,row2????????col1,col2
		int j;
		int row1;
		int row2;
		int col1;
		int col2;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= row;i++)
		{
			for (j = 1;j <= col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = row, j = col;i >= 1 && j >= 1;i = i - 2, j = j - 2) //????????????????
		{
				 row1 = (row - i) / 2 + 1;
				row2 = row - (row - i) / 2;
				col1 = (col - j) / 2 + 1;
				col2 = col - (col - j) / 2; //????row1,row2,col1,col2
			if ((i != 1 && j != 1) || (i == 1 && j == 1))
			{
				 for (m = col1;m <= col2;m++)
				 {
					 System.out.print(a[row1][m]);
					 System.out.print("\n");
				 }
				for (n = row1 + 1;n <= row2;n++)
				{
					 System.out.print(a[n][col2]);
					 System.out.print("\n");
				}
				for (m = col2 - 1;m >= col1;m--)
				{
					 System.out.print(a[row2][m]);
					 System.out.print("\n");
				}
				for (n = row2 - 1;n >= row1 + 1;n--)
				{
					 System.out.print(a[n][col1]);
					 System.out.print("\n");
				}
			}
			else //???????????????1???????
			{
				if (i == 1)
				{
					   for (m = col1;m <= col2;m++)
					   {
						 System.out.print(a[row1][m]);
						 System.out.print("\n");
					   }
				}
				else
				{
					for (n = row1;n <= row2;n++)
					{
						System.out.print(a[n][col1]);
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}
}

