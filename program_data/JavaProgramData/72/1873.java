package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	   int m;
	   int n;
	   int i;
	   int j;
	   int u;
	   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   int[][] a = new int[m + 2][n + 2];
		  for (i = 0 ;i < m + 2;i++)
		  {
		   for (j = 0; j < n + 2;j++)
		   {
			 a[i][j] = 0;
		   }
		  }
		 for (i = 1 ;i < m + 1;i++)
		 {
		   for (j = 1; j < n + 1;j++)
		   {
			 a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   }
		 }
		   for (i = 1;i < m + 1;i++)
		   {
			 for (j = 1;j < n + 1;j++)
			 {
				  if ((a[i][j] >= a[i - 1][j]) + (a[i][j] >= a[i + 1][j]) + (a[i][j] >= a[i][j - 1]) + (a[i][j] >= a[i][j + 1]) == 4)
				  {
				System.out.print(i - 1);
				System.out.print(" ");
				System.out.print(j - 1);
				System.out.print("\n");
				  }
			 }
		   }

			return 0;
	}

}

