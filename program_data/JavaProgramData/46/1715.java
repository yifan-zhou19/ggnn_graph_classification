package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int l;
		int p;
		int q;
		int count;
		int[][] a = new int[100][100];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		p = (row + 1) / 2;
		q = (col + 1) / 2;
		count = 0;
		for (i = 1;i <= row;i++)
		{
			for (j = 1;j <= col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		if (row <= col != 0 && row % 2 == 1)
		{
			for (i = 1;i <= row / 2;i++)
			{
				for (j = i;j <= col - i + 1;j++)
				{
					 System.out.print(a[i][j]);
					 System.out.print("\n");
					 count++;
				}
				 for (l = i + 1;l <= row - i + 1;l++)
				 {
					 System.out.print(a[l][col - i + 1]);
					 System.out.print("\n");
					 count++;
				 }
				 for (j = col - i;j >= i;j--)
				 {
					 System.out.print(a[row - i + 1][j]);
					 System.out.print("\n");
					 count++;
				 }
				 for (l = row - i;l >= i + 1;l--)
				 {
					 System.out.print(a[l][i]);
					 System.out.print("\n");
					 count++;
				 }
			}
			for (j = (row + 1) / 2;j <= col - (row - 1) / 2;j++)
			{
				System.out.print(a[p][j]);
				System.out.print("\n");
			}
		}
		else if (row > col && col % 2 == 1)
		{
			for (i = 1;i <= col / 2;i++)
			{
				for (j = i;j <= col - i + 1;j++)
				{
					 System.out.print(a[i][j]);
					 System.out.print("\n");
					 count++;
				}
				 for (l = i + 1;l <= row - i + 1;l++)
				 {
					 System.out.print(a[l][col - i + 1]);
					 System.out.print("\n");
					 count++;
				 }
				 for (j = col - i;j >= i;j--)
				 {
					 System.out.print(a[row - i + 1][j]);
					 System.out.print("\n");
					 count++;
				 }
				 for (l = row - i;l >= i + 1;l--)
				 {
					 System.out.print(a[l][i]);
					 System.out.print("\n");
					 count++;
				 }
			}
			for (i = (col + 1) / 2;i <= row - (col - 1) / 2;i++)
			{
				System.out.print(a[i][q]);
				System.out.print("\n");
			}
		}
		else
		{
		for (i = 1;i <= row / 2;i++)
		{
			 if (count == row * col)
			 {
				 break;
			 }
			 else
			 {
				 for (j = i;j <= col - i + 1;j++)
				 {
					 System.out.print(a[i][j]);
					 System.out.print("\n");
					 count++;
				 }
				 for (l = i + 1;l <= row - i + 1;l++)
				 {
					 System.out.print(a[l][col - i + 1]);
					 System.out.print("\n");
					 count++;
				 }
				 for (j = col - i;j >= i;j--)
				 {
					 System.out.print(a[row - i + 1][j]);
					 System.out.print("\n");
					 count++;
				 }
				 for (l = row - i;l >= i + 1;l--)
				 {
					 System.out.print(a[l][i]);
					 System.out.print("\n");
					 count++;
				 }
			 }
		}
		}
		return 0;
	}
}

