package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] arrey = new int[100][100];
		int i;
		int j;
		int k;
		int times;
		int all;
		int row;
		int col;

		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col ; j++)
			{
				arrey[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
			k = 0;
			times = 0;
			all = row * col;
			do
			{
				i = k;
				j = k;
				for (; j <= col - 1; j++)
				{
					System.out.print(arrey[i][j]);
					System.out.print("\n");
					times++;
				}
				--j;
				if (times == all)
				{
							break;
				}
				 for (++i ; i <= row - 1;i++)
				 {
					 System.out.print(arrey[i][j]);
					 System.out.print("\n");
							times++;
				 }
				--i;
				if (times == all)
				{
							break;
				}
						for (--j;j >= k; j--)
						{
							System.out.print(arrey[i][j]);
							System.out.print("\n");
							times++;
						}
						if (times == all)
						{
							break;
						}
						++j;
						for (--i ;i > k; i--)
						{
							System.out.print(arrey[i][j]);
							System.out.print("\n");
							times++;
						}
				if (times == all)
				{
							break;
				}
						col--;
						row--;
						k++;
			}while (1 != 0);
				return 0;
	}
}

