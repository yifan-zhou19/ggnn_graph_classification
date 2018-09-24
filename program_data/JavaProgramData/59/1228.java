package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] dx = {1, 0, 0, -1};
		int[] dy = {0, 1, -1, 0};
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] room =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int[][] Room = new int[100][100];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(room, '#', (Character.SIZE / Byte.SIZE));
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				room[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		int day;
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int q = 1; q < day; q++)
		{
			for (int i = 1; i <= n; i++)
			{
				for (int j = 1; j <= n; j++)
				{
					if (room[i][j] == '@')
					{
						for (int k = 0; k < 4; k++)
						{
							int tx = i + dx[k];
							int ty = j + dy[k];
							if (room[tx][ty] == '.')
							{
								Room[tx][ty] = 1;
							}
						}
					}
				}
			}
			for (int i = 1; i <= n; i++)
			{
				for (int j = 1; j <= n; j++)
				{
					if (Room[i][j] != 0)
					{
						room[i][j] = '@';
					}
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(Room, 0, (Integer.SIZE / Byte.SIZE));
		}
		int p = 0;
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				if (room[i][j] == '@')
				{
					p++;
				}
			}
		}
		System.out.print(p);
		return 0;
	}
}

