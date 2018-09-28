package <missing>;

public class GlobalMembers
{
	/*
	 *liuganchuanran.cpp
	 *?????????????????????????n*n????????????????????????????????????????????????????????????????????????????????????????m????????
	 *Created on: 2012-11-12
	 *Author: ??
	 */
	public static int Main()
	{
		int n = 0; //????
		int m = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] shuru = new char[101][101];
		for (int i = 0; i < n; i++)
		{ //????
			for (int j = 0; j < n; j++)
			{
				shuru[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 1; k < m; k++)
		{ //??????????
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n; j++)
				{
					if (shuru[i][j] == '@')
					{
						if (((i - 1) >= 0) && shuru[i - 1][j] == '.')
						{
							shuru[i - 1][j] = 'a';
						}
						if (((i + 1) < n) && shuru[i + 1][j] == '.')
						{
							shuru[i + 1][j] = 'a';
						}
						if (((j - 1) >= 0) && shuru[i][j - 1] == '.')
						{
							shuru[i][j - 1] = 'a';
						}
						if (((j + 1) < n) && shuru[i][j + 1] == '.')
						{
							shuru[i][j + 1] = 'a';
						}
					}
				}
			}
			for (int i = 0; i < n; i++)
			{ //??????
				for (int j = 0; j < n; j++)
				{
					if (shuru[i][j] == 'a')
					{
						shuru[i][j] = '@';
					}
					else
					{
						continue;
					}
				}
			}
		}
		int jishu = 0;
		for (int i = 0; i < n; i++)
		{ //????????
			for (int j = 0; j < n; j++)
			{
				if (shuru[i][j] == '@')
				{
					jishu++;
				}
				else
				{
					continue;
				}
			}
		}
		System.out.print(jishu);
		System.out.print("\n");
		return 0;
	}

}

