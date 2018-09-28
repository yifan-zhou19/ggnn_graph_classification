package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int q;
		int[][] a = new int[100][100];
		int sum = 0;
		int[] p = a; //??a???????
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < q;i++)
		{
				sum = 0;
				m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				for (int j = 0;j < m;j++)
				{
				   for (int k = 0;k < n;k++)
				   {
					  a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				   }
				}
				for (int j = 0;j < m;j++)
				{
				   for (int k = 0;k < n;k++) //??????
				   {
						   if (j == 0 || j == m - 1)
						   {
							   sum += p[j][k];
						   }
						   else
						   {
								if (k == 0 || k == n - 1)
								{
									sum += p[j][k];
								}
						   }
				   }
				}
				System.out.print(sum);
				System.out.print("\n");
		}
		return 0;
	}

}

