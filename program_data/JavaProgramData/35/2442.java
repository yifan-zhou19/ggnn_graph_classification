package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int m;
	   int i;
	   int j;
	   int k;
	   int[][] sz = new int[10][10];
	   int[] max = new int[10];
	   int[] min = new int[10];
	   int[][] q = new int[10][10];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(",");
	   if (tempVar2 != null)
	   {
		   m = Integer.parseInt(tempVar2);
	   }
	   for (i = 0;i < n;i++)
	   {
		   for (j = 0;j < m;j++)
		   {
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   sz[i][j] = Integer.parseInt(tempVar3);
			   }
		   }
	   }
	   for (i = 0;i < n;i++)
	   {
		   for (j = 0;j < m;j++)
		   {
			   max[i] = sz[i][0];
			   if (sz[i][j] > max[i])
			   {
				   max[i] = sz[i][j];
			   }
			   q[i][j] = 0;
		   }
	   }
	   for (i = 0;i < m;i++)
	   {
		   for (j = 0;j < n;j++)
		   {
			   min[i] = sz[0][i];
			   if (sz[j][i] < min[i])
			   {
				   min[i] = sz[j][i];
			   }
		   }
	   }
	   for (i = 0;i < n;i++)
	   {
		   for (j = 0;j < m;j++)
		   {
			   if (max[i] == sz[i][j])
			   {
				   q[i][j]++;
			   }
			   if (min[j] == sz[i][j])
			   {
				   q[i][j]++;
			   }
		   }
	   }
	   k = 0;
	   for (i = 0;i < n;i++)
	   {
		   for (j = 0;j < m;j++)
		   {
			   if (q[i][j] == 2)
			   {
				   System.out.printf("%d+%d\n",j,i);
				   k++;
			   }
		   }
	   }
	   if (k == 0)
	   {
		   System.out.print("No");
	   }
	   return 0;
	}
}

