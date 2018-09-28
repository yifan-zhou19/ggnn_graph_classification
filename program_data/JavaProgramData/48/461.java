package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int j;
	public static int k;
	public static int n;
	public static int[][] num = new int[11][11];
	public static int[][] num1 = new int[11][11];
	public static int[][] t = new int[11][11];
	public static void turn()
	{
		int i;
		int j;
		for (i = 0;i < 11;i++)
		{
			for (j = 0;j < 11;j++)
			{
				t[i][j] = num[i][j];
				num[i][j] = num1[i][j];
				num1[i][j] = t[i][j];
			}
		}
	}
	public static int Main()
	{
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num[5][5] = i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 1;j < 10;j++)
			{
				for (k = 1;k < 10;k++)
				{
					num1[j][k] = 2 * num[j][k] + (num[j][k + 1] + num[j][k - 1] + num[j + 1][k] + num[j - 1][k] + num[j + 1][k + 1] + num[j + 1][k - 1] + num[j - 1][k + 1] + num[j - 1][k - 1]);
				}
			}
			turn();
		}
		for (i = 1;i < 10;i++)
		{
			for (j = 1;j < 9;j++)
			{
				System.out.print(num[i][j]);
				System.out.print(' ');
			}
			System.out.print(num[i][9]);
			System.out.print("\n");
		}
		return 0;
	}
}

