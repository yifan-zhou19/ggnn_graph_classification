package <missing>;

public class GlobalMembers
{
	/*
	 * Traverse?Diagonal(Pointer).cpp
	 *
	 *  Created on: 2012-12-10
	 *      Author: Czxck001
	 */
	public static int row = 0;
	public static int col = 0;
	public static void Input(int[] array)
	{
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i <= row - 1; i++)
		{
			for (int j = 0; j <= col - 1; j++)
			{
				*(array[i] + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
	}
	public static void Diagonal(int[] array, int x, int y)
	{
		for (int i = 0;; i++)
		{
			if (x + i > row - 1 || y - i < 0)
			{
				break;
			}
			else
			{
				if (x == 0 && y == 0)
				{
					System.out.print(array);
				}
				else
				{
					System.out.print("\n");
					System.out.print((array[x + i] + y - i));
				}
			}
		}
		return;
	}
	public static void Scan(int[] array, int x, int y)
	{
		Diagonal(array, x, y);
		if (y < col - 1)
		{
			Scan(array, x, y + 1);
		}
		else if (x < row - 1)
		{
			Scan(array, x + 1, y);
		}
		else
		{
			return;
		}
	}
	public static int Main()
	{
		int[][] a = new int[105][105];
		Input(a);
		Scan(a, 0, 0);
	}

}

