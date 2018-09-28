package <missing>;

public class GlobalMembers
{
	public static void stubid(int x, int y, int[][] z)
	{
	  for (int i = 0;i < x;i++)
	  {
		for (int j = 0;j < y;j++)
		{
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   z[i][j] = Integer.parseInt(tempVar);
		   }
		}
	  }
	}
	public static int Main()
	{
	  int[][] a = new int[150][150];
	  int[][] b = new int[150][150];
	  int m;
	  int n;
	  int p;
	  int q;
	  int i;
	  int j;
	  int k;
	  int z;
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
	  stubid(m, n, a);
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  q = Integer.parseInt(tempVar3);
	  }
	  String tempVar4 = ConsoleInput.scanfRead(" ");
	  if (tempVar4 != null)
	  {
		  p = Integer.parseInt(tempVar4);
	  }
	  stubid(n, p, b);
	  for (i = 0;i < m;i++)
	  {
		 for (j = 0;j < p;j++)
		 {
			 z = 0;
			 for (k = 0;k < n;k++)
			 {
				z = z + a[i][k] * b[k][j];
			 }
			 if (j < p - 1)
			 {
				System.out.printf("%d ",z);
			 }
			 else if (j == p - 1 && i < m - 1)
			 {
				System.out.printf("%d\n",z);
			 }
			 else
			 {
				System.out.printf("%d",z);
			 }
		 }
	  }
		return 0;
	}
}

