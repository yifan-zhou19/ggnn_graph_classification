package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int zong;
		int m;
		int n;
		int[][] a = new int[101][101];
		int sum1 = 0;
		int sum2 = 0;
		int sum = 0;
		zong = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= zong;i++)
		{
		   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   for (int j = 0;j < m;j++)
		   {
			   for (int k = 0;k < n;k++)
			   {
				 a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			   }
		   }
		   if (m == 1)
		   {
			   for (int i = 0;i < n;i++)
			   {
				   sum += a[0][i];
			   }
		   }
		   else if (n == 1)
		   {
			   for (int i = 0;i < m;i++)
			   {
				   sum += a[m][0];
			   }
		   }

		   else
		   {
			   for (int k = 0;k < n;++k)
			   {
			   sum1 += a[0][k] + a[m - 1][k];
			   }
				for (int j = 0;j < m;++j)
				{
					sum2 += a[j][0] + a[j][n - 1];
				}
				sum = sum1 + sum2 - a[0][0] - a[0][n - 1] - a[m - 1][0] - a[m - 1][n - 1];
		   }
				System.out.print(sum);
				System.out.print("\n");
				sum1 = 0,sum2 = 0,sum = 0;
		}
		return 0;
	}
}

