package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int a;
	  int b;
	  int c;
	  int d;
	  int sum;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int[][] sz = new int[100][100];
	  int row;
	  int col;
	  for (row = 0;row < n;row++)
	  {
		 for (col = 0;col < n;col++)
		 {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[row][col]) = Integer.parseInt(tempVar2);
			}
		 }
	  }
	  for (row = 0;row < n;row++)
	  {
		 for (col = 0;col < n;col++)
		 {
		   if (sz[row][col] == 0 && sz[row][col + 1] == 255)
		   {
			  a = row;
			  b = col;
			  break;
		   }
		 }
	  }
	   for (row = n - 1;row > 0;row--)
	   {
		 for (col = n - 1;col > 0;col--)
		 {
		   if (sz[row][col] == 0 && sz[row][col - 1] == 255)
		   {
			 c = row;
			 d = col;
			 break;
		   }
		 }
	   }
	  sum = (c - a + 1) * (d - b + 1);
	  System.out.printf("%d",sum);
	  return 0;
	}

}

