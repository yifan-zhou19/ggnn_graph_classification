package <missing>;

public class GlobalMembers
{
	public static int Main() //????
	{
		int l;
		int m;
		int n;
		int[][] a = new int[110][110];
		int[][] b = new int[110][110];
		int[][] c = new int[110][110];
		l = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < l;i++) //?????
		{
			for (int j = 0;j < m;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < m;i++) //?????
		{
			for (int j = 0;j < n;j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0;i < l;i++) //???????
		{
			for (int j = 0;j < n;j++)
			{
				c[i][j] = 0;
				for (int k = 0;k < m;k++)
				{
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j]);
				if (j == n - 1)
				{
					System.out.print("\n");
				}
				else
				{
					System.out.print(' ');
				}
			}
		}
		return 0;
	}


}

