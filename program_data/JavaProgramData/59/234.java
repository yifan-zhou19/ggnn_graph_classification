package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] room = new char[102][102]; //temp??????????
		char[][] temp = new char[102][102];
		int n;
		int m;
		int i;
		int j;
		int k;
		int l = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				room[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k < m;k++) //??m-1?
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					temp[i][j] = room[i][j];
				}
			}
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (temp[i][j] == '@') //????
					{
						if (room[i - 1][j] == '.')
						{
							room[i - 1][j] = '@';
						}
						if (room[i][j - 1] == '.')
						{
							room[i][j - 1] = '@';
						}
						if (room[i][j + 1] == '.')
						{
							room[i][j + 1] = '@';
						}
						if (room[i + 1][j] == '.')
						{
							room[i + 1][j] = '@';
						}
					}
				}
			}
		}
		for (i = 1;i <= n;i++) //??????�@�
		{
			for (j = 1;j <= n;j++)
			{
				if (room[i][j] == '@')
				{
						l++;
				}
			}
		}
		System.out.print(l);
		System.out.print("\n");
		return 0;
	}

}

