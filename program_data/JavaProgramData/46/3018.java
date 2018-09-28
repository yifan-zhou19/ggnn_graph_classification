package <missing>;

public class GlobalMembers
{
	//******************
	//???2         **
	//??????    **
	//???2013.11.1 **
	//******************
	public static int Main()
	{
		int row;
		int col;
		int[][] num = new int[200][200];
		int a;
		int b;
		int c;
		int c1;
		int x;
		int y;

		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 1; i <= row; i++)
		{

			for (int j = 1; j <= col; j++)
			{

				num[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		x = y = 1;

		c1 = 0;

		c = row * col;

		for (;x <= row;)
		{
			for (a = x; a <= col; a++)
			{
				if (c1 == c)
				{
					break;
				}

				System.out.print(num[x][a]);
				System.out.print("\n");

				c1++;
			}
			a--;

			for (b = y + 1; b <= row; b++)
			{
				if (c1 == c)
				{
					break;
				}

				System.out.print(num[b][a]);
				System.out.print("\n");

				c1++;
			}
			b--;

			for (a--; a >= x; a--)
			{
				if (c1 == c)
				{
					break;
				}

				System.out.print(num[b][a]);
				System.out.print("\n");

				c1++;
			}
			a++;

			b--;

			for (; b > y; b--)
			{
				if (c1 == c)
				{
					break;
				}

				System.out.print(num[b][a]);
				System.out.print("\n");

				c1++;
			}
			x++;

			y++;

			row--;

			col--;
		}
		return 0;
	}
}

