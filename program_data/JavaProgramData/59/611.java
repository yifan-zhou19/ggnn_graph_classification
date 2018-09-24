package <missing>;

public class GlobalMembers
{
	/*************************
	*????EX1_05.cpp
	*??????1100019007?
	*???2012-11-11
	*???????
	**************************/ 
	public static char[][] rooms = new char[100][100];
	public static void Main(String[] args)
	{
		int n; //????
		int m;
		int i;
		int j;
		int d;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				rooms[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (d = 0;d < m - 1;d++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (rooms[i][j] == '@')
					{
						if (i > 0)
						{
							if (rooms[i - 1][j] == '.')
							{
								rooms[i - 1][j] = '+';
							}
						}
						if (i < n - 1)
						{
							if (rooms[i + 1][j] == '.')
							{
								rooms[i + 1][j] = '+';
							}
						}
						if (j > 0)
						{
							if (rooms[i][j - 1] == '.')
							{
								rooms[i][j - 1] = '+';
							}
						}
						if (j < n - 1)
						{
							if (rooms[i][j + 1] == '.')
							{
								rooms[i][j + 1] = '+';
							}
						} //??????
					}
				}
			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (rooms[i][j] == '+')
					{
						rooms[i][j] = '@';
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (rooms[i][j] == '@')
				{
					count++; //????
				}
			}
		}
		System.out.print(count);
		System.out.print("\n");
	}

}

