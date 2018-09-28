package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int line;
		int row;
		int sum;
		int[][] array = new int[200][200];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			line = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0; j < line; j++)
			{
				for (k = 0; k < row; k++)
				{
					array[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			sum = 0;
			if (row == 1 || line == 1)
			{ //?????????????
				for (j = 0; j < line; j++)
				{
					for (k = 0; k < row; k++)
					{
						sum = sum + array[j][k]; //???????????????????
					}
				}
				System.out.print(sum);
				System.out.print("\n");
			}
			else
			{
				sum = 0 - array[0][0] - array[0][row - 1] - array[line - 1][0] - array[line - 1][row - 1]; //????????
				for (j = 0; j < line; j++)
				{
					sum = sum + array[j][0] + array[j][row - 1];
				}
				for (j = 0; j < row; j++)
				{
					sum = sum + array[0][j] + array[line - 1][j]; //????????????
				}
				System.out.print(sum);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

