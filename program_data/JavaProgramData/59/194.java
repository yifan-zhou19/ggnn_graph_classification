package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] room = new char[100][100];
		int n;
		int i;
		int j;
		int day;
		int k;
		int num = 0;
		int[][] change = new int[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				room[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
			day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k < day;k++)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
				change[i][j] = 0;
				}
			}
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (room[i][j] == '@')
					{

						if (room[i + 1][j] == '.')
						{
							change[i + 1][j] = 1;
						}
						if (room[i][j + 1] == '.')
						{
							change[i][j + 1] = 1;
						}
						   if (room[i - 1][j] == '.')
						   {
							change[i - 1][j] = 1;
						   }
						if (room[i][j - 1] == '.')
						{
							change[i][j - 1] = 1;
						}
					}
				}
			}
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
				if (change[i][j] != 0)
				{
					room[i][j] = '@';
				}
				}
			}

		}
		   for (i = 1;i <= n;i++)
		   {
				for (j = 1;j <= n;j++)
				{
					if (room[i][j] == '@')
					{
						num++;
					}
				}
		   }
			System.out.print(num);
			return 0;
	}
}

