package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k = 0;
		int j;
		int[][] a = new int[5][5];
		int[] b = new int[5];
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
		   if (a[i][j] <= a[1][j] != 0 && a[i][j] <= a[2][j] != 0 && a[i][j] <= a[3][j] != 0 && a[i][j] <= a[4][j] != 0 && a[i][j] <= a[0][j] != 0 && a[i][j] >= a[i][0] != 0 && a[i][j] >= a[i][1] != 0 && a[i][j] >= a[i][2] != 0 && a[i][j] >= a[i][3] != 0 && a[i][j] >= a[i][4])
		   {
		 k = k + 1;
	   System.out.printf("%d %d %d\n",i + 1,j + 1,a[i][j]);
		   }
			   }
	   }
	   if (k == 0)
	   {
		   System.out.print("not found\n");
	   }
	}
}

