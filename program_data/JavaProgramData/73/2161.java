package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int k;
		int[][] flag = new int[5][5];
		int prime = 0;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				flag[i][j] = 1;
			}
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				for (k = 0;k < 5;k++)
				{
					if (k == j)
					{
						continue;
					}
					else
					{
						if (a[i][j] < a[i][k])
						{
							flag[i][j] = 0;
							break;
						}
					}
				}
			}
			for (j = 0;j < 5;j++)
			{
				if (flag[i][j] == 1)
				{
					for (k = 0;k < 5;k++)
					{
						if (k == i)
						{
							continue;
						}
						else
						{
							if (a[i][j] > a[k][j])
							{
								flag[i][j] = 0;
								break;
							}
						}
					}
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (flag[i][j] == 1)
				{
					System.out.print(i + 1);
					System.out.print(' ');
					System.out.print(j + 1);
					System.out.print(' ');
					System.out.print(a[i][j]);
					System.out.print("\n");
					prime = 1;

				}
			}
		}
		if (prime == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}
}

