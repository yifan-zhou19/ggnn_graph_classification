package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int k;

		int n;

		int l;

		int i;
		int j;

		int temp;


		int count = 0;

		char[][] s = new char[102][102];
		int[][] sta = new int[102][102];

		int[][] flag = new int[102][101];

		int[][] dir =
		{
			{1, 0},
			{0, 1},
			{-1, 0},
			{0, -1}
		};

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(flag,0,(Integer.SIZE / Byte.SIZE));



		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				s[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (s[i][j] == '#')
				{
					sta[i][j] = 0;
				}
				if (s[i][j] == '.')
				{
					sta[i][j] = 1;
				}
				if (s[i][j] == '@')
				{
					sta[i][j] = 2;
				}

			}
			System.in.read();
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k <= m - 1;k++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(flag,0,(Integer.SIZE / Byte.SIZE));
			for (i = 1;i <= n;i++)
			{
			for (j = 1;j <= n;j++)
			{
				if (sta[i][j] == 2 && flag[i][j] == 0)
				{
					for (l = 0;l <= 3;l++)
					{
						if (i + dir[l][0] <= n != 0 && i + dir[l][0] >= 1 && j + dir[l][1] <= n != 0 && j + dir[l][1] >= 1)
						{

						if (sta[i + dir[l][0]][j + dir[l][1]] == 1)
						{
							sta[i + dir[l][0]][j + dir[l][1]] = 2;
							flag[i + dir[l][0]][j + dir[l][1]] = 1;
						}
						}
					}
				}
			}
			}
		}


		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (sta[i][j] == 2)
				{
					count++;
				}
			}
		}
		System.out.print(count);
		System.out.print("\n");


































		return 0;
	}
}

