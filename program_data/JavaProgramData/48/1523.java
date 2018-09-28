package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[11][11];
	public static int[][] b = new int[11][11];
	public static int sum(int x,int y)
	{
		b[x][y] = a[x - 1][y - 1] + a[x - 1][y] + a[x - 1][y + 1] + a[x][y - 1] + a[x][y + 1] + a[x + 1][y - 1] + a[x + 1][y] + a[x + 1][y + 1] + 2 * a[x][y];
		return b[x][y];
	}
	public static int Main()
	{
	  int m;
	  int n;
	  int i;
	  int j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  n = Integer.parseInt(tempVar2);
	  }
	  a[5][5] = m;
	  for (int k = 1;k <= n;k++)
	  {
	  for (i = 5 - k;i <= 5 + k;i++)
	  {
		for (j = 5 - k;j <= 5 + k;j++)
		{
		  b[i][j] = sum(i, j);
		}
	  }
	  for (int q = 0;q < 11;q++)
	  {
		for (int p = 0;p < 11;p++)
		{
		a[q][p] = b[q][p];
		}
	  }
	  }
	  for (i = 1;i < 10;i++)
	  {
		for (j = 1;j < 9;j++)
		{
		System.out.printf("%d ",b[i][j]);
		}
		System.out.printf("%d\n",b[i][j]);
	  }
	 return 0;
	}

}

