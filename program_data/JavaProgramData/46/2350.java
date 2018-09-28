package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int row;
	  int col;
	  int[][] a = new int[100][100];
	  int i;
	  int j;
	  int k;
	  int[][] b = new int[100][100];
	  row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (i = 0;i <= row - 1;i++)
	  {
	   for (j = 0;j <= col - 1;j++)
	   {
			a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b[i][j] = 0;
	   }
	  }
	  if (row == 1)
	  {
		   for (i = 0;i <= col - 1;i++)
		   {
			   System.out.print(a[0][i]);
			   System.out.print("\n");
		   }
	  }
	else
	{
	  for (i = 0;i <= (col - 1) / 2;i++)
	  {
		   for (k = i;k <= col - i - 1;k++)
		   {
			if (b[i][k] == 0)
			{
				System.out.print(a[i][k]);
				System.out.print("\n");
				b[i][k] = 1;
			}
		   }
		for (k = i + 1;k <= row - 2 - i;k++)
		{
			if (b[k][col - 1 - i] == 0)
			{
				System.out.print(a[k][col - 1 - i]);
				System.out.print("\n");
				b[k][col - 1 - i] = 1;
			}
		}
		for (k = col - 1 - i;k >= i;k--)
		{
			if (b[row - 1 - i][k] == 0)
			{
				System.out.print(a[row - 1 - i][k]);
				System.out.print("\n");
				b[row - 1 - i][k] = 1;
			}
		}
		for (k = row - 2 - i;k >= i + 1;k--)
		{
			if (b[k][i] == 0)
			{
				System.out.print(a[k][i]);
				System.out.print("\n");
				b[k][i] = 1;
			}
		}
	  }
	}
	 return 0;
	}
}

