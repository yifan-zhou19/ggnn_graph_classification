package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0; //????????
		int n = 0;
		int[][] a = new int[21][21]; //????
		int i = 0;
		int j = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < m ; i++)
		{
			for (j = 0 ; j < n ; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < m; i++)
		{
			for (j = 0 ; j < n; j++)
			{
				int flag = 1; //???????????????
				if ((i - 1 >= 0) && (a[i - 1][j] > a[i][j]))
				{
					flag = 0;
				}
				if ((j - 1 >= 0) && (a[i][j - 1] > a[i][j]))
				{
					flag = 0;
				}
				if ((i + 1 < m) && (a[i + 1][j] > a[i][j]))
				{
					flag = 0;
				}
				if ((j + 1 < n) && (a[i][j + 1] > a[i][j]))
				{
					flag = 0;
				}
				if (flag == 1)
				{
					System.out.print(i);
					System.out.print(' ');
					System.out.print(j);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

