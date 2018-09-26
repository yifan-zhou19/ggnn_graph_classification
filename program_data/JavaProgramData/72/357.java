package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[20][20];
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < m; i++)
		{
			for (j = 0; j < n; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < m; i++)
		{
			for (j = 0; j < n; j++)
			{
				if (i == 0)
				{
					if (j == 0)
					{
						if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j + 1])
						{
							System.out.print(i);
							System.out.print(' ');
							System.out.print(j);
							System.out.print("\n");
						}
						else
						{
							continue;
						}
					}
					else if (j < n - 1)
					{
						if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i][j - 1])
						{
							System.out.print(i);
							System.out.print(' ');
							System.out.print(j);
							System.out.print("\n");
						}
						else
						{
							continue;
						}
					}
					else
					{
						if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j - 1])
						{
							System.out.print(i);
							System.out.print(' ');
							System.out.print(j);
							System.out.print("\n");
						}
						else
						{
							continue;
						}
					}
				}
				else if (i < m - 1)
				{
					if (j == 0)
					{
						if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i - 1][j])
						{
							System.out.print(i);
							System.out.print(' ');
							System.out.print(j);
							System.out.print("\n");
						}
						else
						{
							continue;
						}
					}
					else if (j < n - 1)
					{
						if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i - 1][j])
						{
							System.out.print(i);
							System.out.print(' ');
							System.out.print(j);
							System.out.print("\n");
						}
						else
						{
							continue;
						}
					}
					else
					{
						if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i - 1][j])
						{
							System.out.print(i);
							System.out.print(' ');
							System.out.print(j);
							System.out.print("\n");
						}
						else
						{
							continue;
						}
					}
				}
				else
				{

					if (j == 0)
					{
						if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j + 1])
						{
							System.out.print(i);
							System.out.print(' ');
							System.out.print(j);
							System.out.print("\n");
						}
						else
						{
							continue;
						}
					}
					else if (j < n - 1)
					{
						if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i][j - 1])
						{
							System.out.print(i);
							System.out.print(' ');
							System.out.print(j);
							System.out.print("\n");
						}
						else
						{
							continue;
						}
					}
					else
					{
						if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j - 1])
						{
							System.out.print(i);
							System.out.print(' ');
							System.out.print(j);
							System.out.print("\n");
						}
						else
						{
							continue;
						}
					}
				}
			}
		}
		return 0;
	}



}

