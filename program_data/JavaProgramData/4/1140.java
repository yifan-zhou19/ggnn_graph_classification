package <missing>;

public class GlobalMembers
{
	//2013.1.4
	//zwb

	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int cnt = 1;
		int[][] a = new int[201][201];
		int[] b = new int[10001];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= 200; i++)
		{
			for (j = 1; j <= 200; j++)
			{
				a[i][j] = -1;
			}
		}
		for (i = 1; i <= row; i++)
		{
			for (j = 1; j <= col; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		i = 1, j = 1;
		while (cnt <= row * col)
		{
			if (a[i][j] != -1)
			{
				b[cnt++] = a[i][j];
			}
			if (j == 1 || i == row)
			{
				j = i + j;
				i = 1;
			}
			else
			{
				i = i + 1;
				j = j - 1;
			}
		}
		for (i = 1; i <= row * col; i++)
		{
			System.out.print(b[i]);
			System.out.print("\n");
		}
		return 0;
	}







}

