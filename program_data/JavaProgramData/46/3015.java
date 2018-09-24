package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[101][101];
		int row;
		int col;
		int i;
		int j;
		int k;
		int h;
		int counter = 0;
		int mul;

		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		mul = row * col;
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		if (col % 2 == 0)
		{
			h = col / 2;
		}
		else
		{
			h = col / 2 + 1;
		}
		for (k = 0; k < h; k++)
		{
			for (i = k, j = k; j < col - k; j++)
			{
				if (counter < mul)
				{
					System.out.print(a[i][j]);
					System.out.print("\n");
				}
				counter++;
			}
			j--;
			for (i = 1 + k; i < row - k; i++)
			{
				if (counter < mul)
				{
					System.out.print(a[i][j]);
					System.out.print("\n");
				}
				counter++;
			}
			i--;
			for (j = col - 2 - k; j >= k; j--)
			{
				if (counter < mul)
				{
					System.out.print(a[i][j]);
					System.out.print("\n");
				}
				counter++;
			}
			j++;
			for (i = row - 2 - k; i > k; i--)
			{
				if (counter < mul)
				{
					System.out.print(a[i][j]);
					System.out.print("\n");
				}
				counter++;
			}
			i++;
		}
		  return 0;
	}

}

