package <missing>;

public class GlobalMembers
{
	public static final int MAX = 100;

	public static int Main()
	{
		 int k;
		 int[][] A = new int[MAX][MAX];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 k = Integer.parseInt(tempVar);
		 }
		 for (int i = 0; i < k; i++)
		 {
				 int m;
				 int n;
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 m = Integer.parseInt(tempVar2);
				 }
				 String tempVar3 = ConsoleInput.scanfRead();
				 if (tempVar3 != null)
				 {
					 n = Integer.parseInt(tempVar3);
				 }
				 for (int i = 0; i < m; i++)
				 {
						 for (int j = 0; j < n; j++)
						 {
								 String tempVar4 = ConsoleInput.scanfRead();
								 if (tempVar4 != null)
								 {
									 A[i][j] = Integer.parseInt(tempVar4);
								 }
						 }
				 }
				 int sum = 0;
			 /*
			 	if((m = 1)||(n = 1))
			 	{
					   for(int i = 0; i < m; i++)
					   {
								 for(int j = 0; j < n; j++)
								 {
										 sum += A[i][j];						   		  
								 }
						  }			 	  			 	  
				 }
			 	else
			 {
	
			 */	

			 if ((m != 1) && (n != 1))
			 {
				 for (int j = 0; j < n; j++)
				 {
						 sum += A[0][j];

				 }
				for (int j = 0; j < n; j++)
				{
						 sum += A[m - 1][j];
				}
				 for (int i = 0; i < m; i++)
				 {
						 sum += A[i][0];

				 }
				 for (int i = 0; i < m ; i++)
				 {
						 sum += A[i][n - 1];
				 }
				sum = sum - A[0][0] - A[0][n - 1] - A[m - 1][0] - A[m - 1][n - 1];
			 }
		  //  }
		  else
		  {
				 for (int i = 0; i < m; i++)
				 {
					 for (int j = 0; j < n; j++)
					 {
							sum += A[i][j];
					 }
				 }
		  }
				System.out.printf("%d\n", sum);
		 }
			 return 0;
	}

}

