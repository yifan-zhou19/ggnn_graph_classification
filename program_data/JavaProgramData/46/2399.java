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
		int[][] b = new int[100][100];
		int num = 0;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= row - 1; i++)
		{
				for (j = 0; j <= col - 1; j++)
				{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
		}
		i = 0;
		j = 0;
		while (true)
		{
			while (j != col && b[i][j] == 0)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");
				b[i][j] = 1;
				num++;
				j++;
			}
			j--;
			i++;
			while (i != row && b[i][j] == 0)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");
				b[i][j] = 1;
				num++;
				i++;
			}
			i--;
			j--;
			while (j != -1 && b[i][j] == 0)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");
				b[i][j] = 1;
				num++;
				j--;
			}
			j++;
			i--;
			while (i != -1 && b[i][j] == 0)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");
				b[i][j] = 1;
				num++;
				i--;
			}
			i++;
			j++;
			if (num == row * col)
			{
				break;
			}
		}
	 return 0;
	}
}

