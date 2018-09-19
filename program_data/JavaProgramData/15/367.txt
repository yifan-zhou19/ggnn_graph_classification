package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int l;
		int p;
		int q;
		int sum = 0;
		int[][] a = new int[1000][1000];
		int[] line = new int[1000];
		int[][] dij = new int[1000][1000];
		int[][] x = new int[1000][1000];
		for (k = 0;k < 1000;k++)
		{
			line[k] = 0;
			for (m = 0;m < 1000;m++)
			{
				dij[k][m] = 0;
			}

		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		   for (j = 0;j < n;j++)
		   {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   a[i][j] = Integer.parseInt(tempVar2);
			   }
			   if (a[i][j] == 0)
			   {
				   line[i] = line[i] + 1;
				   dij[i][j] = j;
			   }
		   }
		}
		for (l = 0;l < n;l++)
		{
		   if (line[l] == 2)
		   {
			  for (p = 0;p < n;p++)
			  {
				 if (dij[l][p] > 0)
				 {
					 x[l][p] = dij[l][p];
					 break;
				 }
			  }
			  for (q = 0;q < n;q++)
			  {
				 if (dij[l][q] > x[l][p])
				 {
					 x[l][q] = dij[l][q];
					 break;
				 }
			  }
			  sum = sum + x[l][q] - x[l][p] - 1;
		   }
		}
		System.out.printf("%d",sum);
	}
}

