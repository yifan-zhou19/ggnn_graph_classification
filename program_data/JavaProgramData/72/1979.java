package <missing>;

public class GlobalMembers
{
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
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  n = Integer.parseInt(tempVar2);
	  }
	  int[][] sz = new int[m + 2][n + 2];
	  for (i = 1;i <= m;i++)
	  {
	   for (j = 1;j <= n;j++)
	   {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   sz[i][j] = Integer.parseInt(tempVar3);
		   }
	   }
	  }
	  for (i = 0;i <= n + 1;i++)
	  {
		  sz[0][i] = sz[m + 1][i] = 0;
	  }
	  for (i = 0;i <= m + 1;i++)
	  {
		  sz[i][0] = sz[i][n + 1] = 0;
	  }
	  int s = 0;
	  int l = 0;
	  for (i = 1;i <= m;i++)
	  {
	   for (j = 1;j <= n;j++)
	   {
		   if ((sz[i - 1][j] <= sz[i][j]) && (sz[i + 1][j] <= sz[i][j]) && (sz[i][j - 1] <= sz[i][j]) && (sz[i][j + 1] <= sz[i][j]))
		   {
		   System.out.printf("%d %d\n",i - 1,j - 1);
		   }
	   }
	  }

	  return 0;
	}
}

