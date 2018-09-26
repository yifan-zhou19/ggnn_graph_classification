package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int t;
		 int n;
		 int m;
		 int i;
		 int[][] a = new int[100][100];
		 int j;
		 int k;
		 int sum;
		 t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 int[] p = new int[100];
		 for (i = 0;i < t;i++)
		 {
			 sum = 0;
			 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 for (j = 0;j < n;j++)
			 {
				  for (k = 0;k < m;k++)
				  {
					   a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				  }
			 }
			 p = a;
			 if (n == 1 || m == 1 || m == 2 || n == 2)
			 {
				  for (j = 0;j < n;j++)
				  {
					  for (k = 0;k < m;k++)
					  {
						   sum = sum + *(p[j] + k);
					  }
				  }
			 }
			  else
			  {
				   for (k = 0;k < m;k++)
				   {
						  sum = sum + *(p[0] + k) + *(p[n - 1] + k);
				   }
				   for (j = 1;j < n - 1;j++)
				   {
						  sum = sum + *(p[j] + 0) + *(p[j] + m - 1);
				   }
			  }
			  System.out.print(sum);
			  System.out.print("\n");
		 }
		 return 0;
	}
}

