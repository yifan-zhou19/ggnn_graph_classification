package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int cnt = 0;
		int i;
		int j;
		int row;
		int col;
		int l = 0;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		cnt = row * col;
		for (i = 0 ;i < row;i++)
		{
			for (j = 0 ; j < col ;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		while (cnt > 0)
		{
			for (j = l;j < (col - l);j++)
			{
				System.out.print(a[l][j]);
				System.out.print("\n");
				cnt--;
			}
			if (cnt == 0)
			{
				break;
			}
			for (i = (l + 1);i < row - l;i++)
			{
				System.out.print(a[i][col - l - 1]);
				System.out.print("\n");
				cnt--;
			}
			if (cnt == 0)
			{
				break;
			}
			for (j = col - l - 2;j > l - 1;j--)
			{
				System.out.print(a[row - l - 1][j]);
				System.out.print("\n");
				cnt--;
			}
			if (cnt == 0)
			{
				break;
			}
			for (i = row - l - 2;i > l;i--)
			{
				System.out.print(a[i][l]);
				System.out.print("\n");
				cnt--;
			}
			l++;
		}
		return 0;
	}


}

