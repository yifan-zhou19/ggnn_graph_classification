package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final int max = 100;
		int row;
		int col;
		int i;
		int j;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] num = new int[max + 2][max + 2];
		for (i = 0; i < max + 2; i++)
		{
			for (j = 0; j < max + 2; j++)
			{
				num[i][j] = -1;
			}
		}
		for (i = 1; i <= row; i++)
		{
			for (j = 1; j <= col; j++)
			{
				num[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int flag = 0;
		int maxnum = row * col;
		int count = 0;
		i = 1;
		j = 1;
		while (true)
		{
			if (flag == 0)
			{
				while (num[i][j] != -1)
				{
					System.out.print(num[i][j]);
					System.out.print("\n");
					num[i][j] = -1;
					count++;
					j++;
				}
				j--;
				i++;
				flag = 1;
			}
			else
			{
				if (flag == 1)
				{
					while (num[i][j] != -1)
					{
						System.out.print(num[i][j]);
						System.out.print("\n");
						num[i][j] = -1;
						count++;
						i++;
					}
					i--;
					j--;
					flag = 2;
				}
				else
				{
					if (flag == 2)
					{
						while (num[i][j] != -1)
						{
							System.out.print(num[i][j]);
							System.out.print("\n");
							num[i][j] = -1;
							count++;
							j--;
						}
						j++;
						i--;
						flag = 3;
					}
					else
					{
						while (num[i][j] != -1)
						{
							System.out.print(num[i][j]);
							System.out.print("\n");
							num[i][j] = -1;
							count++;
							i--;
						}
						i++;
						j++;
						flag = 0;
					}
				}
			}
			if (count == maxnum)
			{
				break;
			}
		}
		return 0;
	}
}

