package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[][] a = new int[5][5];
		  int[] b = new int[5];
		  int i;
		  int j;
		  int k;
		  int x;
		  int m;
		  int y = 0;
		  for (i = 0;i <= 4;i++)
		  {
			  for (j = 0;j <= 4;j++)
			  {
				  String tempVar = ConsoleInput.scanfRead();
				  if (tempVar != null)
				  {
					  a[i][j] = Integer.parseInt(tempVar);
				  }
			  }
		  }
		  for (i = 0;i <= 4;i++)
		  {
			  x = a[i][0],m = 0;
			  for (j = 0;j <= 4;j++)
			  {
				  if (x < a[i][j])
				  {
					  x = a[i][j];
					  m = j;
				  }
			  }
			  for (k = 0;k <= 4;k++)
			  {
				  if (a[i][m] > a[k][m])
				  {
				  break;
				  }
				  else
				  {
					  b[i] = b[i] + 1;
				  }
			  }
			  if (b[i] == 5)
			  {
				  y = y + 1;
				  System.out.printf("%d %d %d\n",i + 1,m + 1,a[i][m]);
			  }
		  }
		  if (y == 0)
		  {
			  System.out.print("not found\n");
		  }
	}

}

