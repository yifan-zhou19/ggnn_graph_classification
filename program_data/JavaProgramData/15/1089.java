package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[][] a = new int[ROW][COL];
	   int row;
	   int col;
	   int n;
	   int b = 0;
	   int c;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (row = 0;row < n;row++)
	   {
		   for (col = 0;col < n;col++)
		   {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   a[row][col] = Integer.parseInt(tempVar2);
			   }
		   }
	   }
	for (row = 0;row < n;row++)
	{
		   for (col = 0;col < n;col++)
		   {
			   if (a[row][col] == 0)
			   {
			   b++;
			   }
		   }
	}
	c = (b - 4) * (b - 4) / 16;
	System.out.printf("%d",c);
	return 0;
	}

}

