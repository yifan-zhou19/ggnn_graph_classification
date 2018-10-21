package <missing>;

public class GlobalMembers
{
	/*
	 * 105.cpp
	 *
	 *  Created on: 2011-10-28
	 *      Author: think
	 */
	public static int Main()
	{
		int rol;
		int col;
		rol = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[rol][col];
		int i;
		int j;
		for (i = 0;i < rol;i++)
		{
			for (j = 0;j < col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int k; //????
		for (k = 0;k <= rol + col - 2;k++)
		{
			for (i = 0;k - i >= 0 && i < rol;i++)
			{
				if (k - i >= col)
				{
					continue;
				}
				j = k - i;
				System.out.print(a[i][j]);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

