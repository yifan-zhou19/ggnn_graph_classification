package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[row][col];
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int n = 0; //n??????1


		while ((n < row / 2) && (n < col / 2)) //??????????
		{
			for (j = n;j <= col - 2 - n;j++)
			{
				System.out.print(a[n][j]);
				System.out.print("\n");
			}
			for (i = n;i <= row - 2 - n;i++)
			{

				System.out.print(a[i][col - 1 - n]);
				System.out.print("\n");
			}

			for (j = col - 1 - n;j >= 1 + n;j--)
			{

		   System.out.print(a[row - 1 - n][j]);
		   System.out.print("\n");
			}

			for (i = row - 1 - n;i >= 1 + n;i--)
			{
				System.out.print(a[i][n]);
				System.out.print("\n");
			}
			n++;
		}
		//??????????
			for (j = n;j <= col - 1 - n;j++)
			{
				System.out.print(a[n][j]);
				System.out.print("\n");
			}
			if (row - 1 - 2 * n > 0) //???????????
			{
			for (i = n + 1;i <= row - 1 - n;i++)
			{
			System.out.print(a[i][col - 1 - n]);
			System.out.print("\n");
			}

			if (col - 2 - 2 * n > 0) //??????????
			{
			for (j = col - 2 - n;j >= n;j--)
			{
				System.out.print(a[row - 1 - n][j]);
			}
			}
			}
	}

}

