package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   int i;
		   int j;
		   int row;
		   int col;
		   int k;
		   int[][] a = new int[100][100];
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
		   for (i = 0;i < row;i++)
		   {
				   for (j = 0;j < col;j++)
				   {
						   String tempVar3 = ConsoleInput.scanfRead();
						   if (tempVar3 != null)
						   {
							   (a[i][j]) = Integer.parseInt(tempVar3);
						   }
				   }
		   }
		   for (k = 0;k < ((col + col % 2) / 2);k++)
		   {
				if (k > row - k - 1)
				{
					continue;
				}
				 for (i = k;i < col - k;i++)
				 {
								   System.out.printf("%d\n",a[k][i]);
				 }
				if (k + 1 > row - k - 1)
				{
					continue;
				}
				   for (j = k + 1;j <= row - k - 1;j++)
				   {
								   System.out.printf("%d\n",a[j][col - k - 1]);
				   }
				if (col - k - 2 < k)
				{
					continue;
				}
				   for (i = col - k - 2;i >= k;i--)
				   {
								   System.out.printf("%d\n",a[row - k - 1][i]);
				   }
				   for (j = row - 2 - k;j >= k + 1;j--)
				   {
								   System.out.printf("%d\n",a[j][k]);
				   }
		   }
		   return 0;
	}



}

