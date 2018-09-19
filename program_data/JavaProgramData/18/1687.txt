package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int n;
		int sum;
		int Min;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int num = 0; num < n; num++) //n???
		{
			sum = 0;
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n; j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (int x = 1; x < n; x++) //n-1???
			{
				for (int i = 0; i < n; i++) //hang gui ling
				{
					Min = 10000;
					for (int col = 0; col < n; col++)
					{
						if (a[i][col] >= 0)
						{
							Min = Min < a[i][col] != 0 ? Min : a[i][col];
						}
					}
					for (int col = 0; col < n; col++)
					{
						a[i][col] -= Min;
					}
				}
				for (int i = 0; i < n; i++) //lie gui ling
				{
					Min = 10000;
					for (int row = 0; row < n; row++)
					{
						if (a[row][i] >= 0)
						{
							Min = Min < a[row][i] != 0 ? Min : a[row][i];
						}
					}
					for (int row = 0; row < n; row++)
					{
						a[row][i] -= Min;
					}
				}
				sum += a[x][x];
				for (int i = 0; i < n; i++)
				{
					a[x][i] = -1;
				}
				for (int i = 0; i < n; i++)
				{
					a[i][x] = -1; //-1 dai biao mei you zhe yi hang
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

