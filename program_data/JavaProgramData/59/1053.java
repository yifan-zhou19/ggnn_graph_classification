package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[][] c = new int[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,-1,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c,-1,(Integer.SIZE / Byte.SIZE));
		for (int i = 1;i <= n;i++)
		{
				for (int j = 1;j <= n;j++)
				{
						a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
						if (a[i][j] == '.')
						{
							b[i][j] = 0;
						}
						else if (a[i][j] == '@')
						{
							b[i][j] = 1;
						}
						else if (a[i][j] == '#')
						{
							b[i][j] = -1;
						}
						c[i][j] = b[i][j];
				}
		}

		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int num = 0;
		for (int i = 1;i < m;i++)
		{
				for (int j = 1;j <= n;j++)
				{
						for (int k = 1;k <= n;k++)
						{
								if (b[j][k] == 1)
								{
											   for (int x = 0;x < 4;x++)
											   {
															   if (c[j + dx[x]][k + dy[x]] != -1)
															   {
																   c[j + dx[x]][k + dy[x]] = 1;
															   }

											   }
								}
						}
				}
						for (int j = 1;j <= n;j++)
						{
								for (int k = 1;k <= n;k++)
								{
										b[j][k] = c[j][k];
								}
						}
		}
		for (int i = 1;i <= n;i++)
		{
				for (int j = 1;j <= n;j++)
				{
						if (c[i][j] == 1)
						{
							num++;
						}
				}

		}
		System.out.print(num);
		return 0;
	}

}

