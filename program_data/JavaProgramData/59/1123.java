package <missing>;

public class GlobalMembers
{
	/*
	 * END4.cpp
	 * ????
	 *  Created on: 2013-1-11
	 *      Author: Administrator
	 *      ???????m???????
	 */
	public static char[][] state = new char[100][100];
	public static int sum = 0;
	public static int m;
	public static int n;
	public static void spread(int x,int y)
	{
		if (x == -1 || x == n || y == -1 || y == n) //??
		{
			return;
		}
		if (state[x][y] == '.')
		{
			state[x][y] = '@';
		}
	/*	else if(state[x][y]=='#')*/
	}
	public static int Main()
	{

		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++) //?
		{
			for (j = 0;j < n;j++) //?
			{
				state[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k < m;k++) //??
		{
			for (i = 0;i < n;i++) //?
			{
				for (j = 0;j < n;j++) //?
				{
				if (state[i][j] == '@')
				{
							state[i][j] = '*';
				}
				}
			}
			for (i = 0;i < n;i++) //?
			{
				for (j = 0;j < n;j++) //?
				{
					if (state[i][j] == '*')
					{
						spread(i - 1, j);
						spread(i + 1, j);
						spread(i, j - 1);
						spread(i, j + 1);
					} //4???
				}
			}
		   for (i = 0;i < n;i++)
		   {
					for (j = 0;j < n;j++)
					{
						if (state[i][j] == '*')
						{
							state[i][j] = '@';
						}
					}
		   }
		}

		for (i = 0;i < n;i++) //?
		{
					for (j = 0;j < n;j++) //?
					{
						sum += (state[i][j] == '@');
					}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}

}

