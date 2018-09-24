package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int[][] a = new int[100][100];
		int count = 0;
		int k;
		char b;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				b = ConsoleInput.readToWhiteSpace(true).charAt(0);
				 if (b == '#')
				 {
					a[i][j] = 6;
				 }
				if (b == '.')
				{
					a[i][j] = 0;
				}
				if (b == '@')
				{
					a[i][j] = 1;
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k < m;k++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a[i][j] == 1)
					{
						if (a[i - 1][j] != 6)
						{
							if (a[i - 1][j] == 0)
							{
								a[i - 1][j] = 2;
							}
						}
						if (a[i + 1][j] != 6)
						{
							if (a[i + 1][j] == 0)
							{
								a[i + 1][j] = 2;
							}
						}
						if (a[i][j + 1] != 6)
						{
							if (a[i][j + 1] == 0)
							{
								a[i][j + 1] = 2;
							}
						}
						if (a[i][j - 1] != 6)
						{
							if (a[i][j - 1] == 0)
							{
								a[i][j - 1] = 2;
							}
						}
					}
				}
			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a[i][j] == 2)
					{
						a[i][j] = 1;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			 for (j = 0;j < n;j++)
			 {
				if (a[i][j] == 1)
				{
					 count++;
				}
			 }
		}
		System.out.print(count);
		return 0;
	}
}

