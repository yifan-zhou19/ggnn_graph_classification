package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int row;
		int col;
		int rst = 0;
		int cst = 0;
		int R;
		int C;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			R = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			C = Integer.parseInt(tempVar2);
		}
		for (row = 0;row < R;row++)
		{
		   for (col = 0;col < C;col++)
		   {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  a[row][col] = Integer.parseInt(tempVar3);
			  }
		   }
		}

		for (i = 0;i < R + C - 1;i++)
		{
		   row = rst;
		   col = cst;
		   while (row != R && col != -1)
		   {
			   System.out.printf("%d\n",a[row][col]);
			   row++;
			   col--;
		   }
		   if (cst != C - 1)
		   {
			   cst++;
		   }
		   else
		   {
			   rst++;
		   }
		}

	  return 0;
	}

}

