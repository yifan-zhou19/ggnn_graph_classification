package <missing>;

public class GlobalMembers
{
	public static void zengjia()
	{
		int[][] num2 = new int[9][9];
		int i;
		int j;
		for (i = 0; i < 9; i++)
		{
			for (j = 0; j < 9; j++)
			{
				if (num[i][j] > 0)
				{
				if (i > 0)
				{
					num2[i - 1][j] = num[i][j] + num2[i - 1][j];
				}
				if (i < 8)
				{
					num2[i + 1][j] = num[i][j] + num2[i + 1][j];
				}
				if (j > 0)
				{
					num2[i][j - 1] = num[i][j] + num2[i][j - 1];
				}
				if (j < 8)
				{
					num2[i][j + 1] = num[i][j] + num2[i][j + 1];
				}
				if (i > 0 && j > 0)
				{
					num2[i - 1][j - 1] = num[i][j] + num2[i - 1][j - 1];
				}
				if (i < 8 && j > 0)
				{
					num2[i + 1][j - 1] = num[i][j] + num2[i + 1][j - 1];
				}
				if (i > 0 && j < 8)
				{
					num2[i - 1][j + 1] = num[i][j] + num2[i - 1][j + 1];
				}
				if (i < 8 && j < 8)
				{
					num2[i + 1][j + 1] = num[i][j] + num2[i + 1][j + 1];
				}
				num2[i][j] = num[i][j] * 2 + num2[i][j];
				}
			}
		}
		for (i = 0; i < 9; i++)
		{
			for (j = 0; j < 9; j++)
			{
				num[i][j] = num2[i][j];
			}
		}
		return;
	}
	public static int[][] num = new int[9][9];

	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num[4][4] = m;
		for (i = 0; i < n; i++)
		{
			zengjia();
		}
		for (i = 0; i < 9; i++)
		{
			System.out.print(num[i][0]);
			for (j = 1; j < 9; j++)
			{
				System.out.print(" ");
				System.out.print(num[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

