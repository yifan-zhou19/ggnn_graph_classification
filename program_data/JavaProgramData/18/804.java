package <missing>;

public class GlobalMembers
{
	/*
	*????.cpp
	*??
	*2011?11?15?
	*?????a[1][1]????
	*/
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 1;k <= n;k++)
		{
			sum = 0;
			int[][] a = new int[n + 1][n + 1];
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			a[n][n] = a[0][0];
			for (i = 1;i < n;i++)
			{
				a[i][n] = a[i][0];
			}
			for (j = 1;j < n;j++)
			{
				a[n][j] = a[0][j];
			}
			   for (int l = 1;l < n;l++)
			   {
					for (i = l;i <= n;i++)
					{
							   m = a[i][l];
							   for (j = l + 1;j <= n;j++) //?????
							   {
									  if (m > a[i][j])
									  {
										m = a[i][j];
									  }
							   }
							   for (j = l;j <= n;j++) //??
							   {
							   a[i][j] = a[i][j] - m;
							   }
					}
					for (j = l;j <= n;j++)
					{
							m = a[l][j];
							 for (i = l + 1;i <= n;i++) //?????
							 {
									   if (m > a[i][j])
									   {
									m = a[i][j];
									   }
							 }
							 for (i = l;i <= n;i++)
							 {
								a[i][j] = a[i][j] - m;
							 }
					}
					sum = sum + a[l][l];
			   }
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

