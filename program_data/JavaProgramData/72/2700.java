package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[][] A = new int[25][25];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 25;i++)
		{
			for (j = 0;j < 25;j++)
			{
				A[i][j] = 0;
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= m;j++)
			{
				A[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= m;j++)
			{
				if (A[i + 1][j] - A[i][j] <= 0 && A[i][j + 1] - A[i][j] <= 0 && A[i - 1][j] - A[i][j] <= 0 && A[i][j - 1] - A[i][j] <= 0)
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

