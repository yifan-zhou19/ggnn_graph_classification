package <missing>;

public class GlobalMembers
{
	public static int max(int x,int y)
	{
		if (x >= y)
		{
		return x;
		}
		else
		{
		return y;
		}
	}

	public static int Main()
	{
		  int[][] a = new int[5][5];
		  int[][] b = new int[5][5];
		  int i;
		  int j;
		  int k = 0;
		  for (i = 0;i < 5;i++)
		  {
						  for (j = 0;j < 5;j++)
						  {
						  String tempVar = ConsoleInput.scanfRead();
						  if (tempVar != null)
						  {
							  a[i][j] = Integer.parseInt(tempVar);
						  }
						  }
		  }
		  for (i = 0;i < 5;i++)
		  {
						  for (j = 0;j < 5;j++)
						  {
						  b[i][j] = 0;
						  }
		  }
		  for (i = 0;i < 5;i++)
		  {
						  for (j = 0;j < 5;j++)
						  {
										  if (a[i][j] >= a[i][0] != 0 && a[i][j] >= a[i][1] != 0 && a[i][j] >= a[i][2] != 0 && a[i][j] >= a[i][3] != 0 && a[i][j] >= a[i][4])
										  {
										  b[i][j]++;
										  }
						  }
		  }
		  for (i = 0;i < 5;i++)
		  {
						  for (j = 0;j < 5;j++)
						  {
										  if (a[i][j] <= a[0][j] != 0 && a[i][j] <= a[1][j] != 0 && a[i][j] <= a[2][j] != 0 && a[i][j] <= a[3][j] != 0 && a[i][j] <= a[4][j])
										  {
										  b[i][j]++;
										  }
						  }
		  }
		  for (i = 0;i < 5;i++)
		  {
						  for (j = 0;j < 5;j++)
						  {
										  if (b[i][j] == 2)
										  {
														System.out.printf("%d %d %d\n",i + 1,j + 1,a[i][j]);
														k = 1;
										  }
						  }
		  }
		  if (k == 0)
		  {
		  System.out.print("not found\n");
		  }
	}
}

