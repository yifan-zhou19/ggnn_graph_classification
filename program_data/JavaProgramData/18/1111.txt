package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int r;
		int[][] a = new int[101][101];
		int min;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 1;k <= n;k++)
		{
			sum = 0;
			r = n;
			for (int i = 1;i <= n;i++)
			{
				for (int j = 1;j <= n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (int l = 1;l <= n - 2;l++)
			{
				for (int i = 1;i <= r;i++)
				{
					min = a[i][1];
					for (int j = 1;j <= r;j++)
					{
					  if (a[i][j] < min)
					  {
						  min = a[i][j];
					  }
					}
				   for (int j = 1;j <= r;j++)
				   {
						 a[i][j] = a[i][j] - min;
				   }
				}
				   for (int i = 1;i <= r;i++)
				   {
					 min = a[1][i];
					   for (int j = 1;j <= r;j++)
					   {
						 if (a[j][i] < min)
						 {
							 min = a[j][i];
						 }
					   }
					  for (int j = 1;j <= r;j++)
					  {
					   a[j][i] = a[j][i] - min;
					  }
				   }
			sum += a[2][2];
				  for (int i = 2;i <= r - 1;i++)
				  {
					 for (int j = 1;j <= r;j++)
					 {
						 a[i][j] = a[i + 1][j];
					 }
				  }
				  for (int i = 2;i <= r - 1;i++)
				  {
					 for (int j = 1;j <= r - 1;j++)
					 {
						 a[j][i] = a[j][i + 1];
					 }
				  }
			r--;
			}
			for (int i = 1;i <= 2;i++)
			{
				min = a[i][1];
				for (int j = 1;j <= 2;j++)
				{
					if (a[i][j] < min)
					{
						min = a[i][j];
					}
				}
				for (int j = 1;j <= 2;j++)
				{
					a[i][j] = a[i][j] - min;
				}
			}
			for (int i = 1;i <= 2;i++)
			{
				min = a[1][i];
				for (int j = 1;j <= 2;j++)
				{
					if (a[j][i] < min)
					{
						min = a[j][i];
					}
				}
				for (int j = 1;j <= 2;j++)
				{
					a[j][i] = a[j][i] - min;
				}
			}
			sum += a[2][2];
			System.out.print(sum);
			System.out.print("\n");
		}
	}

}

