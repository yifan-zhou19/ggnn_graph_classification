package <missing>;

public class GlobalMembers
{
	/*
	 * c.cpp
	 * ???1100012870;
	 * ???????
	 *  Created on: 2011-11-3
	 *      Author: Li Wenpeng
	 */
	public static int Main()
	{
		int[][] a = new int[150][150];
		int[][] b = new int[150][150];
		int m;
		int n;
		int i;
		int j;
		int x;
		int y;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Integer.SIZE / Byte.SIZE)); //?b????
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= m;i++) //??
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				b[i][j] = 1;
			}
		}
		x = 0;
		y = 1;
		i = 1;
		j = 1; //??a?1??1?
		System.out.print(a[1][1]);
		System.out.print("\n");
		b[1][1] = 0;
		while (x + y != 0)
		{ //???????????
			if (b[i + x][j + y] > 0)
			{
				System.out.print(a[i + x][j + y]);
				System.out.print("\n");
				i = i + x;
				j = j + y;
				b[i][j] = 0;
				continue;
			}; //????????
			if (b[i + 1][j] > 0)
			{
				x = 1;
				y = 0;
				continue;
			}
			if (b[i - 1][j] > 0)
			{
				x = -1;
				y = 0;
				continue;
			}
			if (b[i][j + 1] > 0)
			{
				x = 0;
				y = 1;
				continue;
			}
			if (b[i][j - 1] > 0)
			{
				x = 0;
				y = -1;
				continue;
			}
			break;
		}
		return 0;
	}

}

