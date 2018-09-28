package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int sum = 0;
		char x;
		char[][] room = new char[N][N];
		char[][] room2 = new char[N][N];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				room[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
		memcpy(room2,room,N * N);
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int f = 1;f <= m - 1;f++)
			{
				for (int i = 1;i <= n;i++)
				{
					for (int j = 1;j <= n;j++)
					{
				if (room[i][j] == '@')
				{
					if (room[i + 1][j] == '.')
					{
						room2[i + 1][j] = '@';
					}
					if (room[i - 1][j] == '.')
					{
						room2[i - 1][j] = '@';
					}
					if (room[i][j + 1] == '.')
					{
						room2[i][j + 1] = '@';
					}
					if (room[i][j - 1] == '.')
					{
						room2[i][j - 1] = '@';
					}
				}
					}
				}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
				memcpy(room,room2,N * N);
			}
				for (int i = 1;i <= n;i++)
				{
					for (int j = 1;j <= n;j++)
					{
						if (room2[i][j] == '@')
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

