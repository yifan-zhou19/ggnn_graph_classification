package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int[][][] a = new int[11][11][5];
		 int m;
		 int n;
		 int i;
		 int j;
		 int k;
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
		 for (i = 0;i < 11;i++)
		 {
						  for (j = 0;j < 11;j++)

						  {
							   for (k = 0;k < 5;k++)
							   {
							   a[i][j][k] = 0;
							   }
						  }
		 }

		 a[5][5][0] = m;

		 for (k = 0;k < n;k++)
		 {
				  for (i = 5 - k;i <= 5 + k;i++)
				  {
				   for (j = 5 - k;j <= 5 + k;j++)
				   {
						a[i][j][k + 1] += 2 * a[i][j][k];
						a[i - 1][j - 1][k + 1] += a[i][j][k];
						a[i][j - 1][k + 1] += a[i][j][k];
						a[i - 1][j][k + 1] += a[i][j][k];
						a[i - 1][j + 1][k + 1] += a[i][j][k];
						a[i + 1][j - 1][k + 1] += a[i][j][k];
						a[i][j + 1][k + 1] += a[i][j][k];
						a[i + 1][j][k + 1] += a[i][j][k];
						a[i + 1][j + 1][k + 1] += a[i][j][k];
				   }
				  }
		 }
		 for (i = 1;i < 10;i++)
		 {
			  for (j = 1;j < 10;j++)
			  {
				   if (j != 9)
				   {
				   System.out.printf("%d ",a[i][j][n]);
				   }
				   else
				   {
					   System.out.printf("%d\n",a[i][j][n]);
				   }
			  }
		 }

		 return 0;
	}

}

