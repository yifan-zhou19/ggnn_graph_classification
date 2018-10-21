package <missing>;

public class GlobalMembers
{
	/*
	 *  ????.cpp
	 *  Created on: 2012-11-11
	 *  Author: ???
	 *  ??:???m???????
	 */
	public static int Main()
	{
		int n; //?????day???
		int day;
		int num = 0;
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] room1 = new char[n + 2][n + 2]; //room1???????????room2?????????
		char[][] room2 = new char[n + 2][n + 2];
		char t;
		t = System.in.read(); //??????
		for (i = 1; i <= n; i++)
		{ //????????
			for (j = 1; j <= n + 1; j++)
			{
				room1[i][j] = room2[i][j] = System.in.read();
			}
		}
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1; k < day; k++)
		{ //??day?
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					if (room2[i][j] == '@' || room2[i][j] == '#')
					{
						continue; //??????????????????
					}
					if (room1[i - 1][j] == '@' || room1[i + 1][j] == '@' || room1[i][j - 1] == '@' || room1[i][j + 1] == '@')
					{ //?????????
						room2[i][j] = '@'; //?????
					}
				}
			}
			for (i = 1; i <= n; i++)
			{ //?room1???room2????????
				for (j = 1; j <= n; j++)
				{
					room1[i][j] = room2[i][j];
				}
			}
		}
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (room2[i][j] == '@')
				{
					num++; //?????@??????1
				}
			}
		}
		System.out.print(num);
		System.out.print("\n");
		return 0;
	}
}

