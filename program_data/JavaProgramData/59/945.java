package <missing>;

public class GlobalMembers
{
	//********************************
	//*???4.cpp   **
	//*?????? 1200012768 **
	//*???2012.12.  **
	//*???????  **
	//********************************
	public static int Main()
	{
		char[][] ch = new char[101][101];
		int[][] num = new int[101][101];
		int n;
		int m;
		int i;
		int j;
		int d;
		int cc = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				ch[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (ch[i][j] == '.')
				{
					num[i][j] = -1;
				}
				else if (ch[i][j] == '#')
				{
					num[i][j] = 0;
				}
				else
				{
					num[i][j] = 1;
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (d = 2; d <= m; d++)
		{
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					if (num[i][j] > 0 && num[i][j] < d)
					{
						if (i > 0 && num[i - 1][j] == -1)
						{
							num[i - 1][j] = d;
						}
						if (j > 0 && num[i][j - 1] == -1)
						{
							num[i][j - 1] = d;
						}
						if (i < n - 1 && num[i + 1][j] == -1)
						{
							num[i + 1][j] = d;
						}
						if (j < n - 1 && num[i][j + 1] == -1)
						{
							num[i][j + 1] = d;
						}
					}
				}
			}
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				if (num[i][j] > 0)
				{
					cc++;
				}
			}
		}
		System.out.print(cc);
		return 0;
	}

}

