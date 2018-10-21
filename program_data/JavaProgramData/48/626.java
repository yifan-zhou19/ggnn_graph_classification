package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum = 0; //???????sum,????day,?????a[11][11],??????b[11][11],??????i,j
		int day = 0;
		int[][] a = new int[11][11];
		int[][] b = new int[11][11];
		int i = 0;
		int j = 0;
		int p = 0;
		sum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 11;i++) //?????
		{
			for (j = 0;j < 11;j++)
			{
				a[i][j] = 0;
			}
		}
		a[5][5] = sum; //????????????????
		for (i = 0;i < 11;i++)
		{
			for (j = 0;j < 11;j++)
			{
				b[i][j] = a[i][j];
			}
		}
		for (p = 0;p < day;p++)
		{
			for (i = 0;i < 11;i++)
			{
				for (j = 0;j < 11;j++) //???????a[i][j]?????b[i][j]
				{
					b[i][j] = a[i][j];
				}
			}
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					a[i][j] = 2 * b[i][j] + b[i - 1][j - 1] + b[i - 1][j] + b[i - 1][j + 1] + b[i][j - 1] + b[i][j + 1] + b[i + 1][j - 1] + b[i + 1][j] + b[i + 1][j + 1]; //???????
				}
			}
		}
		for (i = 1;i <= 9;i++)
		{
			for (j = 1;j < 9;j++)
			{
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.print(a[i][9]);
			System.out.print("\n");
		}
			return 0;
	}

}

