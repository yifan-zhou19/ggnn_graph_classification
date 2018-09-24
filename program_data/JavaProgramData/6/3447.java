package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int i;
		int j;
		int k;
		int m;
		int n;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int p = 0;p < k;p++)
		{
			int sum = 0;
			int sum1 = 0;
			int sum2 = 0;
			int sum3 = 0;
			int sum4 = 0;
			 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 for (i = 0;i < m;i++)
			 {
				for (j = 0;j < n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			 }
			if (n == 1 && m != 1)
			{
				for (i = 0;i < m;i++)
				{
					sum = sum + a[i][0];
				}
				System.out.print(sum);
				System.out.print("\n");
			}
		  else if (m == 1 && n != 1)
		  {
				for (i = 0;i < n;i++)
				{
				 sum = sum + a[0][i];
				}
				System.out.print(sum);
				System.out.print("\n");
		  }
			else if (m == 1 && n == 1)
			{
				System.out.print(a[0][0]);
				System.out.print("\n");
			}
		else
		{

			for (i = 0;i < n;i++)
			{
				sum1 = sum1 + a[0][i];
				sum2 = sum2 + a[m - 1][i];
			}
			 for (i = 0;i < m;i++)
			 {
				sum3 = sum3 + a[i][0];
				sum4 = sum4 + a[i][n - 1];
			 }
			 sum = sum1 + sum2 + sum3 + sum4 - (a[0][0] + a[0][n - 1] + a[m - 1][0] + a[m - 1][n - 1]);
			 System.out.print(sum);
			 System.out.print("\n");
		}
		}
		 return 0;
	}
}

