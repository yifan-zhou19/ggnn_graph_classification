package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] ch = new char[100][100];
		char[][] ch1 = new char[100][100];
		int n;
		int m;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				ch[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 0;k < m - 1;k++)
		{

			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++)
				{
					ch1[i][j] = ch[i][j];
				}
			}
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++)
				{
					if (ch1[i][j] == '@')
					{
						if (ch[i + 1][j] == '.' && (i + 1) < n)
						{
							ch[i + 1][j] = '@';
						}
						if (ch[i - 1][j] == '.' && (i - 1) >= 0)
						{
							ch[i - 1][j] = '@';
						}
						if (ch[i][j + 1] == '.' && (j + 1) < n)
						{
							ch[i][j + 1] = '@';
						}
						if (ch[i][j - 1] == '.' && (j - 1) >= 0)
						{
							ch[i][j - 1] = '@';
						}
					}
				}
			}
		}
		for (int i = 0;i < n;i++)
		{
				for (int j = 0;j < n;j++)
				{
					if (ch[i][j] == '@')
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

