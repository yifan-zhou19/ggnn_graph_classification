package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0;
		int n = 0;
		int i = 0; //??????m,n???????????????????????i,j,k??????0?
		int j = 0;
		int k = 0;
		int[][] total = new int[11][11]; //????total,born??????????????????
		int[][] born = new int[11][11];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		total[5][5] = m;
		for (k = 0;k < n;k++) //??????
		{
			for (i = 1;i < 10;i++) //??????????????
			{
				for (j = 1;j < 10;j++)
				{
					born[i][j] = 2 * total[i][j] + total[i - 1][j] + total[i - 1][j - 1] + total[i - 1][j + 1] + total[i][j - 1] + total[i][j + 1] + total[i + 1][j - 1] + total[i + 1][j] + total[i + 1][j + 1];
				}
			}
			for (i = 1;i < 10;i++) //???????
			{
				for (j = 1;j < 10;j++)
				{
					total[i][j] = born[i][j];
				}
			}
			for (i = 1;i < 10;i++) //born?????
			{
				for (j = 1;j < 10;j++)
				{
					born[i][j] = 0;
				}
			}
		}
			for (i = 1;i < 10;i++) //?????
			{
				for (j = 1;j < 10;j++)
				{
					System.out.print(total[i][j]);
					if (j == 9)
					{
						System.out.print("\n");
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
		return 0;
	}
}

