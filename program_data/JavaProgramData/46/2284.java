package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 int i;
		 int j;
		 int xr;
		 int sr;
		 int xc;
		 int sc;
		 int row;
		 int col;
		 int[][] matrix = new int[ROW][COL];
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
					 matrix[i][j] = Integer.parseInt(tempVar3);
				 }
			 }
		 }
		 xr = 0;
		 sr = row - 1;
		 xc = 0;
		 sc = col - 1;
		 while (xr < sr && xc < sc)
		 {
			  for (j = xc;j < sc;j++)
			  {
				  System.out.printf("%d\n",matrix[xr][j]);
			  }
			  for (i = xr;i < sr;i++)
			  {
				  System.out.printf("%d\n",matrix[i][sc]);
			  }
			  for (j = sc;j > xc;j--)
			  {
				  System.out.printf("%d\n",matrix[sr][j]);
			  }
			  for (i = sr;i > xr;i--)
			  {
				  System.out.printf("%d\n",matrix[i][xc]);
			  }
			  xr++;
			  sr--;
			  xc++;
			  sc--;
		 }
		 if (xr == sr && xc == sc)
		 {
			 System.out.printf("%d",matrix[xr][xc]);
		 }
		 else
		 {
			 if (xr == sr)
			 {
			 for (j = xc;j <= sc;j++)
			 {
				  System.out.printf("%d\n",matrix[xr][j]);
			 }
			 }
			 if (xc == sc)
			 {
				for (i = xr;i <= sr;i++)
				{
					System.out.printf("%d\n",matrix[i][sc]);
				}
			 }
		 }
	}
}

