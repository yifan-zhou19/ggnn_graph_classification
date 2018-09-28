package <missing>;

public class GlobalMembers
{
	//ifstream fin("d:\\in.in");
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= m;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 1;i <= m;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j + 1])
				{
					b[i][j] = 1;
				}
			}
		}
		for (int i = 1;i <= m;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				if (b[i][j] != 0)
				{
					System.out.print(i - 1);
					System.out.print(' ');
					System.out.print(j - 1);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}


}

