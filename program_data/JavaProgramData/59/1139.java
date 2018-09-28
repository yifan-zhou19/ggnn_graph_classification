package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[][] data = new int[100][100];
		int counter = 0;
		char temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				temp = ConsoleInput.readToWhiteSpace(true).charAt(0);
				switch (temp)
				{
					case '.' :
						data[i][j] = 0;
						break;
					case '#' :
						data[i][j] = -1;
						break;
					case '@' :
						data[i][j] = 1;
						break;
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 2; k <= m; k++)
		{
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n; j++)
				{
					if (data[i][j] == k - 1)
					{
						if (i + 1 < n && data[i + 1][j] == 0)
						{
							data[i + 1][j] = k;
						}
						if (i - 1 >= 0 && data[i - 1][j] == 0)
						{
							data[i - 1][j] = k;
						}
						if (j + 1 < n && data[i][j + 1] == 0)
						{
							data[i][j + 1] = k;
						}
						if (j - 1 >= 0 && data[i][j - 1] == 0)
						{
							data[i][j - 1] = k;
						}
					}
				}
			}
		}
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if (data[i][j] > 0)
				{
					counter++;
				}
			}
		}
		System.out.print(counter);
		return 0;
	}
}

