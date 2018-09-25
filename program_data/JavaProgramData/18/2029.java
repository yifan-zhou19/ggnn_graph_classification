package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int min;
	int n;
	int i;
	int j;
	int ans;
	int t;
	int[][] a = new int[101][101];

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (int k = 1;k <= n;k++)
	 {
		  ans = 0;
		 for (i = 0;i < n;i++)
		 {
		  for (j = 0;j < n;j++)
		  {
			a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  }
		 }

		 for (t = n;t > 1;t--)
		 {
			   for (i = 0;i < t;i++)
			   {
				   min = 10000;
				  for (j = 0;j < t;j++)
				  {
					 if ((a[i][j] < min))
					 {
						 min = a[i][j];
					 }
				  }
					for (j = 0;j < t;j++)
					{
					   a[i][j] = a[i][j] - min;
					}
			   }
			  for (i = 0;i < t;i++)
			  {
				   min = 10000;
					   for (j = 0;j < t;j++)
					   {
						   if ((a[j][i] < min))
						   {
							   min = a[j][i];
						   }
					   }
							   for (j = 0;j < t;j++)
							   {
								  a[j][i] = a[j][i] - min;
							   }
			  }
				ans = ans + a[1][1];


			 for (i = 1;i < t - 1;i++)
			 {
			  for (j = 0;j < t;j++)
			  {
				a[i][j] = a[i + 1][j];
			  }
			 }
			 for (i = 0;i < t - 1;i++)
			 {
			  for (j = 1;j < t - 1;j++)
			  {
				 a[i][j] = a[i][j + 1];
			  }
			 }

		 }
		   System.out.print(ans);
		   System.out.print("\n");
	 }
		return 0;
	}

}

