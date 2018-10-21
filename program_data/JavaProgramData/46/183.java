package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   int row;
		   int col;
		   int i;
		   int j;
		   int a;
		   int b;
		   int c;
		   int k;
		   int temp;
		   int[][] sz = new int[100][100];
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   row = Integer.parseInt(tempVar);
		   }
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   col = Integer.parseInt(tempVar2);
		   }
		   if (row > col)
		   {
				   temp = col;
		   }
		   else
		   {
				   temp = row;
		   }
		   for (i = 0;i < row;i++)
		   {
				   for (j = 0;j < col;j++)
				   {
						   String tempVar3 = ConsoleInput.scanfRead();
						   if (tempVar3 != null)
						   {
							   sz[i][j] = Integer.parseInt(tempVar3);
						   }
				   }
		   }
		   for (a = 0;a < ((temp + 1) / 2);a++)
		   {
				   for (i = a;i < col;i++)
				   {
						   System.out.printf("%d\n",sz[a][i]);
				   }
				   col -= 1;
				   for (j = a + 1;j < row;j++)
				   {
						   System.out.printf("%d\n",sz[j][col]);
				   }
				   row -= 1;
				   if (row == a)
				   {
						   break;
				   }
				   for ((k = col - 1);k >= a;k--)
				   {
						   System.out.printf("%d\n",sz[row][k]);
				   }
				   b = k + 1;
					if (col == a)
					{
						   break;
					}

				   for ((c = row - 1);c >= a + 1;c--)
				   {
								   System.out.printf("%d\n",sz[c][b]);
				   }

		   }
		   return 0;
	}
}

