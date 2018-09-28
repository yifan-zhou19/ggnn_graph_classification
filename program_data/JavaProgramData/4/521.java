package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int row;
		int col;
		int i;
		int j;
		int p;
		int q;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < col; i++)
		{
			p = 0;
			q = i;
			do
			{
				System.out.print(a[p][q]);
				System.out.print("\n");
				p++;
				q--;
			} while (q >= 0 && p < row);
		}
		for (i = 1; i < row; i++)
		{
			p = i;
			q = col - 1;
			do
			{
				System.out.print(a[p][q]);
				System.out.print("\n");
				p++;
				q--;
			} while (p < row && q >= 0);
		}
		return 0;
	}
}

