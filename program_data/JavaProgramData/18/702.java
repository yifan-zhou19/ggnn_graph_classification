package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][][] a = new int[100][100][100];
	 int[][] min = new int[100][100];
	 int n;
	 int i;
	 int j;
	 int k;
	 int l;
	 int s;
	 int[] sum = new int[100];
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (i = 0;i < n;i++)
	 {
		  for (j = 0;j < n;j++)
		  {
			for (k = 0;k < n;k++)
			{
		a[i][j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		  }
	 }
	 for (i = 0;i < n;i++)
	 {
		   for (s = n;s > 1;s--)
		   {
		   for (j = 0;j < s;j++)
		   {
			 min[i][j] = a[i][j][0];
						  for (l = 0;l < s;l++)
						  {
							  if (a[i][j][l] < min[i][j])
							  {
							min[i][j] = a[i][j][l];
							  }
						  }
							for (k = 0;k < s;k++)
							{
							a[i][j][k] = a[i][j][k] - min[i][j];
							}
		   }
	  for (k = 0;k < s;k++)
	  {
		   min[i][k] = a[i][0][k];
		 for (l = 0;l < s;l++)
		 {
							  if (a[i][l][k] < min[i][k])
							  {
							min[i][k] = a[i][l][k];
							  }
		 }
	   for (j = 0;j < s;j++)
	   {
		 a[i][j][k] = a[i][j][k] - min[i][k];
	   }
	  }
	   sum[i] = sum[i] + a[i][1][1];
	   for (j = 0;j < s;j++)
	   {
		   for (k = 1;k < s - 1;k++)
		   {
		a[i][j][k] = a[i][j][k + 1];
		   }
	   }
	   for (k = 0;k < s - 1;k++)
	   {
		   for (j = 1;j < s - 1;j++)
		   {
		 a[i][j][k] = a[i][j + 1][k];
		   }
	   }
		   }
	 }
	   for (i = 0;i < n;i++)
	   {
		System.out.print(sum[i]);
		System.out.print("\n");
	   }
		return 0;
	}


}

