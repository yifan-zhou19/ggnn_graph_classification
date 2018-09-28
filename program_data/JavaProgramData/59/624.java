package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] mat = new char[100][100];
		int n;
		int d;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (int i = 1;i <= n;i++) //???????
		{
			for (int j = 1;j <= n;j++)
			{
				mat[i][j] = System.in.read();
			}
			System.in.read();
		}
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int x = 1;x < d;x++)
		{
			for (int i = 1;i <= n;i++)
			{
				for (int j = 1;j <= n;j++)
				{
					if (mat[i][j] == '@')
					{
						if (mat[i - 1][j] == '.')
						{
							mat[i - 1][j] = 'a'; //'a'???????
						}
						if (mat[i + 1][j] == '.')
						{
							mat[i + 1][j] = 'a';
						}
						if (mat[i][j - 1] == '.')
						{
							mat[i][j - 1] = 'a';
						}
						if (mat[i][j + 1] == '.')
						{
							mat[i][j + 1] = 'a';
						}
					}
				}
			}
			for (int i = 1;i <= n;i++)
			{
				for (int j = 1;j <= n;j++)
				{
					if (mat[i][j] == 'a')
					{
						mat[i][j] = '@';
					}
				}
			}
		}
		int s = 0;
		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				if (mat[i][j] == '@')
				{
					s++;
				}
			}
		}
		System.out.print(s);
		System.out.print("\n");
		return 0;
	}
}

