package <missing>;

public class GlobalMembers
{
	public static int[][] array = new int[99][99];
	public static int x;
	public static int y;
	public static int row;
	public static int col;
	public static void out(int x0, int y0, int wid, int len)
	{
		x = x0;
		y = y0;
		for (; x < x0 + wid; x++)
		{
			System.out.print(array[x][y]);
			System.out.print("\n");
		}
		x--;
		for (y++; y < y0 + len; y++)
		{
			System.out.print(array[x][y]);
			System.out.print("\n");
		}
		y--;
		for (x--; x >= x0; x--)
		{
			if (wid == 1)
			{
				break;
			}
			if (len == 1)
			{
				break;
			}
			System.out.print(array[x][y]);
			System.out.print("\n");
		}
		x++;
		for (y--; y > y0; y--)
		{
			if (wid == 1)
			{
				break;
			}
			if (len == 1)
			{
				break;
			}
			System.out.print(array[x][y]);
			System.out.print("\n");
		}
		y++;
		if (wid <= 2 || len <= 2)
		{
			1;
		}
		else
		{
			out(x0 + 1, y0 + 1, wid - 2, len - 2);
		}
	}

	public static int Main()
	{
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (y = 0; y < row; y++)
		{
			for (x = 0; x < col; x++)
			{
				array[x][y] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		out(0, 0, col, row);
		return 0;
	}
}

