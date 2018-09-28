package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int m;
		  int n;
		  int i;
		  int j;
		  int k;
		  int l;
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
		  int[][][] a = new int[5][11][11];
		  a[0][5][5] = m;
		  for (i = 0;i < n;i++)
		  {
				for (j = 1;j <= 9;j++)
				{
					  for (k = 1;k <= 9;k++)
					  {
							a[i + 1][j - 1][k - 1] += a[i][j][k];
							a[i + 1][j - 1][k] += a[i][j][k];
							a[i + 1][j - 1][k + 1] += a[i][j][k];
							a[i + 1][j][k - 1] += a[i][j][k];
							a[i + 1][j][k + 1] += a[i][j][k];
							a[i + 1][j + 1][k - 1] += a[i][j][k];
							a[i + 1][j + 1][k] += a[i][j][k];
							a[i + 1][j + 1][k + 1] += a[i][j][k];
							a[i + 1][j][k] += (2 * a[i][j][k]);
					  }
				}
		  }
		  for (l = 1;l <= 9;l++)
		  {
				System.out.printf("%d %d %d %d %d %d %d %d %d\n",a[i][l][1],a[i][l][2],a[i][l][3],a[i][l][4],a[i][l][5],a[i][l][6],a[i][l][7],a[i][l][8],a[i][l][9]);
		  }
	}

}

