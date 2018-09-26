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
	 int[][][] A = new int[5][9][9];
		for (j = 0;j < 9;j++)
		{
		for (k = 0;k < 9;k++)
		{
		 A[0][j][k] = 0;
		}

	   A[0][4][4] = m;
		}

	  for (i = 0;i < n;i++)
	  {

		 for (k = 1;k < 8;k++)
		 {
					  A[i + 1][0][k] = A[i][0][k - 1] + A[i][0][k + 1] + A[i][1][k] + A[i][1][k + 1] + A[i][1][k - 1];
		 }


		 for (k = 1;k < 8;k++)
		 {
					  A[i + 1][8][k] = A[i][8][k - 1] + A[i][8][k + 1] + A[i][7][k] + A[i][7][k + 1] + A[i][7][k - 1];
		 }


		 for (j = 1;j < 8;j++)
		 {
					  A[i + 1][j][0] = A[i][j + 1][0] + A[i][j - 1][0] + A[i][j + 1][1] + A[i][j - 1][1] + A[i][j][1];
		 }


		 for (j = 1;j < 8;j++)
		 {
				A[i + 1][j][8] = A[i][j + 1][8] + A[i][j - 1][8] + A[i][j + 1][7] + A[i][j - 1][7] + A[i][j][7];
		 }


		 A[i + 1][0][0] = A[i][1][1] + A[i][1][0] + A[i][0][1];



		 A[i + 1][8][0] = A[i][7][1] + A[i][7][0] + A[i][8][1];

		 A[i + 1][8][8] = A[i][8][7] + A[i][7][8] + A[i][7][7];



		 A[i + 1][0][8] = A[i][0][8] + A[i][1][8] + A[i][1][7];

			 for (j = 1;j < 8;j++)
			 {
	   for (k = 1;k < 8;k++)
	   {
		A[i + 1][j][k] = 2 * A[i][j][k] + A[i][j - 1][k] + A[i][j + 1][k] + A[i][j][k - 1] + A[i][j][k + 1] + A[i][j - 1][k - 1] + A[i][j + 1][k - 1] + A[i][j - 1][k + 1] + A[i][j + 1][k + 1];
	   }

			 }
	  }

	   for (j = 0;j < 9;j++)
	   {
				for (k = 0;k < 8;k++)
				{
					   System.out.printf("%d ",A[n][j][k]);
				}
		   System.out.printf("%d\n",A[n][j][k]);
	   }



	 return 0;
	}
}

