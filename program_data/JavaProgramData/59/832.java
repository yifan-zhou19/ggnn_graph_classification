package <missing>;

public class GlobalMembers
{
	//******************************************
	//????
	//??????
	public static int Main() //?????
	{
		char[][] h = new char[101][101]; //????
		int n;
		int m;
		int i = 0;
		int j = 0;
		int k = 0;
		int t = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++) //??
		{
			for (j = 0;j < n;j++)
			{
				h[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (m > 1) //??m-1?
		{
			if (h[0][0] == '@') //??????
			{
				if (h[0][1] == '.')
				{
					h[0][1] = '!';
				}
				if (h[1][0] == '.')
				{
					h[1][0] = '!';
				}
			}
			if (h[n - 1][n - 1] == '@')
			{
				if (h[n - 2][n - 1] == '.')
				{
					h[n - 2][n - 1] = '!';
				}
				if (h[n - 1][n - 2] == '.')
				{
					h[n - 1][n - 2] = '!';
				}
			}
			if (h[n - 1][0] == '@')
			{
				if (h[n - 2][0] == '.')
				{
					h[n - 2][0] = '!';
				}
				if (h[n - 1][1] == '.')
				{
					h[n - 1][1] = '!';
				}
			}
			if (h[0][n - 1] == '@')
			{
				if (h[0][n - 2] == '.')
				{
					h[0][n - 2] = '!';
				}
				if (h[1][n - 1] == '.')
				{
					h[1][n - 1] = '!';
				}
			}
			for (j = 1;j < n - 1;j++) //??????
			{
				if (h[0][j] == '@')
				{
					if (h[1][j] == '.')
					{
						h[1][j] = '!';
					}
					if (h[0][j - 1] == '.')
					{
						h[0][j - 1] = '!';
					}
					if (h[0][j + 1] == '.')
					{
						h[0][j + 1] = '!';
					}
				}
				if (h[n - 1][j] == '@')
				{
					if (h[n - 2][j] == '.')
					{
						h[n - 2][j] = '!';
					}
					if (h[n - 1][j - 1] == '.')
					{
						h[n - 1][j - 1] = '!';
					}
					if (h[n - 1][j + 1] == '.')
					{
						h[n - 1][j + 1] = '!';
					}
				}
			}
			for (i = 1;i < n - 1;i++)
			{
				if (h[i][0] == '@')
				{
					if (h[i][1] == '.')
					{
						h[i][1] = '!';
					}
					if (h[i - 1][0] == '.')
					{
						h[i - 1][0] = '!';
					}
					if (h[i + 1][0] == '.')
					{
						h[i + 1][0] = '!';
					}
				}
				if (h[i][n - 1] == '@')
				{
					if (h[i][n - 2] == '.')
					{
						h[i][n - 2] = '!';
					}
					if (h[i - 1][n - 1] == '.')
					{
						h[i - 1][n - 1] = '!';
					}
					if (h[i + 1][n - 1] == '.')
					{
						h[i + 1][n - 1] = '!';
					}
				}
			}
			for (i = 1;i < n - 1;i++) //????
			{
				for (j = 1;j < n - 1;j++)
				{
					if (h[i][j] == '@')
					{
						if (h[i][j + 1] == '.')
						{
							h[i][j + 1] = '!';
						}
						if (h[i][j - 1] == '.')
						{
							h[i][j - 1] = '!';
						}
						if (h[i + 1][j] == '.')
						{
							h[i + 1][j] = '!';
						}
						if (h[i - 1][j] == '.')
						{
							h[i - 1][j] = '!';
						}
					}
				}
			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (h[i][j] == '!')
					{
						h[i][j] = '@';
					}
				}
			}
			m--;
		}
		for (i = 0;i < n;i++) //??????
		{
			for (j = 0;j < n;j++)
			{
				if (h[i][j] == '@')
				{
					t++;
				}
			}
		}
		System.out.print(t);
		return 0; //?????
	}
}

