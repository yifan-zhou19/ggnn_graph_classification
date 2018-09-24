package <missing>;

public class GlobalMembers
{
	public static int[][] matrix = new int[100][100];
	public static void change(int k, int n) //????????????
	{
		matrix[k + 1][k + 1] = matrix[k][k];
		int i = 0;
		if (n - 1 >= k + 2)
		{
			for (i = k + 2 ; i <= n - 1 ; i++)
			{
				 matrix[k + 1][i] = matrix[k][i];
			}
			for (i = k + 2 ; i <= n - 1 ; i++)
			{
				 matrix[i][k + 1] = matrix[i][k];
			}
		}
	}
	public static int Main()
	{
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int m = 0;
		int[] sum = new int[100];
		for (m = 0 ; m <= n - 1 ; m++)
		{

			 int i = 0;
			 int j = 0;
			 for (i = 0 ; i <= n - 1 ; i++)
			 {
				  for (j = 0 ; j <= n - 1 ; j++)
				  {
					   matrix[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				  }
			 }
			 int k = 0;
			 for (k = 0 ; k <= n - 2 ; k++)
			 {
				  int min = 10000;
				  for (i = k ; i <= n - 1 ; i++) //?????????
				  {
					   min = 10000;
					   for (j = k ; j <= n - 1 ; j++)
					   {
							if (matrix[i][j] < min)
							{
								min = matrix[i][j];
							}
					   }
					   for (j = k ; j <= n - 1 ; j++)
					   {
							matrix[i][j] = matrix[i][j] - min;
					   }
				  }
				  for (j = k ; j <= n - 1 ; j++) //??????????
				  {
					   min = 10000;
					   for (i = k ; i <= n - 1 ; i++)
					   {
							if (matrix[i][j] < min)
							{
								min = matrix[i][j];
							}
					   }
					   for (i = k ; i <= n - 1 ; i++)
					   {
							matrix[i][j] = matrix[i][j] - min;
					   }
				  }
				  sum[m] = sum[m] + matrix[k + 1][k + 1]; //????????????????
				  change(k, n);
			 }
		}
		for (m = 0 ; m <= n - 1 ; m++)
		{
			 System.out.print(sum[m]);
			 System.out.print("\n");
		}
		return 0;
	}

}

