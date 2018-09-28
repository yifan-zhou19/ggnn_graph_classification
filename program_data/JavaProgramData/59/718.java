package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[102][102]; //????0?????1?????2???????????
		int[][] b = new int[102][102];
		for (int i = 1 ; i <= n ; i++)
		{
			for (int j = 1 ; j <= n ; j++)
			{
				char temp;
				temp = ConsoleInput.readToWhiteSpace(true).charAt(0);
				switch (temp)
				{
					case '.':
						a[i][j] = 1;
						b[i][j] = 1;
						break;
					case '#':
						a[i][j] = 0;
						b[i][j] = 0;
						break;
					case '@':
						a[i][j] = 2;
						b[i][j] = 2;
						break;
				}
			}
		}

		int day;
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 2 ; k <= day ; k++)
		{
			for (int i = 1 ; i <= n ; i++)
			{
				for (int j = 1 ; j <= n ; j++)
				{
					if (a[i][j] == 2)
					{
						if (a[i - 1][j] == 1)
						{
							b[i - 1][j] = 2;
						}
						if (a[i + 1][j] == 1)
						{
							b[i + 1][j] = 2;
						}
						if (a[i][j - 1] == 1)
						{
							b[i][j - 1] = 2;
						}
						if (a[i][j + 1] == 1)
						{
							b[i][j + 1] = 2;
						}
					}
				}
			}
			for (int i = 1 ; i <= n ; i++)
			{
				for (int j = 1 ; j <= n ; j++)
				{
					a[i][j] = b[i][j];
				}
			}
		}

		int sum = 0; //??????
		for (int i = 1 ; i <= n ; i++)
		{
			for (int j = 1 ; j <= n ; j++)
			{
				if (a[i][j] == 2)
				{
					sum++;
				}
			}
		}
		System.out.print(sum);
		return 0;
	}



}

