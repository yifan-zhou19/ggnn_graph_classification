package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[][] A = new int[100][100];
	  int m;
	  int n;
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
	  for (int i = 0;i < m + 2;i++)
	  {
		  for (int j = 0;j < n + 2;j++)
		  {
			  if (i == 0 || j == 0 || i == m + 1 || j == n + 1)
			  {
				  A[i][j] = 0;
			  }
			  else
			  {
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  (A[i][j]) = Integer.parseInt(tempVar3);
				  }
			  }

		  }
	  }
	  for (int i = 1;i < m + 1;i++)
	  {
		  for (int j = 1;j < n + 1;j++)
		  {
			 if (A[i][j] >= A[i - 1][j] != 0 && A[i][j] >= A[i][j - 1] != 0 && A[i][j] >= A[i + 1][j] != 0 && A[i][j] >= A[i][j + 1])
			 {
					System.out.printf("%d ",i - 1);
				  System.out.printf("%d\n",j - 1);
			 }
		  }
	  }

	return 0;
	}


}

