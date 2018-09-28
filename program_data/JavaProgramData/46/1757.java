package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] visit = new int[105][105];
		int[][] num = new int[105][105];
		int i;
		int j;
		int row;
		int col;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 0; i < row; i++)
		{
				for (j = 0; j < col; j++)
				{
						visit[i][j] = 0;
						String tempVar3 = ConsoleInput.scanfRead();
						if (tempVar3 != null)
						{
							num[i][j] = Integer.parseInt(tempVar3);
						}
				}
		}
		int direct = right;
		int x = 0;
		int y = 0;
		while (true)
		{
				 if (x < 0 || x >= row != 0 || y < 0 || y >= col != 0 || visit[x][y] == 1)
				 {
					 break;
				 }
				 visit[x][y] = 1;
				 System.out.printf("%d\n",num[x][y]);
				 switch (direct)
				 { //???????????????
						 case up: //???????????????
							  if (x - 1 < 0 || visit[x - 1][y] == 1)
							  {
								   direct = (direct + 1) % 4;
							  }
							  break;
						 case down:
							  if (x + 1 >= row != 0 || visit[x + 1][y] == 1)
							  {
								   direct = (direct + 1) % 4;
							  }
							  break;
						 case left:
							  if (y - 1 < 0 || visit[x][y - 1] == 1)
							  {
								   direct = (direct + 1) % 4;
							  }
							  break;
						 case right:
							  if (y + 1 >= col != 0 || visit[x][y + 1] == 1)
							  {
								   direct = (direct + 1) % 4;
							  }
							  break;
						 default:
							 break;
				 }
				 switch (direct)
				 {
						 case up:
							 x--;
							 break;
						 case down:
							 x++;
							 break;
						 case left:
							 y--;
							 break;
						 case right:
							 y++;
							 break;
						 default:
							 break;
				 }
		}
		return 0;
	}
}

