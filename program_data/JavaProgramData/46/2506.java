package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int row = 0;
		int col = 0;
		int count = 0;
		int k = 0;
		int l = 0;
		int m = 0;
		int[][] a = new int[110][110];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		} //????????
		int total = row * col;
		for (i = 0;count < total;i++) //???????????row?col??????
		{
			for (j = i;j < col - i;j++)
			{
				System.out.print(a[i][j]);
				System.out.print('\n');
				count++;
			}
			if (count >= total)
			{
				break;
			}
			for (k = i + 1;k < row - i;k++)
			{
				System.out.print(a[k][col - i - 1]);
				System.out.print('\n');
				count++;
			}
			if (count >= total)
			{
				break;
			}
			for (l = col - i - 2;l >= i;l--)
			{
				System.out.print(a[row - i - 1][l]);
				System.out.print('\n');
				count++;
			}
			if (count >= total)
			{
				break;
			}
			for (m = row - i - 2;m >= i + 1;m--)
			{
				System.out.print(a[m][i]);
				System.out.print('\n');
				count++;
			} //??????????????,????????????????????
		}
		return 0;
	}
}

