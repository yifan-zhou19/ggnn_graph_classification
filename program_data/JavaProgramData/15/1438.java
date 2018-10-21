package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int x1;
	  int y1;
	  int x2;
	  int y2;
	  int i;
	  int j;
	  int f;
	  int[][] can = new int[max][max];

	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  f = 1;
	  for (i = 1;i <= n;i++)
	  {
		  for (j = 1;j <= n;j++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  can[i][j] = Integer.parseInt(tempVar2);
			  }
			  if ((can[i][j] == 0) && (f) != 0)
			  {
				  f = 0;
				  x1 = i;
				  y1 = j;
			  }
		  }
	  }

	   for (i = x1, j = y1 + 1;(can[i][j] == 0) && (j <= n);j++)
	   {
		   ;
	   }
	   j--;
	   for (i = x1;(can[i][j] == 0) && (i <= n);i++)
	   {
		   ;
	   }
	   i--;
	   x2 = i;
	   y2 = j;
	   i = (x2 - x1 - 1) * (y2 - y1 - 1);

	   System.out.printf("%d",i);
	  return 0;
	}
}

