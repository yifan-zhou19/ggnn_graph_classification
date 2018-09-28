package <missing>;

public class GlobalMembers
{
	/*
	 * T4.cpp
	 *
	 *  Created on: 2013-1-11
	 *      Author: weiwan
	 *      Function:????
	 */

	public static int Main()
	{
		int n;
		int m;
		char[][] r = new char[110][110];
		int i; //i,j??????count???????
		int j;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(r,'#',(Character.SIZE / Byte.SIZE)); //?????????
		for (i = 1;i <= n;i++) //??????
		{
			for (j = 1;j <= n;j++)
			{
				r[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (m > 1) //????
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (r[i][j] == '@') //???????????
					{
						if (r[i - 1][j] == '.')
						{
							r[i - 1][j] = '*'; //????????????????�*�
						}
						if (r[i + 1][j] == '.')
						{
							r[i + 1][j] = '*';
						}
						if (r[i][j - 1] == '.')
						{
							r[i][j - 1] = '*';
						}
						if (r[i][j + 1] == '.')
						{
							r[i][j + 1] = '*';
						}
					}
				}
			}
			for (i = 1;i <= n;i++)
			{ //???????�*�??????
				for (j = 1;j <= n;j++)
				{
					if (r[i][j] == '*')
					{
						r[i][j] = '@';
					}
				}
			}
			m--; //??-1
		}
		for (i = 1;i <= n;i++) //????????
		{
			for (j = 1;j <= n;j++)
			{
				if (r[i][j] == '@')
				{
					count++;
				}
			}
		}
		System.out.print(count);
		System.out.print("\n");
		return 0;
	}
}

