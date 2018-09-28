package <missing>;

public class GlobalMembers
{
	/*************************
	 ***??:??? 1200012776
	 ***????:????
	 ***??:2012?12?19?
	 *************************/
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] room =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				room[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (m = 0; m < k - 1; m++)
		{
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					if (room[i][j] == '!')
					{
						room[i][j] = '@';
					}
				}
			}
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					if (room[i][j] == '@')
					{
						if (room[i - 1][j] == '.')
						{
							room[i - 1][j] = '!';
						}
						if (room[i + 1][j] == '.')
						{
							room[i + 1][j] = '!';
						}
						if (room[i][j - 1] == '.')
						{
							room[i][j - 1] = '!';
						}
						if (room[i][j + 1] == '.')
						{
							room[i][j + 1] = '!';
						}
					}
				}
			}
		}
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (room[i][j] == '!' || room[i][j] == '@')
				{
					sum++;
				}
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}



}

