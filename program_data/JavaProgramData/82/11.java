package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int k;
	  int row;
	  int col;
	  int x;
	  int y;
	  int a;
	  int[][] sz = new int[100][2];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  if ((n > 0) && (n < 100))
	  {
	  for (row = 0;row < n;row++)
	  {
		  for (col = 0;col < 2;col++)
		  {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  (sz[row][col]) = Integer.parseInt(tempVar2);
	  }
		  }
	  }
	  k = 0;
	  a = 0;
	  for (row = 0;row < n;row++)
	  {
		  x = sz[row][0];
		  y = sz[row][1];
		  if ((x >= 90) && (x <= 140) && (y >= 60) && (y <= 90))
		  {
	  k++;
		  }
	  else if (a < k)
	  {
			  a = k;
						k = 0;
	  }
	  else if (a >= k)
	  {
	k = 0;
	  }
	  }
	if (a < k)
	{
		a = k;
	}
	System.out.printf("%d", a);
	  }

		return 0;
	}

}

