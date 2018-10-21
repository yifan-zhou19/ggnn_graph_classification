package <missing>;

public class GlobalMembers
{
	//????  ???  12858

	public static int Main()
	{
		int i; //dirx,diry????   x,y?????   step????????
		int j;
		int c;
		int dirx;
		int diry;
		int x;
		int y;
		int row;
		int col;
		int step;
		int[][] a = new int[101][101]; //a??????,b??????????
		int[][] b = new int[101][101];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= row; i++)
		{
			for (j = 1;j <= col; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				b[i][j] = 1;
			}
		}
		x = 1;
		y = 0;
		dirx = 0;
		diry = 1; //??????????
		step = 0;
		while (step < (col * row))
		{
			while (b[x + dirx][y + diry] == 1) //?????
			{
				x += dirx;
				y += diry;
				b[x][y] = 0;
				step++;
				System.out.print(a[x][y]);
				System.out.print("\n");
			}
			if ((dirx == 1) && (diry == 0)) //???????
			{
				dirx = 0;
				diry = -1;
			}
			else
			{
				if ((dirx == 0) && (diry == 1))
				{
					dirx = 1;
					diry = 0;
				}
				else
				{
					if ((dirx == -1) && (diry == 0))
					{
						dirx = 0;
						diry = 1;
					}
					else if ((dirx == 0) && (diry == -1))
					{
						dirx = -1;
						diry = 0;
					}
				}
			}
		}
		return 0;
	}



}

