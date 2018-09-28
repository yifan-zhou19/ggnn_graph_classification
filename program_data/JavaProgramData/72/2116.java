package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int m;
	  int n;
	  int i;
	  int j;
	  int k = 0;
	  int[][] ht = new int[40][40];
	  int[] aa = new int[400];
	  int[] bb = new int[400];
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
	   for (i = 0;i <= m;i++)
	   {
		   ht[i][0] = 0;
	   }
	   for (j = 0;j <= n;j++)
	   {
		   ht[m + 1][j] = 0;
	   }
	   for (i = m + 1;i > 0;i--)
	   {
		   ht[i][n + 1] = 0;
	   }
	   for (j = n + 1;j > 0;j--)
	   {
		   ht[0][j] = 0;
	   }

	   for (i = 1;i <= m;i++)
	   {
		 for (j = 1;j <= n;j++)
		 {
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				ht[i][j] = Integer.parseInt(tempVar3);
			}
		 }
	   }
	   for (i = 1;i <= m;i++)
	   {
		   for (j = 1;j <= n;j++)
		   {
			  if (ht[i][j] >= ht[i - 1][j] != 0 && ht[i][j] >= ht[i + 1][j] != 0 && ht[i][j] >= ht[i][j - 1] != 0 && ht[i][j] >= ht[i][j + 1])
			  {
			   System.out.printf("%d %d\n",i - 1,j - 1);
			  }
		   }
	   }

		 return 0;
	}
}

