package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int j;
	  int k;
	  int m;
	  int n;
	  int q;
	  int[][] a = new int[100][100];
	  int[][] b = new int[100][100];
	  int[][] c = new int[100][100];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  q = Integer.parseInt(tempVar2);
	  }
		for (int x = 0;x < m;x++)
		{
		  for (int y = 0;y < q;y++)
		  {
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[x][y] = Integer.parseInt(tempVar3);
			}
		  }
		}
	  String tempVar4 = ConsoleInput.scanfRead();
	  if (tempVar4 != null)
	  {
		  q = Integer.parseInt(tempVar4);
	  }
	  String tempVar5 = ConsoleInput.scanfRead();
	  if (tempVar5 != null)
	  {
		  n = Integer.parseInt(tempVar5);
	  }
		for (int x = 0;x < q;x++)
		{
		  for (int y = 0;y < n;y++)
		  {
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				b[x][y] = Integer.parseInt(tempVar6);
			}
		  }
		}
	  for (i = 0;i < m;i++)
	  {
		 for (j = 0;j < n;j++)
		 {
			  c[i][j] = 0;
			  for (k = 0;k < q;k++)
			  {
				c[i][j] += a[i][k] * b[k][j];
			  }
		 }
	  }
	  for (int x = 0;x < m;x++)
	  {
		 for (int y = 0;y < n;y++)
		 {
			if (y < n - 1)
			{
			 System.out.printf("%d ",c[x][y]);
			}
			else
			{
			 System.out.printf("%d\n",c[x][y]);
			}
		 }
	  }
	}
}

