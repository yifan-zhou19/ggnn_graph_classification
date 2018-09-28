package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int[][] array = new int[110][110]; //????array???row???col
			int row;
			int col;
			int x = 0; //x???????????????y?????
			int y = 0;
			int m = 0; //m???????n??????
			int n = 0;
			row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));



			for (int i = 0; i < row; i++)
			{
					for (int j = 0; j < col; j++)
					{
							array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					}
			}


			while (n < col && m < row)
			{
				if (y >= col - n)
				{
						break;
				}
					while (y < col - n)
					{
						System.out.print(array[x][y]);
						System.out.print("\n");
						y++;
					}
					y--;
					x++;

						if (x >= row - m)
						{
						break;
						}
					while (x < row - m)
					{
						System.out.print(array[x][y]);
						System.out.print("\n");
						x++;
					}
					x--;
					y--;

					if (y < n)
					{
									break;
					}
					while (y >= n)
					{
						System.out.print(array[x][y]);
						System.out.print("\n");
						y--;
					}
					y++;
					x--;


					m++;
					if (x < m)
					{
						break;
					}
					while (x >= m)
					{
						System.out.print(array[x][y]);
						System.out.print("\n");
						x--;
					}
					x++;
					y++;


					n++;
			}

			return 0;
	}

}

