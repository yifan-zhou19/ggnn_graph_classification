package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[100][100];
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i != x;i++)
		{
			for (int j = 0;j != y;j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int x1 = 0;
		int x2 = x - 1;
		int y1 = 0;
		int y2 = y - 1;
		while (x2 >= x1 != 0 && y2 >= y1)
		{
			if (x2 == x1 && y2 == y1)
			{
				System.out.print(array[x1][y1]);
				System.out.print("\n");
			}
			else if (x2 == x1)
			{
				for (int k = y1;k <= y2;k++)
				{
					System.out.print(array[x1][k]);
					System.out.print("\n");
				}
			}
			else if (y1 == y2)
			{
				for (int k = x1;k <= x2;k++)
				{
					System.out.print(array[k][y1]);
					System.out.print("\n");
				}
			}
			else
			{
				for (int k = y1;k < y2;k++)
				{
					System.out.print(array[x1][k]);
					System.out.print("\n");
				}
				for (int k = x1;k < x2;k++)
				{
					System.out.print(array[k][y2]);
					System.out.print("\n");
				}
				for (int k = y2;k > y1;k--)
				{
					System.out.print(array[x2][k]);
					System.out.print("\n");
				}
				for (int k = x2;k > x1;k--)
				{
					System.out.print(array[k][y1]);
					System.out.print("\n");
				}
			}
			  x1++;
			   x2--;
			   y1++;
			y2--;

		}
		return 0;
	}
}

