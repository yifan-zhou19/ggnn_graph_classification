package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[9][9]; //?????????????
		int[][] b = new int[9][9];
		int i = 0;
		int j = 0;
		int m = 0;
		int n = 0;
		int k = 0;
		int l = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				a[i][j] = b[i][j] = 0;
			}
		}
		b[4][4] = m;

		while (k < n)
		{
			for (i = 0;i < 9;i++) //???a????????
			{
				for (j = 0;j < 9;j++)
				{
					if (b[i][j] != 0)
					{
						a[i - 1][j - 1] = a[i - 1][j - 1] + b[i][j];
						a[i - 1][j] = a[i - 1][j] + b[i][j];
						a[i - 1][j + 1] = a[i - 1][j + 1] + b[i][j];
						a[i][j - 1] = a[i][j - 1] + b[i][j];
						a[i][j + 1] = a[i][j + 1] + b[i][j];
						a[i + 1][j - 1] = a[i + 1][j - 1] + b[i][j];
						a[i + 1][j] = a[i + 1][j] + b[i][j];
						a[i + 1][j + 1] = a[i + 1][j + 1] + b[i][j];
					}
				}
			}

			for (i = 0;i < 9;i++) //?b???????????
			{
				for (j = 0;j < 9;j++)
				{
					b[i][j] = 2 * b[i][j] + a[i][j];
					a[i][j] = 0; //???a????????
				}
			} //??b??????????????????
			k++;
		}

		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				if (j != 8)
				{
					System.out.print(b[i][j]);
					System.out.print(" ");
				}
				else if (j == 8)
				{
					System.out.print(b[i][j]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

