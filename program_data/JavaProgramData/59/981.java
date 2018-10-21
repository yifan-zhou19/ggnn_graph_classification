package <missing>;

public class GlobalMembers
{
	//**********************
	//* 2.cpp 



	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k = 1;
		int num = 0;
		char[][] ch =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i < m + 1; i++)
		{
			for (j = 1; j < m + 1; j++)
			{
				ch[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (ch[i][j] == '@')
				{
					ch[i][j] = 1 + '0';
				}
			}
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k <= n)
		{
			for (i = 1; i < m + 1; i++)
			{
				for (j = 1; j < m + 1; j++)
				{
					if (ch[i][j] == k + '0')
					{
						if (ch[i][j + 1] == '.')
						{
							ch[i][j + 1] = k + 1 + '0';
						}
						if (ch[i][j - 1] == '.')
						{
							ch[i][j - 1] = k + 1 + '0';
						}
						if (ch[i - 1][j] == '.')
						{
							ch[i - 1][j] = k + 1 + '0';
						}
						if (ch[i + 1][j] == '.')
						{
							ch[i + 1][j] = k + 1 + '0';
						}
					}
				}
			}
			k++;
		}
		for (i = 1; i < m + 1; i++)
		{
			for (j = 1; j < m + 1; j++)
			{
				if (ch[i][j] <= n + '0' && ch[i][j] >= 1 + '0')
				{
					num++;
				}
			}
		}
		System.out.print(num);
		System.out.print("\n");
		return 0;
	}
}

