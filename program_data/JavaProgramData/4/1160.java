package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[102][102];
		int row;
		int col;
		int t;
		int k;
		int i;
		int j;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		t = row + col - 2;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (k = 0;k <= t;k++)
		{
			if (k + 1 <= col)
			{
				i = 0;
			}
			else
			{
				i = k - col + 1;
			}
			j = k - i;
			while (j >= 0 && i < row)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");
				i++;
				j--;
			}
		}
		return 0;
	}










}

